package Java_classes;

class ph_con{
    long c1 = 8452485845645l;
    long c2 = 654210654265546l;

}
class Ph_call extends ph_con{
    void Call(){
        System.out.println( "i am calling to "   + c1);
    }
}
class Whats_call extends ph_con{
    void Call(){
        System.out.println( "i am calling to "   + c2);
    }
}
class True_Caller_call extends ph_con{

    void Call(){
    System.out.println( "i am calling to "   + c1);
}}
public class Hierarchical_in {
    public static void main(String[] args) {
        Ph_call p = new Ph_call();
        p.Call();
    }

}
