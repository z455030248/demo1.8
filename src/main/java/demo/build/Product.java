package demo.build;

/**
 * @ClassName Product
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 13:29
 * @Version 1.0
 */
public class Product {
    private String name;

    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
