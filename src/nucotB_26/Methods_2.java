package nucotB_26;

public class Methods_2 {

    public static void fact(int num ){ // 5*4*3*2*1
        int temp = 1;
        for(int i = num ; i > 0;i--){
            temp = temp*i;
        }
        System.out.println(temp);
    }

    public static void add(int a,int b){
       System.out.println(a + b);
    }
    public static void sub(int a,int b){
        System.out.println(a - b);
    }
    public static void mul(int a,int b){
        System.out.println(a * b);
    }
    public static void div(int a,int b){
        System.out.println(a / b);
    }
    public static void mod(int a,int b){
        System.out.println(a % b);
    }

    public static void squre(int a){
        System.out.println(a * a);
    }
    public static void cub(int a){
        System.out.println(a * a * a);
    }
    public static void main(String[] args) {

        fact(5);
        fact(3);


    }

    public static void even_odd(int num){
        if(num % 2 == 0){
            System.out.println(num +" is even num");
        }
        else {
            System.out.println(num + " is odd num");
        }

    }

    public static void range(int sp , int ep){
        for(int i = sp;i <= ep; i++){
            System.out.println(i);
        }
    }

    public static void range_odd(int sp , int ep){
        for(int i = sp;i <= ep; i++){
            if(i%2!=0) {
                System.out.println(i);
            }}
    }


    public static void msg(){//invalid method declaration; return type required
        System.out.println("hello");
    }

    //wap to print range


}
//void:-->
//wa methods to print given num is even or odd