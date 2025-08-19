package nucotB_26;


import java.util.Scanner;

public class Loops_conditions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("num = ");
        int num = sc.nextInt();// InputMismatchException

        int count = 0;
        do{
           num = num / 10;
           count++;
        }
        while (num > 0);
        System.out.println(count);

//        power of num: num = 5 ; power = 5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("a = ");
//        int a = sc.nextInt();// InputMismatchException
//       System.out.println("b = ");
//       int b = sc.nextInt();
//
//       System.out.println("op = ");
//       String op = sc.next();
//
//       switch (op){
//           case("add"):
//               System.out.println(a + b);
//               break;
//           case("sub"):
//               System.out.println(a - b);
//               break;
//           case("mul"):
//               System.out.println(a * b);
//               break;
//           case("div"):
//               System.out.println(a / b);
//               break;
//           case ("mod"):
//               System.out.println(a % b);
//               break;
//           default:
//               System.out.println("not valid op");
//       }


//        switch (op){
//
//
//        }
    }
}
