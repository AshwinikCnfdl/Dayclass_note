package Selenium_java_B17_9;

//
public class methods {
    public static void  add(int ...a){
        int temp = 0;
        for(int i : a){
            temp += i;
        }
        System.out.println(temp);

    }

    public static void mul(int ...a){
        int temp = 1;
        for(int i : a){
            temp *= i; //temp = temp * i
        }
        System.out.println(temp);
    }
//    public void disp_msg(String msg){
//        System.out.println(msg);
//    }
    public static void main(String[] args) {

        add(45,25,52);
        add(25,3,25);
        add(12,25);
        add();
        add(89,28,5,8,9,5,6,78);

        mul(45,25,52);
        mul(25,3,25);
        mul(12,25);
        mul();
        mul(89,28,5,8,9,5,6,78);











        //(45,25),(89,52),(89,25)
//        System.out.println( add(45,25));
//        System.out.println( add(89,52));
//        System.out.println( add(89,25));
//
//        System.out.println(demo.sub(45,25));
//        System.out.println(demo.sub(45,8));
//        System.out.println(demo.sub(5,2));
//
//        System.out.println(demo.power_num(2,5));

    }

//    public static int sub(int a,int b){
//        int sum = a-b;
//        return sum;
//    }
}
