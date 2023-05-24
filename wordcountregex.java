public class WordCount {
    public static void main (String args[]){
        String myStr = "the butcher's wife, she was from Montreal";
        String[] words = myStr.split("\\s+");
        System.out.println("Word Count is: "+words.length);
    }
}
