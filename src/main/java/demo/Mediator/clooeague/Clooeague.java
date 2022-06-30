package demo.Mediator.clooeague;

import demo.Mediator.mediator.Mediator;

/**
 * @ClassName clooeagle
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:08
 * @Version 1.0
 */

//参与对象的抽象父类
public abstract class Clooeague {

    private Mediator mediator;

    public Clooeague (Mediator mediator){
        this.mediator=mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
