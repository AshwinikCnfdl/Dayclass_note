package Java_classes;

public class Whatsapp_Const_over_loading {

    Whatsapp_Const_over_loading(String name,String status){
        System.out.println("name = " + name + " Status = " + status );
    }
    Whatsapp_Const_over_loading(){
        this("xyz","bad");

        System.out.println(" name is abc Status = hey i am using whatsapp");

    }
    Whatsapp_Const_over_loading(String name){
        this("xyz","bad");

        System.out.println(" name is abc Status = hey i am using whatsapp");

    }


    public static void main(String[] args) {

        Whatsapp_Const_over_loading w = new Whatsapp_Const_over_loading();
//        Whatsapp_Const_over_loading w1 = new Whatsapp_Const_over_loading("xyz" , "good");
    }
}


//this keyword:-- diff the local global var / it return current instance address
//this() :-- it call the one const inside other const which is present in the same names
//rule:--1. first statement should be this()
/* exg : Whatsapp_Const_over_loading(){

        System.out.println(" name is abc Status = hey i am using whatsapp");
        this("xyz","bad"); //error
    }
// recursion calling not allowed
/* Whatsapp_Const_over_loading() {
this()
 System.out.println(" name is abc Status = hey i am using whatsapp");} */

//multiple this() we should not using in one cons