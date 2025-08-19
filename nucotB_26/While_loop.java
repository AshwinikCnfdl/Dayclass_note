package nucotB_26;

public class While_loop {
    public static void main(String[] args) {



        for(int i = 1;i <= 16;i ++){
            if(i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
//wap to print 10 even num starting from 150
//print 1,2,4,5,7,8,10,11,14,16