package nucotB_26;

public class Methods_ {

    public int add(int a,int b){
        int sum = a + b;
        return sum;
    }

    public  static int static_add(int a,int b){
        int sum = a + b;
        return sum;
    }



    public static void main(String[] args) {
      //non static methods

        Methods_ m = new Methods_();
      int sum1 =   m.add(45,25);
      System.out.println(sum1);
       System.out.println( m.add(25,63));
        System.out.println(m.add(56,25));
        System.out.println( m.add(56,29));

        static_add(145,25);
        static_add(45,69);

    }




}
