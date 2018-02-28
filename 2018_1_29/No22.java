import java.util.LinkedList;

/**
 *
 */
public class No22 {

    public static void main(String[] args) {
        No22 o = new No22();
        o.run( ()-> System.out.println("aaaaaa"));
        LinkedList linkedList = new LinkedList();
    }


    public void run(abc a){
        a.aaa();
    }


    @FunctionalInterface
    interface  abc{
        void aaa();
    }
}
