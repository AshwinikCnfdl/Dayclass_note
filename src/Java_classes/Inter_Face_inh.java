package Java_classes;

interface B1{
    void reg();
    void login();
}
interface B2 extends B1{
    void order();
    void add_to_cart();
}
interface B3 extends B2{
    void whish_list();
}

abstract class FlipKart implements B3{
    public void reg(){System.out.println("reg");}
    public void login(){System.out.println("login");}
}
class Flipkart1 extends FlipKart{
    public void order(){System.out.println("order");}
    public void add_to_cart(){System.out.println("add_to_cart");}
    public void whish_list(){System.out.println("whish_list");}

}

public class Inter_Face_inh {
    public static void main(String[] args) {
        Flipkart1 fp = new Flipkart1();

    }
}
