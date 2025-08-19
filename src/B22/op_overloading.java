package B22;

class method_over_loding{

    method_over_loding(int a){
        System.out.println("i am from first const");}
    method_over_loding(int a,int b){
        System.out.println("i am from second const");}
    method_over_loding(){
        this(12,12);
        System.out.println("i am from 3rd  const");}

}
public class op_overloading {
    public static void main(String[] args) {
        method_over_loding m = new  method_over_loding();

    }
}
