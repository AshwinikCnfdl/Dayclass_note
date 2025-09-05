package nucotB_26;
import java.util.*;
import java.util.PriorityQueue;

public class Collections_ {

 static    void  Array_list_demo(){
        ArrayList  al = new ArrayList();
        al.add(25);
        al.add(56.36);
        al.add("hello");
        al.add('c');
        al.add(true);
        System.out.println(al);//[25, 56.36, hello, c, true]

       ArrayList<Integer> ial = new ArrayList<>();
       ial.add(45);
       ial.add(29);
       ial.add(85);
       ial.add(86);
//       ial.add("hello");
       System.out.println(ial);//[45, 29, 85, 86]

        //add multiple_ele
     al.addAll(ial);
     System.out.println(al); //[25, 56.36, hello, c, true, 45, 29, 85, 86]

     //inset values in b/w
     al.add(1,"new");
     System.out.println(al); //[25, new, 56.36, hello, c, true, 45, 29, 85, 86]

     //remove the ele
     al.remove("hello");
     System.out.println(al);//[25, new, 56.36, c, true, 45, 29, 85, 86]
//     al.remove(25); //IndexOutOfBoundsException
     al.remove(0);
     System.out.println(al); //[new, 56.36, c, true, 45, 29, 85, 86]

     al.removeAll(ial);//[45, 29, 85, 86]
     System.out.println(al);//[new, 56.36, c, true]

     al.get(1);
     System.out.println(al.contains("new"));
     System.out.println(al.isEmpty());

     Object cal = al.clone();
     System.out.println(cal);

     al.clear();
     System.out.println(al);




    }
    static    void  Linked_list_demo(){
        LinkedList al = new LinkedList();
        al.add(25);
        al.add(56.36);
        al.add("hello");
        al.add('c');
        al.add(true);
        System.out.println(al);//[25, 56.36, hello, c, true]

        ArrayList<Integer> ial = new ArrayList<>();
        ial.add(45);
        ial.add(29);
        ial.add(85);
        ial.add(86);
//       ial.add("hello");
        System.out.println(ial);//[45, 29, 85, 86]

        //add multiple_ele
        al.addAll(ial);
        System.out.println(al); //[25, 56.36, hello, c, true, 45, 29, 85, 86]

        //inset values in b/w
        al.add(1,"new");
        System.out.println(al); //[25, new, 56.36, hello, c, true, 45, 29, 85, 86]

        //remove the ele
        al.remove("hello");
        System.out.println(al);//[25, new, 56.36, c, true, 45, 29, 85, 86]
//     al.remove(25); //IndexOutOfBoundsException
        al.remove(0);
        System.out.println(al); //[new, 56.36, c, true, 45, 29, 85, 86]

        al.removeAll(ial);//[45, 29, 85, 86]
        System.out.println(al);//[new, 56.36, c, true]

        //[new, 56.36, c, true]
        System.out.println(" *******************   ");

        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al.peekFirst());
        System.out.println(al.peekLast());
        //remove first and last
        al.pollFirst();
        al.pollLast();
        System.out.println(al);
        System.out.println(al.contains("new"));
        System.out.println(al.isEmpty());
        Object cal = al.clone();
        System.out.println(cal);
        al.clear();
        System.out.println(al);
        ArrayList<Integer> ial1 = new ArrayList<>();
        ial1.add(45);
        ial1.add(29);
        ial1.add(85);
        ial1.add(86);
        Collections.sort(ial1);
        System.out.println(ial1); //[29, 45, 85, 86]

    }

  static void set_hash_set(){

      HashSet hs = new HashSet();
      hs.add(45);
      hs.add("hello");
      hs.add(45.56);
      hs.add(true);
      hs.add('v');
      System.out.println(hs); //[v, 45.56, hello, 45, true]

      HashSet<String> shs = new HashSet<>();
      shs.add("hello");
      shs.add("hai");
      shs.add("how");
      shs.add("you");
      System.out.println(shs); // [hai, how, hello, you]
      hs.addAll(shs);
      System.out.println(hs);// [hai, how, v, 45.56, hello, 45, you, true]

      hs.remove(45.56);
//      hs.removeAll(shs);
//      System.out.println(hs); //[v, 45, true]

      System.out.println(hs.contains(45));

      hs.retainAll(shs);
      //shs =  [hai, how, hello, you]
      //hs =  [hai, how, v, hello, 45, you, true]
      System.out.println(hs); //[hai, how, hello, you]

    }
    static void set_Lined_hash_set(){

      LinkedHashSet hs = new LinkedHashSet();
        hs.add(45);
        hs.add("hello");
        hs.add(45.56);
        hs.add(true);
        hs.add('v');
        System.out.println(hs); //[45, hello, 45.56, true, v]

        HashSet<String> shs = new HashSet<>();
        shs.add("hello");
        shs.add("hai");
        shs.add("how");
        shs.add("you");
        System.out.println(shs); // [hai, how, hello, you]
        hs.addAll(shs);
        System.out.println(hs);// [hai, how, v, 45.56, hello, 45, you, true]

        hs.remove(45.56);
//      hs.removeAll(shs);
//      System.out.println(hs); //[v, 45, true]

        System.out.println(hs.contains(45));

        hs.retainAll(shs);
        //shs =  [hai, how, hello, you]
        //hs =  [hai, how, v, hello, 45, you, true]
        System.out.println(hs); //[hai, how, hello, you]

    }

    static  void priorityQueue(){

        PriorityQueue pq = new PriorityQueue();
        pq.add(45);
//        pq.add("hello"); //ClassCastException
//        pq.add(null);//NullPointerException

        pq.add(58);
        pq.add(85)  ;
        pq.add(89);
        System.out.println(pq);
        PriorityQueue pq1 = new PriorityQueue();
        pq1.add(25);
        pq1.add(50);

        pq.addAll(pq1);
        System.out.println(pq); //[25, 45, 50, 89, 58, 85]

        pq.remove(25);
        System.out.println(pq); //[45, 58, 50, 89, 85]

        pq.removeAll(pq1);
        System.out.println(pq); //[45, 58, 89, 85]

        System.out.println(pq.contains(45));
        System.out.println(pq.peek()); // 45
        pq.poll(); // 45
        System.out.println(pq); ////[ 58, 89, 85]
        pq.clear();
        System.out.println(pq);//[]
 }


    static void map_demo(){

        HashMap hm = new HashMap();

        hm.put("name" , "abc");
        hm.put("age" , 45);
        hm.put("ph" , 78946134657l);
        hm.put("adhar_num", 79485127984652145l);
        hm.put(45 , 79865);

        System.out.println(hm);//{nme=abc, ph=78946134657, adhar_num=79485127984652145, 45=79865, age=45}

        //getting the values
       System.out.println( hm.get("name"));
       System.out.println(hm.get("ph"));

       //gettign the keys
        System.out.println(hm.keySet()); // list of keys:[name, ph, adhar_num, 45, age]
        System.out.println(hm.values()); // list of values:[abc, 78946134657, 79485127984652145, 79865, 45]
        System.out.println(hm.entrySet()); // key and values, list:[name=abc, ph=78946134657, adhar_num=79485127984652145, 45=79865, age=45]

        //remving
        hm.remove("name");
        System.out.println(hm);//{ph=78946134657, adhar_num=79485127984652145, 45=79865, age=45}

        hm.replace("ph" , 7946512978452105l);
        System.out.println(hm);//{ph=7946512978452105, adhar_num=79485127984652145, 45=79865, age=45}

        System.out.println(hm.containsKey("name"));
        System.out.println(hm.containsValue(45));

       HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
       LinkedHashMap<String,Integer> lhm = new  LinkedHashMap<String,Integer>();
       lhm.put("a" , 45);
       lhm.put("b" , 89);
       lhm.put("h" , 78);
       System.out.println(lhm); //{a=45, b=89, h=78}
    }
    public static void main(String[] args) {
//     priorityQueue();
//        Array_list_demo();
//        Linked_list_demo();
//        set_hash_set();
//        set_Lined_hash_set();
        map_demo();
    }

}
