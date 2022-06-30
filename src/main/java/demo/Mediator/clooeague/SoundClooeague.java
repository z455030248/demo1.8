package demo.Mediator.clooeague;

import demo.Mediator.mediator.Mediator;

/**
 * @ClassName SoundClooeague
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:30
 * @Version 1.0
 */
public class SoundClooeague extends Clooeague{

    public SoundClooeague(Mediator mediator) {
        super(mediator);
    }

    public void soundMsg(String msg){
        System.out.println(msg);
    }
}
