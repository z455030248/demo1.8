package demo.Mediator.mediator;

import demo.Mediator.clooeague.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName MediatorBoard
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:31
 * @Version 1.0
 */
@Setter
@Getter
public class MediatorBoard implements Mediator {


    private CpuClooeague cpuClooeague;

    private VideoClooeagus videoClooeagus;

    private SoundClooeague soundClooeague;

    private CdClooeague cdClooeague;



    @Override
    public void change(Clooeague clooeague) {
        if (cpuClooeague == clooeague) {
            CpuClooeague cpuClooeague=  ((CpuClooeague)clooeague);
            this.soundClooeague.soundMsg(cpuClooeague.getSoundmsg());
            this.videoClooeagus.playVideo(cpuClooeague.getVideoMsg());

        }else if (cdClooeague == clooeague){
            this.cpuClooeague.handle(((CdClooeague)clooeague).getCdMsg());
        }
    }
}
