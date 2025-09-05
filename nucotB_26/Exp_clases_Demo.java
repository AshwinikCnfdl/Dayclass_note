package nucotB_26;
import java.util.Scanner;

class InvaildData extends  Exception{
    InvaildData(String msg){
        System.out.println(msg);
    }
}
public class Exp_clases_Demo {

    public static void main(String[] args) throws InvaildData {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter email and pwd");
       String email = sc.next();
       String pwd = sc.next();

       if(email.equalsIgnoreCase("abc@gmail.com") && pwd.equals("123456798")){
           System.out.println("login");
       }
       else{
//           System.out.println("error");
           throw new InvaildData("invalid data");
       }
       System.out.println("done");
////        Exception:-->
//        try{
//            //set of line code
//        }
//        catch (exp_name ref_name){
//            //msg
//        }

    }
}
