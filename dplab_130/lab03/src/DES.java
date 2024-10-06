import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DES implements EncryptionAlgorithm{

    private SecretKey key;
    private Cipher encryptionCipher;
    private IvParameterSpec iv;


    public DES() throws Exception {
        initialize();
    }
    public void initialize() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
        key = keyGenerator.generateKey();
        encryptionCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        iv = new IvParameterSpec(new byte[8]);
    }


    public void encryptFile(String inputFilePath, String outputFilePath) throws Exception {
        File inputFile = new File(inputFilePath);
        byte[] fileData = readFileToBytes(inputFile);

        encryptionCipher.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] encryptedBytes = encryptionCipher.doFinal(fileData);

        writeBytesToFile(outputFilePath, encryptedBytes);
    }

    @Override
    public void decryptFile(String inputFilePath, String outputFilePath) throws Exception {
        File inputFile = new File(inputFilePath);
        byte[] encryptedData = readFileToBytes(inputFile);

        Cipher decryptionCipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        decryptionCipher.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] decryptedBytes = decryptionCipher.doFinal(encryptedData);

        writeBytesToFile(outputFilePath, decryptedBytes);
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
