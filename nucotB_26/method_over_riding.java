package nucotB_26;

class V1{
    void msg(){
        System.out.println("text msg");
    }

}
class V2 extends V1{
    void msg(){
        System.out.println("text msg");
        System.out.println("img");
        System.out.println("gif");
    }
}

public class method_over_riding {
    public static void main(String[] args) {
        V1 v = new V1();
        v.msg();
        //run time
        V2 v2  = new V2();
        v2.msg();

    }
}
