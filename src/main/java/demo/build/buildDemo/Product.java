package demo.build.buildDemo;

/**
 * @ClassName Product
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 13:37
 * @Version 1.0
 */
public class Product {

    private String name;

    private String age;

    private String job;

    private String sex;

    public Product(ProductBuild productBuild) {
        this.age=productBuild.getAge();
        this.job=productBuild.getJob();
        this.name=productBuild.getName();
        this.sex=productBuild.getSex();
    }


    public static ProductBuild builder(){
        return new ProductBuild();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", job='" + job + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
