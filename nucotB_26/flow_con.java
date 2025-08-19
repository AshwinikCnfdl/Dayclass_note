package nucotB_26;

import java.util.Scanner;

public class flow_con {
    public static void main(String[] args) {

        //taking the input from console
         Scanner sc = new Scanner(System.in);
         System.out.println("pls enter the pin num");
           int pin = sc.nextInt() ;
           System.out.println(pin);
           if(pin == 1234){
               System.out.println("ph is unlocked");

               System.out.println("enter the what app pin");
               int wpin = sc.nextInt();

               if(wpin == 4567){
                   System.out.println("What is unlocked");
               }
               else{
                   System.out.println("try again for what app");
               }


           }
           else{
               System.out.println("try again");
           }


    }
}
