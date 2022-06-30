package demo.command;

import demo.command.commands.Command;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName InvokerBox
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 13:19
 * @Version 1.0
 */

@Getter
@Setter
public class InvokerBox {


    private Command openCommand;

    private Command closeCommand;

    public void open(){
        openCommand.execute();
    }

    public void close(){
        closeCommand.execute();
    }
}
