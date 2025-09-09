//This is a code to count how many digits are there in a number
class Main {
    public static int numberans (int number){
        String number_conv =String.valueOf(number);
        int i = 0;
        String[] split_number = number_conv.split("");
        for(int n = 0; n<split_number.length; n++){
            i++;
        }
        return i;
    }
    
    public static void main(String args[]){
        System.out.print(numberans(12345));
    }
}
