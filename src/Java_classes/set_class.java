package Java_classes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class set_class {
    public static void main(String[] args) {

        LinkedList<Integer> ial = new LinkedList<>();
        ial.add(45);
        ial.add(4);
        ial.add(89);
        ial.add(84);
        ial.add(89);
        System.out.println(ial);//[45, 4, 89, 84, 89]

        LinkedHashSet set = new  LinkedHashSet();

        set.add(45);
        set.add("hello");
        set.add(45.0);
        set.add(45);
        set.add(89);
        System.out.println(set);//[45.0, 89, hello, 45]
        //LinkedHashSet:--[45, hello, 45.0, 89] it is stored in orderly

        System.out.println(45==45.0);//true

        System.out.println(set.size()); //4
        //remove the values in set
        set.remove(45.0);
        System.out.println(set);

        //adding the multiple values
        set.addAll(ial);//[45, 4, 89, 84, 89]
        System.out.println(set);

        //removig the multiple  values
        set.removeAll(ial);
        System.out.println(set);//["hello"]

        System.out.println(set.contains(45));//false
        set.retainAll(ial);
        System.out.println(set); //[]

        System.out.println(set.isEmpty());




    }
}
