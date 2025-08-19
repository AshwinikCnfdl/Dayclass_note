package B22;
interface Shopping_cart{
    void login();
    void reg();
    void add_to_cart();
    void order();
}
abstract class Flipkart implements Shopping_cart{

    public void reg(){System.out.println("reg");}
    public void login(){System.out.println("login");}

}
class Flipkart_v1 extends Flipkart{
    public void add_to_cart(){System.out.println("add to cart");}
    public void order(){System.out.println("order");}
}
public class Abstraction_class {

    public static void main(String[] args) {
        Flipkart_v1 fp = new Flipkart_v1();
        fp.login();

    }
}
//100% abstraction using abstract class Why? because it allows the normal methods
//how we can achieve 100% abstraction ? using interface
//Interface:-->
// it allows only abstract methods and final var
// we can't create object for interface




