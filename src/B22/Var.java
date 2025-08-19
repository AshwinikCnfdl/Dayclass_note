package B22;

public class Var {
    public static void main(String[] args) {

        //3setps
        //declaration
//        data_type  var_name;
        int pin ;
        String name;
        long ph;
        char data;

        //initialization

        pin = 560056;
        name = "abc";
        ph = 7896541232l;
        data = 'a';
//        int pin; // no re declaration  variable pin is already defined in method main
        pin = 46523;//re initialization

//        var_name = values
        //utilization
//        using  s.o.p(var_name)

        System.out.println(pin);
        System.out.println(name);
        System.out.println(ph);
        System.out.println(data);

        System.out.println("20" + 30 + 40); //?
        System.out.println('a' + 1);//
        System.out.println(30+10+"30");//
        System.out.println('a' + "20"); //a20

        System.out.println(56+96*89/5-2);//2,703.6
        //          56+96*17.8-2
        //          56+1,708.8-2
        //         1,762.8
        //1762 ?
        System.out.println(20<<1); //left shift  20>>1 ; 40
        System.out.println(20<<2);//20>>1;40  20>>1 80
        System.out.println(20 >> 2); //right shift 20/10;5



        //&|^~ num


    }
}
