package nucotB_26;

interface A{
    int a = 89;
    void add();
    void sub();
}
abstract class Demo implements A{
    void disp(){
        System.out.println("a = " + a );//reference to a is ambiguous
    }
  public void add(){
        System.out.println(45+63);
    }
}
class Demo1 extends Demo{
    public void sub(){
        System.out.println(45-20);
    }
}
public class Multiple_inher_interface {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.disp();
    }
}

