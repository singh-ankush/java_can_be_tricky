//a way to create calculator using parameters so that in case of any changes the whole code doesnt need to be revamped.

import java.util.Scanner;

public class calculator_using_parameters {

    public static int Add(int a,int b){

        int res = a+b;

        return res;
    }

    public static int Sub(int a,int b){

        int res = a-b;

        return res;
    }
    public static int Mult(int a,int b){

        int res = a*b;

        return res;
    }
    public static int Div(int a,int b){

        int res = a/b;

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if(str.equals("+")){
            System.out.println(Add(30,20));
        }
        else if(str.equals("-")){
            System.out.println(Sub(30,20));
        }
        else if(str.equals("*")){
            System.out.println(Mult(30,20));
        }
        else if(str.equals("/")){
            System.out.println(Div(30,20));
        }
        else{System.out.println("error aagya bro");}
    }
}
