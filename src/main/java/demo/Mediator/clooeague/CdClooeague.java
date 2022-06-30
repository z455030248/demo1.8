package demo.Mediator.clooeague;

import demo.Mediator.mediator.Mediator;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName CdClooeague
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 11:23
 * @Version 1.0
 */

@Getter
@Setter
public class CdClooeague extends Clooeague{
    public CdClooeague(Mediator mediator) {
        super(mediator);
    }

    private String cdMsg;


    public void loadCd(){
        this.cdMsg="声卡播放 后来,显卡播放 刘若英";
        this.getMediator().change(this);

    }
}
