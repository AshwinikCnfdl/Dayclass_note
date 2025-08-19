package B22;

class Bank{

    private   String name = "abc";
    private long Adhar_num = 7894651298452l;
    private long acc_num = 784512784524544L;
    private  int upipin = 12345;
    private  int bal = 450;
    private  String ifse_code = "45fio5";

    public long getAcc_num() {
        return acc_num;
    }

    public int getBal() {
        return bal;
    }

    public long getAdhar_num() {
        return Adhar_num;
    }

    public String getIfse_code() {
        return ifse_code;
    }

    public String getName() {
        return name;
    }

    public void setUpipin(int upipin) {
        this.upipin = upipin;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println(b.getAcc_num());
        //manual testing:-->
        //2hr
        //file:--1
        //exp:--1
        //collection 2 days
        //15 days:-->excel + jira
        //22

    }
}
