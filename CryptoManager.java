/*
* Class: CMSC203
* CRN: 30313
* Instructor: Dr. Grigoriy Grinberg
* Description: (Give a brief description for each Class)
* Due: 05/20/2025
* I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source.
*  I have not given my code to any student.
*  Print your Name here: Amanuel Sinkie
*/
public class CryptoManager {

    private static final char LOWER_BOUND = ' ';
    private static final char UPPER_BOUND = '_';
    private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

    public static boolean isStringInBounds(String plainText) {
        for (char x : plainText.toCharArray()) {
            if (x > UPPER_BOUND || x < LOWER_BOUND || Character.isLowerCase(x)) {
                return false;
            }
        }
        return true;
    }

    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds, Try again.";
        }
        StringBuilder encrypted = new StringBuilder();
        for (char c : plainText.toCharArray()) {
            int shifted = c + key;
            // Modulo-64 wrapping for range 32-95
            shifted = ((shifted - 32) % 64 + 64) % 64 + 32;
            encrypted.append((char) shifted);
        }
        return encrypted.toString();
    }

    public static String caesarDecryption(String encryptedText, int key) {
        return caesarEncryption(encryptedText, -key);
    }

    // Method to encrypt a string using the Bellaso Cipher
    public static String bellasoEncryption(String plainText, String bellasoStr) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char plainChar = plainText.charAt(i);
            char bellasoChar = bellasoStr.charAt(i % bellasoStr.length());
            int shiftedValue = plainChar + bellasoChar;
            while (shiftedValue > UPPER_BOUND) {
                shiftedValue -= (UPPER_BOUND - LOWER_BOUND + 1);
            }
            encryptedText.append((char) shiftedValue);
        }
        return encryptedText.toString();
    }

    // Method to decrypt a string using the Bellaso Cipher
    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        StringBuilder decryptedText = new StringBuilder();

        for (int i = 0; i < encryptedText.length(); i++) {
            char encryptedChar = encryptedText.charAt(i);
            char bellasoChar = bellasoStr.charAt(i % bellasoStr.length());
            int shiftedValue = encryptedChar - bellasoChar;
            while (shiftedValue < LOWER_BOUND) {
                shiftedValue += (UPPER_BOUND - LOWER_BOUND + 1);
            }
            decryptedText.append((char) shiftedValue);
        }
        return decryptedText.toString();
    }
}