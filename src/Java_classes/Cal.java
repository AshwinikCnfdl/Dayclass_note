package Java_classes;

public class Cal {

    int a ;
    int b ;

  void  Cal1(int a,int b){
        this.a = a;
        this.b = b;
    } //const

    void add(){
        System.out.println(a + b);
    }

    void sub(){
        System.out.println(a - b);

    }

    void mul(){
        System.out.println(a * b);
    }

    void div(){
        System.out.println(a / b);
    }

    void mod(){
        System.out.println(a % b);

    }

    public static void main(String[] args) {

        Cal obj = new Cal();
        System.out.println(obj.a);
       obj.Cal1(415,2);
        System.out.println(obj.a);

        //class_name object_name = new class_name();
        //once u create a class u can create n num of objects
//        Cal obj1 = new Cal(25,96);//while creating the object we need to pass arguments for const
//        System.out.println(obj1.a);
//        System.out.println(obj1.b);
//
//        Cal obj2 = new Cal(30,2);
//        System.out.println(obj2.a);
//        System.out.println(obj2.b);



    }

}
