package nucotB_26;

//non_static var using same class:-->dec without static keyword,object/instance
//

final public class Var_class {

   final static int a = 78;
   final int b = 78;

 final   public static void main(String[] args) {

      final  double pi = 3.147;
//        pi = 7865; //cannot assign a value to final variable pi
        System.out.println(pi);

    }

}
//final:--local var as final/static/non static / methods/class we can make final
//can not make final:--abstract class/abstract methods / interfaces





//    int a = 56;
//        Var_class obj = new Var_class();
//        //new:--it create a object
//        System.out.println(obj.a);
//        System.out.println(obj.b);
//
//        Day1 obj1 = new Day1();
//        System.out.println(obj1.c);
//    int b = 89;










//   static int static_var = 45;
//   static int a;
//        System.out.println(static_var);//45
//        System.out.println(a);//0
//
//
//        //class_name.var_name
//        System.out.println(Day1.static_var_out_side_class);// cannot find symbol




//note:-- what and all var dec inside a method/flow control st blocks those we call it local var
//        without initializing we can use local var

//int a;
//        System.out.println(a); //variable a might not have been initialized

//        {
//            int a = 96;
//            System.out.println(a);
//
//        }
////        System.out.println(a); //error with in the block u can use

//class Var_class{}

//        int pin;
//        double amount;
//        String name;
//
//        //note:--> in java we should not dec var/method/name two time
////        int pin;//error
//
//       //initialization
//        pin = 456;
//        amount = 56.23;
//        name = "Abc";
//
//        //utilization
//        System.out.println(pin);
//        System.out.println(amount);
//        System.out.println(name);
