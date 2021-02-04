package dam.m9.uf1.criptografia.aes;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;


public class ExempleBasicAES {
    public static void main(String[] args) throws Exception {

//la clau ha de ser de 16 caràcters.
        String key="1234567890123456";
        String missatgeSecret="Avui fa sol";
        String xifrat = encriptAES(missatgeSecret, key);
        System.out.println(xifrat);
        String desxifrat = decriptAES(xifrat, key);
        System.out.println(desxifrat);
    }

    public static String encriptAES(String missatge, String clau) throws Exception {
            SecretKeySpec key = new SecretKeySpec(clau.getBytes("UTF-8"), "AES");
            Cipher xifrat = Cipher.getInstance("AES");
            xifrat.init(Cipher.ENCRYPT_MODE, key);
            return Base64.getEncoder().encodeToString(xifrat.doFinal(missatge.getBytes("UTF-8")));
    }

    public static String decriptAES(String missatge, String clau) throws Exception {
            SecretKeySpec key = new SecretKeySpec(clau.getBytes("UTF-8"), "AES");
            Cipher xifrat = Cipher.getInstance("AES");
            xifrat.init(Cipher.DECRYPT_MODE, key);
            return new String(xifrat.doFinal(Base64.getDecoder().decode(missatge)));
    }
}
