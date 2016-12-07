package Sys.utils.Security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by tanjian on 16/12/6.
 * 加密类——采用SHA-256算法
 */
public class EnDecryption {
    private static MessageDigest messageDigest ;

    public static String Encryption(String message) throws NoSuchAlgorithmException {
        messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(message.getBytes());
        byte byteData[] = messageDigest.digest();
        return byteToHex_M1(byteData);
    }

    public static String byteToHex_M1(byte [] byteData){
        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    public static String byteToHex_M2(byte [] byteData){
        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
        for (int i=0;i<byteData.length;i++) {
            String hex=Integer.toHexString(0xff & byteData[i]);
            if(hex.length()==1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
