package nucotB_26;

class method_over_loading{
    void add(double a , double b)
    {
        System.out.println(a + b);
    }
    void add(int a,int b){
        System.out.println(a + b);
    }
    void add(double a , double b , double c)
    {
        System.out.println(a + b + c);
    }
    void add(int a,int b , int c){
        System.out.println(a + b + c);
    }
}
public class Poly {
    public static void main(String[] args) {
        method_over_loading m = new method_over_loading();
        m.add(12,36); //add 2 var
        m.add(15,25,36); // add 3 var
        m.add(12.23,25.36,2.3);//add 3 decimal
    }
}
//method overloading :-->
