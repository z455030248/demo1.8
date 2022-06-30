package demo.command.commands;

import demo.command.receicer.Receicer;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName CloseCommand
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 13:14
 * @Version 1.0
 */

@Setter
@Getter
public class CloseCommand implements Command {

    private Receicer receicer;

    @Override
    public void execute() {
        receicer.closeAction();
    }



}
