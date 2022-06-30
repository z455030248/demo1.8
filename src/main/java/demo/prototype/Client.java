package demo.prototype;

/**
 * @ClassName client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:02
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        PrototypeImplOne prototypeImplOne = new PrototypeImplOne();
        Prototype clone = prototypeImplOne.clone();
        System.out.println(clone);
    }
}
