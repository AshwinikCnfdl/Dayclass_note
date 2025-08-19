package Java_classes;

import java.util.Scanner;

class Whats_App{
    long ph ;
    Whats_App(long ph){
        this.ph = ph;
    }
    void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ph num");
        long ph = sc.nextLong();
        if(this.ph == ph){
            System.out.println("login");
        }
        else{
            System.out.println("in valid ph");
            login();}}
}

public class Day1 {
    public static void main(String [] args){
        Whats_App w1 = new Whats_App(12346789);

        w1.login();


//        System.out.println(w1.ph);//84512784578452
//        w1.set_ph(784653219784652l);
//        System.out.println(w1.ph);// 784653219784652

//        Whats_App w1 = new Whats_App(796453122245l);
//        Whats_App w2 = new Whats_App(7984653784l);
//        Whats_App w3 = new Whats_App(7945613779545l);
//
//        System.out.println(w1.ph);
//        System.out.println(w2.ph);
//        System.out.println(w3.ph);


    }
}
