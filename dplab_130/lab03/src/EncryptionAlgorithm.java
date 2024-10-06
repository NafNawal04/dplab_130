public interface EncryptionAlgorithm {


    void encryptFile(String inputFilePath, String outputFilePath) throws Exception;
    void decryptFile(String inputFilePath, String outputFilePath) throws Exception;
}
