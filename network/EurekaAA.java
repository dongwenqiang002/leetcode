import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/**
 *
 */
public class EurekaAA {

    public static void main11(String[] args) throws IOException {
        ServerSocket socke = new ServerSocket(8651);
        byte[] b = new byte[1000];

        while(true){
            Socket s = socke.accept();
            InputStream in = s.getInputStream();
            in.read(b);
            System.out.println(new String(b));
            System.out.println("-----------------------------------------");

        }

    }
    static String p1="GET /eureka/apps/ HTTP/1.1\n" +
            "Accept: application/json\n" +
            "DiscoveryIdentity-Name: DefaultClient\n" +
            "DiscoveryIdentity-Version: 1.4\n" +
            "DiscoveryIdentity-Id: 172.17.0.10\n" +
            "Accept-Encoding: gzip\n" +
            "Host: 127.0.0.1:8761\n" +
            "Connection: Keep-Alive\n" +
            "User-Agent: Java-EurekaClient/v1.7.0\n" +
            "Authorization: Basic aG9yY3J1eDpob3I2Ng==\n" +
            "\n" +
            "t: Java-EurekaClient/v1.7.0\n" +
            "Authorization: Basic aG9yY3J1eDpob3I2Ng==\n" +
            "\n" +
            "15f\n" +
            "{\"instance\":{\"instanceId\":\"peer1:eureka-ording:8081\",\"hostName\":\"peer1\",\"app\":\"EUREKA-ORDING\",\"ipAddr\":\"172.17.0.10\",\"status\":\"UP\",\"overriddenstatus\":\"UNKNOWN\",\"port\":{\"$\":8081,\"@enabled\":\"true\"},\"securePort\":{\"$\":443,\"@enabled\":\"false\"},\"countryId\":1,\"dataCenterInfo\":{\"@class\":\"com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo\",\"name\":\"MyOwn\"}\n";
    static String p2="PUT /eureka/apps/EUREKA-ORDING/peer1:eureka-ording:8081?status=UP&lastDirtyTimestamp=1517563230129 HTTP/1.1\n" +
            "DiscoveryIdentity-Name: DefaultClient\n" +
            "DiscoveryIdentity-Version: 1.4\n" +
            "DiscoveryIdentity-Id: 172.17.0.10\n" +
            "Accept-Encoding: gzip\n" +
            "Content-Length: 0\n" +
            "Host: 127.0.0.1:8761\n" +
            "Connection: Keep-Alive\n" +
            "User-Agent: Java-EurekaClient/v1.7.0\n" +
            "Authorization: Basic aG9yY3J1eDpob3I2Ng==\n" +
            "\n" +
            "15f\n" +
            "{\"instance\":{\"instanceId\":\"peer1:eureka-ording:8081\",\"hostName\":\"peer1\",\"app\":\"EUREKA-ORDING\",\"ipAddr\":\"172.17.0.10\",\"status\":\"UP\",\"overriddenstatus\":\"UNKNOWN\",\"port\":{\"$\":8081,\"@enabled\":\"true\"},\"securePort\":{\"$\":443,\"@enabled\":\"false\"},\"countryId\":1,\"dataCenterInfo\":{\"@class\":\"com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo\",\"name\":\"MyOwn\"}\n";
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("horcrux:hor66@127.0.0.1",8761);
        OutputStream out = socket.getOutputStream();
        out.write(p1.getBytes());
        out.flush();
        out.write(p2.getBytes());
        out.flush();
        out.close();
        socket.close();
    }
/*
GET /eureka/apps/ HTTP/1.1
Accept: application/json
DiscoveryIdentity-Name: DefaultClient
DiscoveryIdentity-Version: 1.4
DiscoveryIdentity-Id: 172.17.0.10
Accept-Encoding: gzip
Host: 127.0.0.1:8651
Connection: Keep-Alive
User-Agent: Java-EurekaClient/v1.7.0
Authorization: Basic aG9yY3J1eDpob3I2Ng==

t: Java-EurekaClient/v1.7.0
Authorization: Basic aG9yY3J1eDpob3I2Ng==

15f
{"instance":{"instanceId":"peer1:eureka-ording:8081","hostName":"peer1","app":"EUREKA-ORDING","ipAddr":"172.17.0.10","status":"UP","overriddenstatus":"UNKNOWN","port":{"$":8081,"@enabled":"true"},"securePort":{"$":443,"@enabled":"false"},"countryId":1,"dataCenterInfo":{"@class":"com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo","name":"MyOwn"}

-----------------------------------------
PUT /eureka/apps/EUREKA-ORDING/peer1:eureka-ording:8081?status=UP&lastDirtyTimestamp=1517563230129 HTTP/1.1
DiscoveryIdentity-Name: DefaultClient
DiscoveryIdentity-Version: 1.4
DiscoveryIdentity-Id: 172.17.0.10
Accept-Encoding: gzip
Content-Length: 0
Host: 127.0.0.1:8651
Connection: Keep-Alive
User-Agent: Java-EurekaClient/v1.7.0
Authorization: Basic aG9yY3J1eDpob3I2Ng==

15f
{"instance":{"instanceId":"peer1:eureka-ording:8081","hostName":"peer1","app":"EUREKA-ORDING","ipAddr":"172.17.0.10","status":"UP","overriddenstatus":"UNKNOWN","port":{"$":8081,"@enabled":"true"},"securePort":{"$":443,"@enabled":"false"},"countryId":1,"dataCenterInfo":{"@class":"com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo","name":"MyOwn"}

-----------------------------------------




* */

}
