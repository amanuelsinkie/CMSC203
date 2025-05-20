import org.junit.Test;          // JUnit 4

import static org.junit.Assert.*; // JUnit 4


public class CryptoManagerTestStudent {

    @Test
    public void testEncryptCaesarCase1() {
        assertEquals("OLSSV", CryptoManager.caesarEncryption("HELLO", 7));
    }

    @Test
    public void testDecryptCaesarCase1() {
        assertEquals("HELLO", CryptoManager.caesarDecryption("OLSSV", 7));
    }

    @Test
    public void testEncryptBellasoCase1() {
        assertEquals("IGMNP", CryptoManager.bellasoEncryption("HELLO", "AB"));
    }

    @Test
    public void testDecryptBellasoCase1() {
        assertEquals("HELLO", CryptoManager.bellasoDecryption("IGMNP", "AB"));
    }

    @Test
    public void testEncryptCaesarCase2() {
        assertEquals("MUUJH_K", CryptoManager.caesarEncryption("GOODBYE", 6));
    }

    @Test
    public void testDecryptCaesarCase2() {
        assertEquals("GOODBYE", CryptoManager.caesarDecryption("MUUJH_K", 6));
    }

    @Test
    public void testEncryptBellasoCase2() {
        assertEquals("JSTGF^H", CryptoManager.bellasoEncryption("GOODBYE", "CDE"));
    }

    @Test
    public void testDecryptBellasoCase2() {
        assertEquals("GOODBYE", CryptoManager.bellasoDecryption("JSTGF^H", "CDE"));
    }

    @Test
    public void testEncryptCaesarCase3() {
        assertEquals("MTQF", CryptoManager.caesarEncryption("HOLA", 5));
    }

    @Test
    public void testDecryptCaesarCase3() {
        assertEquals("HOLA", CryptoManager.caesarDecryption("MTQF", 5));
    }

    @Test
    public void testEncryptBellasoCase3() {
        assertEquals("MUSI", CryptoManager.bellasoEncryption("HOLA", "EFGH"));
    }

    @Test
    public void testDecryptBellasoCase3() {
        assertEquals("HOLA", CryptoManager.bellasoDecryption("MUSI", "EFGH"));
    }

    @Test
    public void testEncryptCaesarCase4() {
        assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("adios", 4));
    }

    @Test
    public void testDecryptCaesarCase4() {
        assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarDecryption("The selected string is not in bounds, Try again.", 4));
    }

    @Test
    public void testEncryptBellasoCase4() {
        assertEquals("(,29>", CryptoManager.bellasoEncryption("adios", "GHIJK"));
    }

    @Test
    public void testDecryptBellasoCase4() {
        assertEquals("M \\V(^$\\Y)^\\W))+!%]U\"+W$$-X $U[',$Y,$WJ'2XX]V\"&%", CryptoManager.bellasoDecryption("The selected string is not in bounds, Try again.", "GHIJK"));
    }
}