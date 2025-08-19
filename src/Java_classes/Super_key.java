package Java_classes;


class ClassSuper{

    int a = 60;
    void dis(){
        System.out.println(a);
    }

}
class ClassSub extends ClassSuper{
    int a = 40 ;
    void dis(){
        System.out.println(a);
        System.out.println(super.a);//diff super class and subclass var when we have same names
    }
}
public class Super_key {
    public static void main(String[] args) {
        ClassSub c = new ClassSub();
        c.dis();

    }
}

