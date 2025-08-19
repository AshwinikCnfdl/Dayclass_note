package Java_classes;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class sorting_arra {
    public static void main(String[] args) {
        LinkedList<Integer> ial = new LinkedList<>();
        ial.add(45);
        ial.add(4);
        ial.add(89);
        ial.add(84);
        ial.add(89);
        System.out.println(ial);//[45, 4, 89, 84, 89]

        Collections.sort(ial);
        System.out.println(ial);//[4, 45, 84, 89, 89]

        int s = ial.getFirst();//4
        int l = ial.getLast();//89
    }
}
