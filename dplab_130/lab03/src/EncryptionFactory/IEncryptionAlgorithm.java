package EncryptionFactory;
public interface IEncryptionAlgorithm {


    void encryptFile(String inputFilePath, String outputFilePath) throws Exception;
    void decryptFile(String inputFilePath, String outputFilePath) throws Exception;
}
