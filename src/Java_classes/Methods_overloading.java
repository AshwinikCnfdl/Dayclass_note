package Java_classes;

public class Methods_overloading {

    void add(int a,int b){ System.out.println(a+b);}
    void add(double a, double b){System.out.println(a+b);}
    void add(int a,int b, int c){System.out.println(a+b+c);}
    void add(double a,double b, double c){System.out.println(a+b+c);}

    public static void main(String[] args) {
        Methods_overloading m = new Methods_overloading();
        m.add(45,25);//2 num int addition
        m.add(12.5,256.5,25.4);//3 num decimal addition
//        how it poly:add method showing the diff behav based in arguments
        //comp:-->

    }
}
