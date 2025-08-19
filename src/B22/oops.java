package B22;

class Cal{
    int a ;//25
    int b ;//63
    Cal(int a,int b){
        this.a = a;
        this.b = b;
    }
//    void set(int a,int b){
//        this.a = a;
//        this.b = b;
//    }
    void add(){
        System.out.println(a + b);
    }}
public class oops {
    public static void main(String[] args) {
        Cal c = new Cal(12,56);
        c.add();

        Cal c1 = new Cal(89,25);
        c1.add();



    }
}

