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
            Base64.Encoder encoder = Base64.getEncoder();//Base64.Encoder，这是一个编码器
                                                         //Base64.getEncoder()方法用于获取Base64.Encoder对象
            return encoder.encodeToString(str.getBytes());//encodeToString方法可以将一个byte数组进行编码，并且以字符串
            // 的形式展示出来
        }
        return null;
    }
    //参考文献：https://blog.csdn.net/zhou_kapenter/article/details/62890262?ops_request_misc=&request_
    // id=&biz_id=102&utm_term=Base64.Encoder&utm_medium=distribute.pc_search_result.none-task-blog-2~a
    // ll~sobaiduweb~default-0-62890262.142^v9^pc_search_result_control_group,157^v4^control&spm=1018.
    // 2226.3001.4187


}
