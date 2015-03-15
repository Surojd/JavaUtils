
import java.security.MessageDigest;

public class MD5 {

    public static String MD5(String args) throws Exception {
        String name = "name";
        String passwd = "password";

        MessageDigest m = MessageDigest.getInstance("MD5");
        m.update(passwd.getBytes("UTF8"));
        byte s[] = m.digest();
        String result = "";
        for (int i = 0; i < s.length; i++) {
            result += Integer.toHexString((0x000000ff & s[i]) | 0xffffff00).substring(6);
        }

        return result;
    }
}
