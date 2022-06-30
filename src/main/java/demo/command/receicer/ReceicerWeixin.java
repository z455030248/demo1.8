package demo.command.receicer;

/**
 * @ClassName ReceicerWeixin
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 13:16
 * @Version 1.0
 */
public class ReceicerWeixin implements Receicer{
    @Override
    public void openAction() {
        System.out.println("微星主板开机了");
    }

    @Override
    public void closeAction() {
        System.out.println("微星主板关机了");
    }
}
