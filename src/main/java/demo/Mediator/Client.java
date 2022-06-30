package demo.Mediator;

import demo.Mediator.clooeague.CdClooeague;
import demo.Mediator.clooeague.CpuClooeague;
import demo.Mediator.clooeague.SoundClooeague;
import demo.Mediator.clooeague.VideoClooeagus;
import demo.Mediator.mediator.MediatorBoard;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:39
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        MediatorBoard mediator =new MediatorBoard();
        CpuClooeague cpuClooeague = new CpuClooeague(mediator);
        VideoClooeagus videoClooeagus = new VideoClooeagus(mediator);
        SoundClooeague soundClooeague = new SoundClooeague(mediator);
        CdClooeague cdClooeague = new CdClooeague(mediator);

        mediator.setCdClooeague(cdClooeague);
        mediator.setCpuClooeague(cpuClooeague);
        mediator.setVideoClooeagus(videoClooeagus);
        mediator.setSoundClooeague(soundClooeague);

        cdClooeague.loadCd();

    }
}
