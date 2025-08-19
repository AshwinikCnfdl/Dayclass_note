package Java_classes;

import java.util.Scanner;

public class throw_excp {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");

        int age = sc.nextInt();
        if(age > 18){
            System.out.println("go and vote");
        }
        else{

            throw new AgeException();
            //racing /throwing  throw
        }
    }
}
//creating the own exp
class  AgeException extends Exception{
//    AgeException(String a){
//        System.out.println(a);
//    }
}