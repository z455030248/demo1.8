package demo.build.buildDemo;

/**
 * @ClassName ProductBuild
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 13:39
 * @Version 1.0
 */
public class ProductBuild {

    private String name;

    private String age;

    private String job;

    private String sex;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public String getSex() {
        return sex;
    }

    public ProductBuild setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuild setAge(String age) {
        this.age = age;
        return this;
    }

    public ProductBuild setJob(String job) {
        this.job = job;
        return this;
    }

    public ProductBuild setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public Product build() {
        return new Product(this);
    }
}
