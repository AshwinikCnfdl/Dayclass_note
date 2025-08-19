package Java_classes;
import java.util.ArrayList;
public class al_class {
    public static void main(String[] args){

        ArrayList al = new ArrayList();

        //adding the elr
        al.add(45);
        al.add("abc");
        al.add("mysore");
        al.add(76451264512l);
        al.add("20-02-2025");
        System.out.println(al);//[45, abc, mysore, 76451264512, 20-02-2025]

        ArrayList<Integer> ial = new ArrayList<>();
        ial.add(45);
        ial.add(4);
        ial.add(89);
        ial.add(84);
        ial.add(89);
        System.out.println(ial);//[45, 4, 89, 84, 89]

        //adding the data in b/w
        al.add(1,"new");
        System.out.println(al);//[45, new, abc, mysore, 76451264512, 20-02-2025]

        //adding the multiple values
        al.addAll(ial);
        System.out.println(al);//[45, new, abc, mysore, 76451264512, 20-02-2025, 45, 4, 89, 84, 89]


        //removing the values
        al.remove("mysore");
        System.out.println(al);//[45, new, abc, 76451264512, 20-02-2025, 45, 4, 89, 84, 89]

        //int values :IndexOutOfBoundsException
//        al.remove(45);

        //remove the int vaues give index num
        al.remove(5);
        System.out.println(al);//[45, new, abc, 76451264512, 20-02-2025, 4, 89, 84, 89]

        //getting the how many ele stored
        System.out.println(al.size());//9

        //getting the multiple values
        System.out.println(al.subList(0,4));//[45, new, abc, 76451264512]

        //to check ele is present or not
        System.out.println(al.contains("new"));

        //[45, 4, 89, 84, 89] except [45, new, abc, 76451264512, 20-02-2025, 4, 89, 84, 89]
        al.retainAll(ial);
        System.out.println(al); //[45, 4, 89, 84, 89]

    }

}
