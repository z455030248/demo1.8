package demo.build;

/**
 * @ClassName Director
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 13:34
 * @Version 1.0
 */
public class Director {

    private Build build;

    public void setBuild (Build build){
        this.build=build;
    }

    public Director(Build build) {
        this.build = build;
    }

    public void operate(){
        build.buildProduct();
    }


    public Product getProduct(){
        return build.build();
    }


}
