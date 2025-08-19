package nucotB_26;


import java.util.Scanner;

class Bank{
    Scanner sc;

    private  String name = "abc";
    private String ifse = "a12BD";
    private int amount = 5000;
    private long acc_num = 789874896546511L;
    private int pin = 45678;

    void  get_name(int pin){
        if(this.pin == pin) {
            System.out.println(name);
        }
        else{
            System.out.println("try again");
        }
    }
    void get_ifse(){
        if(this.pin == pin) {
            System.out.println(ifse);
        }
        else{
            System.out.println("try again");
        }
    }
    void getAmount(){
        if(this.pin == pin) {
            System.out.println(amount);
        }
        else{
            System.out.println("try again");
        }
    }
    void get_acc_num(){
        if(this.pin == pin) {
            System.out.println(acc_num);
        }
        else{
            System.out.println("try again");
        }
    }

    void setPin(int opt){
        if(opt == 1234){
            System.out.println("enter the npin");
            sc = new Scanner(System.in);
            pin = sc.nextInt();
            System.out.println("done");
        }
        else{
            System.out.println("try again");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.get_name(45678);
        b.setPin(1234);
    }
}
