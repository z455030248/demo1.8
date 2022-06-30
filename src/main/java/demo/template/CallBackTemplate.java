package demo.template;


/**
 * @ClassName CallBackTemplate
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 15:29
 * @Version 1.0
 */
public class CallBackTemplate {

    public void templateMethod(Callback callback){

        operationMethod1(callback);

        hookMethod();
    }



    /**
     * 私有的方法，父类提供默认的实现。在模版中直接调用。
     */
    private void operationMethod1(Callback callback){
        callback.operationMethod1();
        callback.operationMethod1();

    }

    /**
     * 可以提供给子类去使用的方法。
     */
    protected final void operationMethod2(){

    }

    /**
     * 子类可能需要访问的通用方法.
     */
    protected void commonMethod(){

    }



    protected void hookMethod(){
        System.out.println("钩子方法，提供默认的空实现，子类可以重写。");
    }

}
