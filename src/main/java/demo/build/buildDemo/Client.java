package demo.build.buildDemo;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 13:42
 * @Version 1.0
 */
public class Client {


    public static void main(String[] args) {
       Product product =  Product.builder().setAge("1").setName("2").setJob("3").setSex("0").build();
        System.out.println(product);
    }
}
