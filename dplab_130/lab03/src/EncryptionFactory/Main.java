package EncryptionFactory;
import Encryptions.*;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        EncryptionService encryptionService = new EncryptionService();

        System.out.println("Select Encryption Algorithm:");
        System.out.println("1. AES Encryption");
        System.out.println("2. DES Encryption");
        System.out.println("3. Caesar Cipher");
        int choice = scanner.nextInt();

        System.out.print("Enter input file path: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter output file path for encrypted data: ");
        String encryptedFile = scanner.nextLine();

        System.out.print("Enter output file path for decrypted data: ");
        String decryptedFile = scanner.nextLine();


        switch(choice)
        {
            case 1:

                AES aes = new AES();
                aes.init();
                encryptionService.setAlgorithm(aes);
                break;
            case 2:

                DES des = new DES();
                encryptionService.setAlgorithm(des);
                break;
            case 3:

                System.out.print("Enter shift value for Caesar Cipher: ");
                int shift = scanner.nextInt();
                CaesarCipher caesar = new CaesarCipher(shift);
                encryptionService.setAlgorithm(caesar);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        encryptionService.encryptFile(inputFile, encryptedFile);
        System.out.println("File encrypted successfully!");


        encryptionService.decryptFile(encryptedFile, decryptedFile);
        System.out.println("File decrypted successfully!");

        scanner.close();
    }
}
