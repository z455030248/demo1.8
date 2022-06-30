package demo.easyFatory;

/**
 * @ClassName Fatory
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 11:40
 * @Version 1.0
 */
public class Fatory {
    public static Api creatApi(String s) {
        if ("1".equals(s)){
            return new FirstApi();
        }else {
            return new SecondApi();
        }
    }
}
