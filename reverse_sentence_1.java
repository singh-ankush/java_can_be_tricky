public class reverse_sentence_1 {
    public static String reverse(String s) {
        int x = s.indexOf(" ");
        if(x == -1)
            return s;

        return reverse(s.substring(x+1)) +" "+ s.substring(0, x);
    }

    public static void main(String[] args){
        String str = "I am good";
        String rev = reverse(str);
        System.out.println("Reversed sentence: " + rev);
    }
}
