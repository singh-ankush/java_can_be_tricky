public class largestno_without_if {
    public static int max(int a, int b){
        int i = 0;
        while(a>0 || b>0){
            --a;
            --b;
            ++i;
        }
        return i;

    }

    public static void main(String[] args) {
        System.out.println(max(40,60));
    }
}
