/**
 *
 */
public class No8 {

    public static void main(String[] args) {
        No8 o = new No8();
        String str = "I originally created this as a short to-do list of study topics for becoming a software engineer," +
                " but it grew to the large list you see today. After going through this study plan, I got hired as a Softw" +
                "are Development Engineer at Amazon! You probably won't have to study as much as I did. Anyway, everything " +
                "you need is here.\nThe items listed here will prepare you well for in an interview at just about any soft" +
                "ware company, including the you giants: Amazon, Facebook, Google or Microsoft.\n\nBest of luck to you!";
        String word = "you";
        int n = o.nums(str,word);
        System.out.println(n);
    }

    public int nums(String text,String word){
        char[] t = text.toCharArray();
        char[] w = word.toCharArray();
        int n = 0 ;
        for(int i = 0 ; i< t.length;i++){
            if(t[i] ==w[0]){
                for(int j = 1;j<w.length;j++){
                    if(t[i+j]!=w[j])break;
                    if(j==w.length-1)n++;
                }
            }
        }
        return n;//83--239--

    }
}
