import Sys.utils.Security.EnDecryption;

import java.security.NoSuchAlgorithmException;

/**
 * Created by tanjian on 16/12/6.
 * 测试SHA-256算法
 */
public class testEncryption {
    public static void main(String [] args) throws NoSuchAlgorithmException {
        String string="hello world";
        System.out.println(EnDecryption.Encryption(string));
    }
}
