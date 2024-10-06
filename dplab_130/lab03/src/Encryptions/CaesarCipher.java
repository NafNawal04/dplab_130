package Encryptions;
import EncryptionFactory.IEncryptionAlgorithm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CaesarCipher implements IEncryptionAlgorithm {
    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    public void encryptFile(String inputFilePath, String outputFilePath) throws Exception {
        File inputFile = new File(inputFilePath);
        String content = new String(readFileToBytes(inputFile));
        String encryptedContent = applyCaesarCipher(content, shift);
        writeBytesToFile(outputFilePath, encryptedContent.getBytes());
    }

    @Override
    public void decryptFile(String inputFilePath, String outputFilePath) throws Exception {
        File inputFile = new File(inputFilePath);
        String content = new String(readFileToBytes(inputFile));
        String decryptedContent = applyCaesarCipher(content, -shift);
        writeBytesToFile(outputFilePath, decryptedContent.getBytes());
    }

    private String applyCaesarCipher(String content, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : content.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) ((character - base + shift + 26) % 26 + base);
            }
            result.append(character);
        }
        return result.toString();
    }

    private byte[] readFileToBytes(File file) throws Exception {
        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] fileData = new byte[(int) file.length()];
            fis.read(fileData);
            return fileData;
        }
    }

    private void writeBytesToFile(String outputFilePath, byte[] data) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            fos.write(data);
        }
    }




}
