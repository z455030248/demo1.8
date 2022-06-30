package demo.build;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 14:00
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        BuildImpl build = new BuildImpl();
        Director director = new Director(build);
        director.operate();
        Product product = director.getProduct();
        System.out.println(product);

    }
}
