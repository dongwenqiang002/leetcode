
import com.sun.net.httpserver.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;

public class Web {

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
        httpServer.createContext("/", new MyHandler());// 用MyHandler类内处理到/的请求
        httpServer.setExecutor(null); // creates a default executor
        httpServer.start();
    }

}

class MyHandler implements HttpHandler {
    public void handle(HttpExchange t) throws IOException {
        System.out.println("-----------------------");

       // HttpContext context = t.getHttpContext();
        //System.out.println("context:\t\t" + context);

        //请求类型 (GET/POST)
        String requestMethod = t.getRequestMethod();
        System.out.println("requestMethod:\t" + requestMethod);

        //获取http数据报内数据 (post请求的数据)
        InputStream is = t.getRequestBody();
        byte[] b = new byte[500];
        is.read(b);
        System.out.println(new String(b));

        //获取从 / 开始的的uri
        URI uri = t.getRequestURI();
        System.out.println("uri:\t\t\t"+uri.toString());

        System.out.println("-----------------------");


        String response = "<font color='#ff0000'><form method=\"POST\" action=\"/aasdaa\"><input name=\"a\" /><input type=\"submit\" value=\"sss\"/></form>come on baby</font>";
        t.sendResponseHeaders(200, response.length());
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}