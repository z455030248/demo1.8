package demo.Mediator.clooeague;

import demo.Mediator.mediator.Mediator;

/**
 * @ClassName videoClooeagus
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:15
 * @Version 1.0
 */
public class VideoClooeagus extends Clooeague{

    public VideoClooeagus(Mediator mediator) {
        super(mediator);
    }


    public void playVideo(String video){
        System.out.println(video);
    }
}
