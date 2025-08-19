package Java_classes;

class super_class{

    super_class(int a){
        System.out.println("i am from 1st const " + a);
    }
}
class subclass extends super_class{
    subclass(int a){
        super(56);
        System.out.println("i am from 2nd const");
    }
}

public class Super_method {
    public static void main(String[] args) {
        subclass s = new subclass(79854);

    }
}
//super():-- calling one const inside other const which is present ing the diff class
// passing the arguments for super const in subclass