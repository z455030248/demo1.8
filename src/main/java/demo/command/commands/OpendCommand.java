package demo.command.commands;

import demo.command.receicer.Receicer;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName OpendCommand
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 13:09
 * @Version 1.0
 */
@Getter
@Setter
public class OpendCommand implements Command{


    private Receicer receicer;


    @Override
    public void execute() {
        receicer.openAction();
    }
}
