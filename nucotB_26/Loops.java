package nucotB_26;

public class Loops {
    public static void main(String[] args) {
        //wap to print 10 time hello msg
//        for(int count = 1; count <= 5; count++){
//            System.out.println("hello");
//        }
//        //wap to print 1 to 10 num
//        for(int num = 1;num <= 10;num++){
//            System.out.println(num);
//        }

//        for(int num = 10;num > 0;num--){
//            System.out.println(num);
//        }

        //1 to 10 even num
        for(int num = 1;num <= 10;num++){
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
        //1 to 10 odd num
        for(int num = 1;num <= 10;num++){
            if(num % 2 != 0){
                System.out.println(num);
            }
        }

    }
}
