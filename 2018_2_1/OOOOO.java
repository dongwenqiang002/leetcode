import java.io.InputStream;
import java.io.OutputStream;


public class OOOOO {

    public static void main(String[] a) {

        try {
            Process process  = Runtime.getRuntime().exec("java E:\\Desktop\\peoject\\leetcode\\network\\Outher ");
            while(process.isAlive()){
                Thread.sleep(50);
            }
            OutputStream ouu = process.getOutputStream();

            InputStream outputStream = process.getErrorStream();//InputStream();
            byte[] b= new byte[1024];
            outputStream.read(b);
            System.out.println(new String(b));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


