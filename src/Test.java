import java.util.Base64;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(strConvertBase(str));
    }
    //将String经过Base64编码后转换为新的String
    public static String strConvertBase(String str) {
        if(null != str){
            Base64.Encoder encoder = Base64.getEncoder();
            return encoder.encodeToString(str.getBytes());
        }
        return null;
    }


}
