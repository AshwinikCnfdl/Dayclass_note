package B22;

public class acces_modi {

    public static int public_mem = 45;
    protected  static int protected_mem = 89;
    static int delf_mem = 58;
    private static  int private_mem = 78;

    public static void main(String[] args) {
        System.out.println(public_mem);
        System.out.println( protected_mem);
        System.out.println(delf_mem);
        System.out.println(private_mem);
    }
}
