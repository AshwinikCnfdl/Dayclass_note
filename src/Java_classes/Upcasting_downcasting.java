package Java_classes;

class m{
    void no_file_read(){System.out.println("u can't read a file");}
}
class m1 extends m{
    void pdf(){System.out.println("text");}
}

public class Upcasting_downcasting {

    public static void main(String[] args) {

        m v = new m1(); //hiding the m1 proper
        v.no_file_read();

        //getting the per
        m1 v1 = (m1)v;//child obj = (child) upcasted_var
        v1.pdf();

    }}

