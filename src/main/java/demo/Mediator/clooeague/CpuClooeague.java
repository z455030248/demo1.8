package demo.Mediator.clooeague;

import demo.Mediator.mediator.Mediator;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName CpuClooeague
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:10
 * @Version 1.0
 */

@Getter
@Setter
public class CpuClooeague extends Clooeague {


    public CpuClooeague(Mediator mediator) {
        super(mediator);
    }

    private String videoMsg;

    private String soundmsg;


    public void handle(String msg) {
        String[] split = msg.split(",");
        this.soundmsg = split[1];
        this.videoMsg = split[0];
        this.getMediator()
                .change(this);
    }

}
