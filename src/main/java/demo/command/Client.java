package demo.command;

import demo.command.commands.CloseCommand;
import demo.command.commands.OpendCommand;
import demo.command.receicer.ReceicerJijia;
import demo.command.receicer.ReceicerWeixin;

/**
 * @ClassName Client
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/10 13:20
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {

        InvokerBox invokerBox = new InvokerBox();
        ReceicerJijia receicerJijia = new ReceicerJijia();
        ReceicerWeixin receicerWeixin = new ReceicerWeixin();

        OpendCommand opendCommand = new OpendCommand();
        CloseCommand closeCommand = new CloseCommand();

        opendCommand.setReceicer(receicerJijia);
        closeCommand.setReceicer(receicerJijia);

        OpendCommand opendCommand2 = new OpendCommand();
        CloseCommand closeCommand2 = new CloseCommand();

        opendCommand2.setReceicer(receicerJijia);
        closeCommand2.setReceicer(receicerJijia);

        invokerBox.setCloseCommand(opendCommand);
        invokerBox.setOpenCommand(opendCommand);

        invokerBox.open();
        invokerBox.close();



    }
}
