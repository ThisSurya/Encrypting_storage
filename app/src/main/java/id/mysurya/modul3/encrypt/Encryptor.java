/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.mysurya.modul3.encrypt;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Lenovo
 */
public class Encryptor {
    private final static String ALGORITHM = "AES";
    private final static String TRANSFORMATION = "AES/ECB/PKCS5Padding";
    
    public static String generateKey() throws NoSuchAlgorithmException{
        KeyGenerator key = KeyGenerator.getInstance(ALGORITHM);
        SecretKey secret = key.generateKey();
        String encodedKey = Base64.getEncoder().encodeToString(secret.getEncoded());
        return encodedKey;
    }
    public static String encrypt(String plainText, String key) throws Exception {
        byte[] decodedKey = Base64.getDecoder().decode(key);
        SecretKey originalKey = new SecretKeySpec(decodedKey, 0,
                                                  decodedKey.length, ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, originalKey);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
        String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);
        
        return encryptedText;
    }
    public static String decrypt(String encodedText, String key) throws Exception {
        byte[] decodedKey = Base64.getDecoder().decode(key);
        SecretKey originalKey = new SecretKeySpec(decodedKey, 0,
                                                  decodedKey.length, ALGORITHM);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, originalKey);
        byte[] encryptedBytes = Base64.getDecoder().decode(encodedText);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        String decryptedText = new String(decryptedBytes,
                                          StandardCharsets.UTF_8);
        return decryptedText;
    }
}
