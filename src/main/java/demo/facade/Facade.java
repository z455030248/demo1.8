package demo.facade;

/**
 * @ClassName Facade
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/8 11:46
 * @Version 1.0
 */
public class Facade {

    void test(){
        AModel aModel=new AModelImpl();
        aModel.testA();
        BModelImpl bModel = new BModelImpl();
        bModel.testB();
        CModelImpl cModel = new CModelImpl();
        cModel.testC();
    }
}
