package nucotB_26;

public class rec {

    static void msg(int count){
        if(count > 0) {
            System.out.println("hello");
            count --;
            msg(count);
        }


    }

    static void even_num(int sp , int ep){

        if(sp > ep){
            return;
        }
        else{
            if(sp % 2 == 0){
                System.out.println(sp);
            }
            sp++;
            even_num(sp,ep);
        }


//       //for(int i = sp ; i <= ep;i++)
//        {
//            if(i% 2 == 0){
//                System.out.print(i);
//            }
//        }
    }
    static void range(int sp,int ep){
        if(sp > ep){
            return;
        }
        else{
            System.out.println(sp);
            sp++;
            range(sp,ep);
        }
    }
    public static void main(String[] args) {
//        msg(10);
        //print 1 to 10 even num
//        even_num(1,10);
//        even_num(50,150);
        range(100,200);

    }
}

//wap to print hello msg 10 times using rec/without a loop