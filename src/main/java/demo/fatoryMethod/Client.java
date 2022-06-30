package demo.fatoryMethod;

import demo.fatoryMethod.fatory.Fatory;
import demo.fatoryMethod.fatory.FatoryImpl;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 12:32
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Fatory fatory = new FatoryImpl();
        fatory.opertion();
    }
}
