package demo.template;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName Callback
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 15:32
 * @Version 1.0
 */
public abstract class Callback {


    /**
     * 可以提供给子类去使用的方法。
     */
    public abstract void operationMethod2();

    /**
     * 子类可能需要访问的通用方法.
     */
    public abstract void operationMethod1();


    public static void main(String[] args) throws IOException {

        Socket socket=new Socket("127.0.0.1",9999);//2.启动时,添加自己的ip,并写出想要连接的客户端端口
        //3.搭建输出流,发送指定内容
        OutputStream out=socket.getOutputStream();
        out.write("客户端:你好".getBytes("utf-8"));
        InputStream in=socket.getInputStream();
        byte[]b=new byte[100];
        int length=in.read(b);
        String msg=new String(b,0,length,"utf-8");
        System.out.println(msg);
    }
}
