package Java_classes;

class Whats_appv1{
    void msg(){System.out.println("we can send text msg");}
}
class Whats_appv2 extends Whats_appv1{
    void msg(){
        System.out.println("we can send Text msg");
        System.out.println("we can send img");
    }

}
class Whats_appv3 extends Whats_appv2{
    void msg(){
        System.out.println("we can send Text msg and img and gif");
    }}
public class Run_time_poly {

    public static void main(String[] args) {
        Whats_appv1 v1 = new Whats_appv1();
        v1.msg();

        Whats_appv2 v2 = new Whats_appv2();
        v2.msg();

        Whats_appv3 v3 = new Whats_appv3();
        v3.msg();


    }
}
//run time :--> method dec and def binds at run time
//Dynamic poly:--> once u bind can rebind then
