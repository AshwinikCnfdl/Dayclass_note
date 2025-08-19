package Java_classes;

import java.util.InputMismatchException;
import java.util.Scanner;
// a = 30 //b = 25//a = 0//b = 9// a =56// b = 0
//in java using try and catch  block

/* try{
        //risky line of code
        }
catch  (Exception_name e){
            error msg
        }

//in try block if got exception it stop the exg of try block it jump to catch
//in try block if not get any  exp it exc the try block
 */



public class Exception_handling {

    static  void op(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter the a value");
            int a = sc.nextInt();
            System.out.println("enter the b value");
            int b = sc.nextInt();
            System.out.println(a + b);//5
            System.out.println(a - b);//-5
            System.out.println(a * b);//0
            System.out.println(a / b);//0 ArithmeticException: / by zero
            System.out.println(a % b);//0
        }

        catch (ArithmeticException e) {
            System.out.println("u can't div any num with 0");
            op();
        }
        catch (InputMismatchException e){
            System.out.println("enter the valid data");
            op();
        }
        catch (Exception e){
            System.out.println("error");
            op();
        }
    }
    public static void main(String[] args) {
        op();

    }
}
