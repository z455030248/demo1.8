package demo.abstractFatory;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 13:18
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstarctFatory abstarctFatory =new FatoryA();
        AbstractProductB productB = abstarctFatory.createProductB();
        AbstarctProductA productA = abstarctFatory.createProductA();
    }
}
