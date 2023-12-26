// a code to detect the smallest and the largest number in an array.
public class smallest_largest_array {

    public static void main(String[] args) {
        int num[] = new int[]{12,56,34,15,46,28};

        //assign first element of an array to largest and smallest
        int small = num[0];
        int large = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > large)
                large = num[i];
            else if (num[i] < small)
                small = num[i];
        }

        System.out.println("Largest Number is : " + large);
        System.out.println("Smallest Number is : " + small);
    }

}
