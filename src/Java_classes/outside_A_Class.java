package Java_classes;

public class outside_A_Class {
    public static void main(String[] args) {
        System.out.println(Inside_A_class.public_var);
        System.out.println( Inside_A_class.protected_var);
        System.out.println( Inside_A_class.def);
//        System.out.println(Inside_A_class.private_var); // u can't access outside a clas
    }
}
