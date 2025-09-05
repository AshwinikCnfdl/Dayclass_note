package nucotB_26;

class D {
    int a;

    D(int a){
        this.a = a;
    }
}
//this:--> diff local and global var which is present in the same name
public class Cons_over_riding {

    public static void main(String[] args) {

        D d = new D(45);
        System.out.println(d.a);
    }
}
//2hr :-- 1 to 3
//java:--> collections :--2hr  :-- > 1 to 3
//manual Testing :-->