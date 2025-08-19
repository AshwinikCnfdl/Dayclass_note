package Java_classes;

interface A1{
    int a = 45;                   // try this
    void dis();
}

interface  AB{
    int b = 589;
    int a = 25;
    void dis();
}
interface C extends A1,AB {
    int c = 85;
}
//class Demo implements  C{ // reference to a is ambiguous
////   public void dis(){System.out.println( a + " " + b  + " " +  c);
//   }

//}
public class mulp_in_interface {
    public static void main(String[] args) {
//        Demo d1 = new Demo();
//        d1.dis();
    }
}
