package Java_classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Que_Class {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(25);
        al.add(63);
        al.add(58);

        PriorityQueue q = new PriorityQueue();//it not allow the null data
        //ClassCastException :-- it allow to store only one type
        //first type what u enter u should store same data otherwise u will get ClassCastException
        q.add(45);
        q.add(56);
        q.add(89);
        q.add(45);
        q.add(89);
//        q.add(null); //NullPointerException :-- when we're adding null values to que it throw the null point exception
        System.out.println(q); //[[45, 45, 89, 56, 89]

        q.addAll(al); //[25,63,58]
        System.out.println(q);//[25, 45, 45, 56, 89, 89, 63, 58]

        //removing the ele
         q.remove(56);
         System.out.println(q); //[[25, 45, 45, 58, 89, 89, 63]

       System.out.println( q.contains(89)); //true
        System.out.println(q.peek()); //25
        System.out.println(q.poll());//25 gives me first ele and remove
        System.out.println(q); //[45, 58, 45, 63, 89, 89]

        System.out.println(q.size()); //6

        //iter
        //all collection List,que,set
        //all collections iterable objects
        Iterator iob = q.iterator(); //[45,58,45,63,89,89]
        System.out.println(iob); //java.util.PriorityQueue$Itr@49c2faae
        //getting the values from iter
//        System.out.println(   iob.next()); // 45
//        System.out.println(   iob.next()); //58
//        System.out.println(   iob.next());//45
//        System.out.println(   iob.next());//63
//        System.out.println(   iob.next());//89
//        System.out.println(   iob.next());//89
//        System.out.println(   iob.next());//NoSuchElementException

        //loop :-- While loop
        System.out.println(iob.hasNext());//if next ele is present then it rerun the True
        while (iob.hasNext()) {
            System.out.println(   iob.next());
        }






        q.clear();
        System.out.println(q);

















//        PriorityQueue<String> sq = new PriorityQueue<>();
//        sq.add("hello");
//        sq.add("how");
//        sq.add("hi");
//        System.out.println(sq);





    }
}
//Java:-->
//WHat is java ? WHy java ?
//why java platform independent :-- comp :-- .class file
//how to set System evn var
// how to run java code using notepad
//