package Java_classes;

public class Gmail {

     String emailid;
     String pwd;

     void login(String id,String pwd){
         if(emailid.equals(id) && this.pwd.equals(pwd)){
             System.out.println("login");
         }
         else{
             System.out.println("try again");
         }
     }

     void reg(String id,String pwd){
         emailid = id;
         this.pwd = pwd;
     }


    public static void main(String[] args) {
        Gmail e = new Gmail();
//        e.login();
        e.reg("abc@gmail.com","123456789");
        e.login("abc@gmail.com","123456789");
        e.login("abc1@gmail.com","123456789");
    }
}
