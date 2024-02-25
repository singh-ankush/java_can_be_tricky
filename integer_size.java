// this is a code used to convert a number to specific digits by adding numbers between 0 to 9 before the number.
//note : i wont be using main method and class as it is a small code so please beware and use those methods before executing the code.

int num = 2354567;

String format = String.format("%011d", num);

System.out.println(format);

// the % is used to add that specific 1 digit number before the integer, in my case i am adding 0.
//the d is used to specify how many digits the number should be, in my case i have made it 11 digits.
// so what this code will do is take my number 2354567 and add zeroes before it until it becomes 11 digits i.e. 00002354567.
