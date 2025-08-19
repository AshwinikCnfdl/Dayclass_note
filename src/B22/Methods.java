package B22;

public class Methods {

    public static void add(int ...x){
      int temp = 0;
      for(int i : x){
          temp = temp+i;
      }
      System.out.println(temp);
    }

    public static void mul(int ...x){
        int temp = 1;
        for(int i : x){
            temp = temp*i;
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {

      add();//[]
      add(12,25);//[12,25]
      add(12,25,36);//[12,25,36]
      add(45,25,36,56,4);//[45,25,36,56,4]
      add(45,25,36,56,4,45,25,36,56,4);//[45,25,36,56,4,45,25,36,56,4]




    }
}
