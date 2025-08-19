package nucotB_26;
interface Shoping_cart{
     void reg(long ph,int otp,String add);
     void login(long ph);
     void order();
     void add_to_Cart();
}
class Flipkart implements Shoping_cart{
    long ph;
   public void reg(long ph,int otp,String add){
        System.out.println("reg");
        this.ph = ph;
    }
    public void login(long ph){
        if(this.ph == ph){
            System.out.println("login");
        }
        else{
            System.out.println("go and reg");
        }
    }
     public void order(){System.out.println("order");}
    public void add_to_Cart(){System.out.println("add to cart");}
}
public class Abstraction {
    public static void main(String[] args) {
        Flipkart fp = new Flipkart();
        fp.reg(123456789l, 1234,"mysore");
        fp.login(7984654654l);
        fp.order();
    }
}
//
//abstract method and abstract class Why?
//we can't achieve 100% abstraction using abstract class so we go interface
//why we can't achieve 100% abstraction using abstract class?
// because it allows the normal methods
//class to interface we make use of implements keywords

