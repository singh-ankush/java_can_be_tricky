//this can be used to detect duplicate words in a sentence.
public class duplicate_words {
    public static void main(String[] args) {
        String string = "One Two One Four Six Two Nine Ten";
        int count;

        string = string.toLowerCase();

        String words[] = string.split(" ");

        System.out.println("Duplicate words in the given string : ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }

            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}
