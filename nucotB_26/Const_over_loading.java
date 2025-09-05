package nucotB_26;

class Demo_con_over{
    Demo_con_over(){
       this(12);
        System.out.println("i am from 0 arg cons");

    }
    Demo_con_over(int a){
        System.out.println("i am from 1 arg cons");}

    Demo_con_over(int a,int b){
        System.out.println("i am from 2 arg cons");}

}
//super()
//this():-->
public class Const_over_loading {
    public static void main(String[] args) {
        Demo_con_over d = new Demo_con_over();


    }
}
