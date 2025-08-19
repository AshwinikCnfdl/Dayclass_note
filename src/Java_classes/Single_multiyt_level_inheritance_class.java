package Java_classes;

class A{
    int a = 85;
}

class B extends A{
    int b = 8;
    void add(){
        System.out.println(a + b);
    }
}

class OP extends B{
    void sub(){ System.out.println(a - b);}
    void  mul(){ System.out.println(a * b);}
    void div(){ System.out.println(a / b);}
}

public class Single_multiyt_level_inheritance_class {
    public static void main(String[] args) {
        B b = new B();
        b.add();
        OP op = new OP();
        op.div();
        op.mul();
        op.add();


    }
}
