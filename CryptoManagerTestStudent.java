import org.junit.Test;
import static org.junit.Assert.*;

public class CryptoManagerTestStudent {

    @Test
    public void testEncryptCaesarCase1() {
        assertEquals("olssv", CryptoManager.encryptCaesar("hello", 7));
    }

    @Test
    public void testDecryptCaesarCase1() {
        assertEquals("hello", CryptoManager.decryptCaesar("olssv", 7));
    }

    @Test
    public void testEncryptBellasoCase1() {
        assertEquals("HFNMP", CryptoManager.encryptBellaso("hello", "ab"));
    }

    @Test
    public void testDecryptBellasoCase1() {
        assertEquals("hello", CryptoManager.decryptBellaso("HFNMP", "ab"));
    }

    @Test
    public void testEncryptCaesarCase2() {
        assertEquals("muutl~", CryptoManager.encryptCaesar("goodbye", 6));
    }

    @Test
    public void testDecryptCaesarCase2() {
        assertEquals("goodbye", CryptoManager.decryptCaesar("muutl~", 6));
    }

    @Test
    public void testEncryptBellasoCase2() {
        assertEquals("HSQYV[", CryptoManager.encryptBellaso("goodbye", "cde"));
    }

    @Test
    public void testDecryptBellasoCase2() {
        assertEquals("goodbye", CryptoManager.decryptBellaso("HSQYV[", "cde"));
    }

    @Test
    public void testEncryptCaesarCase3() {
        assertEquals("mtqf", CryptoManager.encryptCaesar("hola", 5));
    }

    @Test
    public void testDecryptCaesarCase3() {
        assertEquals("hola", CryptoManager.decryptCaesar("mtqf", 5));
    }

    @Test
    public void testEncryptBellasoCase3() {
        assertEquals("IPMX", CryptoManager.encryptBellaso("hola", "efgh"));
    }

    @Test
    public void testDecryptBellasoCase3() {
        assertEquals("hola", CryptoManager.decryptBellaso("IPMX", "efgh"));
    }

    @Test
    public void testEncryptCaesarCase4() {
        assertEquals("ehmsw", CryptoManager.encryptCaesar("adios", 4));
    }

    @Test
    public void testDecryptCaesarCase4() {
        assertEquals("adios", CryptoManager.decryptCaesar("ehmsw", 4));
    }

    @Test
    public void testEncryptBellasoCase4() {
        assertEquals("IQYVV", CryptoManager.encryptBellaso("adios", "ghijk"));
    }

    @Test
    public void testDecryptBellasoCase4() {
        assertEquals("adios", CryptoManager.decryptBellaso("IQYVV", "ghijk"));
    }
}