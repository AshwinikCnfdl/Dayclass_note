package Java_classes;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map_Classes {
    public static void main(String[] args) {
        //name = abc
        //age = 45
        //pin = 3214
        //ph = 9965447946

//        map
        LinkedHashMap hm = new LinkedHashMap();
        //adding the key vales
        hm.put("name" , "abc");
        hm.put("age" , 45);
        hm.put("pin",3214);
        hm.put("ph",7984651798465l);
        hm.put("name" , "xyz");
        System.out.println(hm); //{pin=3214, name=xyz, ph=7984651798465, age=45}
        //linkedhasmap : {name=xyz, age=45, pin=3214, ph=7984651798465}
        //getting the values
        System.out.println(hm.get("name")); //xyz

        //getting the all key and values
        System.out.println(hm.entrySet()); //[pin=3214, name=xyz, ph=7984651798465, age=45]

        //gettignt he only keys
        System.out.println(hm.keySet());//[pin, name, ph, age]

        //getting the only values
        System.out.println(hm.values());//[3214, xyz, 7984651798465, 45]

        //removing the key and values
        hm.remove("name");
        System.out.println(hm); //{pin=3214, ph=7984651798465, age=45}

        //we can give map to for loop
       for(Object keys : hm.keySet()){
           System.out.println(hm.get(keys));
       }
    }
}
