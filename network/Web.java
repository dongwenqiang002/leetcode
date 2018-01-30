import com.sun.net.httpserver.HttpServer;
import sun.net.httpserver.HttpServerImpl;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;

public class Web {

    public static void main(String [] args) throws IOException {
        //ServerSocket serverSocket = new ServerSocket(8080);
        HttpServer httpServer = HttpServer.create();
        httpServer.start();
        Executor eee = httpServer.getExecutor();
        Req
        //Socket socket = serverSocket.accept();
        //InputStream in = socket.getInputStream();
       // byte[] c = new byte[200];
       // in.read(c);
        //System.out.print(new String(c));
    }

}
