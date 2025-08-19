package Java_classes;

public class Methods_class {
    public static int add(int ...a){//var   [12,25,35,56,25]
        int temp = 1;
        for(int i : a){
            temp = i * temp;
        }
        return temp;
    }

    public static void disp_msg(String msg){ //invalid method declaration; return type required
        System.out.println(msg);
    }
    //wa methodfor even or odd
    public static void even_odd(int num){
        if(num % 2 ==  0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void qure_num(int num){
        System.out.println(num * num);
    }

    public static void qube_num(int num){
        System.out.println(num * num*num);
    }

    public static void power_num(int num,int power){
        int temp = 1;
        for(int i = 1; i <= power;i++) {
            temp = temp * num;
        }
        System.out.println(temp);
    }
    public static void fact_num(int num){
        int temp = 1;
        for(int i = 1; i <= num;i++) {
            temp = temp * i;
        }
        System.out.println(temp);
    }

//wap prog to print 10 times hello without using the loop

public static void hello_10(int num){ //invalid method declaration; return type required
        if(num > 0) {
            System.out.println("hello");
            num --;
            hello_10(num);//.StackOverflowError
        }

}
//wap to print how many digits present int he num without using any loops
    //4567 ; o/p = 4
    //231 ; o/p = 3
    //984652 ; o/p = 6

    public static void main(String[] args) {

        hello_10(5);

//        power_num(5,5);
//        disp_msg("hello i am from mehods");
//        int sum = add(12,25,35,56,25);
//        System.out.println(sum);
//        System.out.println(add(12,25,35));
//        System.out.println(add(12,25,35,56,25,12,25,35,56,25));
//        System.out.println(add());
//        System.out.println(add(1));
//        System.out.println(add());


    //we should not write one method inside another method, we should write  out the side the method
//    public static int add(int a,int b){
//        int sum = a + b;
//        return sum;
//    }
//    public static int sub(int a,int b){
//        int sum = a - b;
//        return sum;
//    }
//    public static int mul(int a,int b){
//        int sum = a * b;
//        return sum;
//    }
//    public static int div(int a,int b){
//        int sum = a / b;
//        return sum;
//    }
//    public static int mod(int a,int b){
//        int sum = a % b;
//        return sum;
//    }
//    public static void main(String[] args) {
//
//        //inorder to exg the methods we need to call methods
//        //we call methods with help of method name
//           int sum = add(25,32);
//            System.out.println(sum);
//            System.out.println(add(12,56));
//            System.out.println(sub(12,56));
//            System.out.println(mul(12,56));
//            System.out.println(div(12,56));



        //methods:-->task
        //add (12,56),(25,32),(56,25),(8,9),(10,26)
//        int a1 = 12;
//        int b1 = 56;
//        int sum1 = a1 + b1;
//
//        int a2 = 25;
//        int b2 = 32;
//        int sum2 = a2 + b2;
//
//        int a3 = 56;
//        int b3 = 25;
//        int sum3 = a3 + b3;
//
//
//        int a4 = 8;
//        int b4 = 9;
//        int sum4 = a4 + b4;
        //3lines 3var
        //100set of data var 300 m/m



    }
}
