package EncryptionFactory;
public class EncryptionService {
    public IEncryptionAlgorithm algorithm;
    public void setAlgorithm(IEncryptionAlgorithm algorithm)
    {
        this.algorithm = algorithm;
    }


    public void encryptFile(String inputFile, String outputFile) {
        if (algorithm != null) {
            try {
                algorithm.encryptFile(inputFile, outputFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalStateException("No encryption algorithm selected");
        }
    }

    public void decryptFile(String inputFile, String outputFile) {
        if (algorithm != null) {
            try {
                algorithm.decryptFile(inputFile, outputFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalStateException("No encryption algorithm selected");
        }
    }

}
