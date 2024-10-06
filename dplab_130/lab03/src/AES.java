import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;



public class AES implements EncryptionAlgorithm{

    private SecretKey key;
    private Cipher encryptionCipher;
    public void init() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        int KEY_SIZE = 128;
        keyGenerator.init(KEY_SIZE);
        key = keyGenerator.generateKey();
    }


    public void encryptFile(String inputFilePath, String outputFilePath) throws Exception {
        File inputFile = new File(inputFilePath);
        byte[] fileData = readFileToBytes(inputFile);

        encryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        encryptionCipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = encryptionCipher.doFinal(fileData);

        writeBytesToFile(outputFilePath, encryptedBytes);
    }

    @Override
    public void decryptFile(String inputFilePath, String outputFilePath) throws Exception {
        File inputFile = new File(inputFilePath);
        byte[] encryptedData = readFileToBytes(inputFile);

        Cipher decryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        int DATA_LENGTH = 128;
        GCMParameterSpec spec = new GCMParameterSpec(DATA_LENGTH, encryptionCipher.getIV());
        decryptionCipher.init(Cipher.DECRYPT_MODE, key, spec);
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
