package Java_classes;
class Adhar_cart{
    private long adhar_num = 7984567845845254l; //get
    private long ph = 485245545146545l; //get  //set
    private String name = "abc"; //get //set
    private String dob = "20-02-2025"; //get  //set
    //setter:--modify  getter:read/see
        void get_adhar_num(){
            System.out.println(adhar_num);
        }
        void get_name(){
            System.out.println(name);
        }
        void get_dob(){System.out.println(dob);}
        void get_ph(){System.out.println(ph);}

        void set_name(String name){
            this.name = name;
        }
        void set_dob(String dob){this.dob = dob;}
        void set_ph(long ph){this.ph = ph;}
}
public class Encapsulation {
    public static void main(String[] args) {
        Adhar_cart a = new Adhar_cart();
        a.get_name();
        a.set_name("xyz");
        a.get_name();
        a.get_adhar_num();



    }


}
//