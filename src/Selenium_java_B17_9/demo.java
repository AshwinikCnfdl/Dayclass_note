package Selenium_java_B17_9;

public class demo {
    public static int sub(int a,int b){
        int sum = a-b;
        return sum;
    }

    public static int squre(int a){
        return a * a;
    }
    public static int cube(int num){
        return num * num *num;
    }

    public static int power_num(int num ,int p){
        int temp = 1;
        for(int i = 1 ; i <=p ; i++){//5
            temp *= num;
        }
        return temp;
    }
}
