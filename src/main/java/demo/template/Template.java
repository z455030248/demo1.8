package demo.template;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.logging.SocketHandler;

/**
 * @ClassName Template
 * @Description TODO
 * @Author zhouchao
 * @Date 2022/4/17 15:22
 * @Version 1.0
 */
public abstract class Template {

    public void templateMethod() {

        operationMethod1();

        operationMethod2();

        overrideMethod1();

        overrideMethod2();

        hookMethod();

    }


    /**
     * 私有的方法，父类提供默认的实现。在模版中直接调用。
     */
    private void operationMethod1() {

    }

    /**
     * 可以提供给子类去使用的方法。
     */
    protected final void operationMethod2() {

    }

    /**
     * 子类可能需要访问的通用方法.
     */
    protected void commonMethod() {

    }

    /**
     * 子类需要具体的实现的固定部分
     */
    protected abstract void overrideMethod1();

    /**
     * 子类需要具体的实现的固定部分
     */
    protected abstract void overrideMethod2();

    protected void hookMethod() {
        System.out.println("钩子方法，提供默认的空实现，子类可以重写。");
    }


    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket=new ServerSocket();//1.创建服务器端口号
        serverSocket.bind(new InetSocketAddress("127.0.0.1",9999));
        System.out.println("服务器端已打开");
        Socket socket= serverSocket.accept();//监听有没有客户端连接到服务器端,连接后返回客户端socket对象
        System.out.println("服务器连接成功");
        //4.在服务器接收到客户端
        InputStream in=socket.getInputStream();
        byte[]b=new byte[100];
        int length=in.read(b);
        String msg=new String(b,0,length,"utf-8");
        System.out.println(msg);
        //

        OutputStream out= socket.getOutputStream();

        BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(out));
        bufferedWriter.write("HTTP/1.1 200 OK\n");
        bufferedWriter.write("Content-Type:text/html;charset:utf-8\n");
        bufferedWriter.write("\n");
        bufferedWriter.write(
                "<html>" +
                        "<head>" +
                        "<link rel=\"icon\" href=\"data:;base64,=\">"+
                        "    <meta charset=\"UTF-8\">" +
                        "    <title>标题</title>" +
                        "</head>" +
                        "<body>" +
                        "<center>" +
                        "<h1>当前时间：" + new java.util.Date()+"</h1>" +
                        "</center>" +
                        "</body>" +
                        "</html>");
        bufferedWriter.flush();

        socket.close();
        serverSocket.close();
    }

}
