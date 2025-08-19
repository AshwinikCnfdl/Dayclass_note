package B22;

public class Static_var {

    //nonstatic :-- without static keyword , we also object/instance var because it belongs to object
    //outside methods inside class
    int non_Static_var = 89;
    int a = 96;
    int d = 89;

    public static void main(String[] args) {

//        System.out.println(new Static_var().non_Static_var); //inorder to use non staitc var we need to create object /new keyword
//        System.out.println(new Static_var().a);
//        System.out.println(new Static_var().d);

        //only one object
        //how to create object
//       class_name object_name = new class_name();
//        Static_var obj = new Static_var();
//        System.out.println(obj.non_Static_var);
//        System.out.println(obj.a);
//        System.out.println(obj.d);
//
//        Demo12 obj1 = new Demo12();
//        System.out.println(obj1.f);

//     System.out.println(   Methods.add1(45,8));


    }
}

class Demo12{
  static  int outseide_static_var = 89;
    int f;

}

