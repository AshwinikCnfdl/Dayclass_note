package Java_classes;

interface Shoping_Cart{

   abstract void order();
   abstract void reg();
   void login();
   void add_To_cart();
}
class Flipkart implements Shoping_Cart{
      public   void order(){System.out.println("order");}
      public  void reg(){System.out.println("reg");}
      public  void login(){System.out.println("login");}
      public void add_To_cart(){System.out.println("hello");}

}
public class Abstraction_class_demo {
    public static void main(String[] args) {
        Flipkart fp = new Flipkart();
        fp.add_To_cart();
        fp.reg();
    }
}
//NOte:-we can't achieve 100% abstraction using abstract class ?
//   because it allows the normal methods