package B22;

public class Re_methods {

    static  void  msg(int count){
        if(count > 0) {
            System.out.println("hello");
            count--;
            msg(count);
        }
        //StackOverflowError
    }
    static  void even_num(int num,int count){
       if(count > 0) {
           if (num % 2 == 0) {
               System.out.println(num);
               count--;
           }
           num++;
           even_num(num, count);
       }
    }
    public static void main(String[] args) {

//array:-->nd
        even_num(15,3);


    }
}
