package B22;

public class Data_type_class {
    public static void main(String[] args) {

        int pin = 560056;
        long a = 798452656;//no l why? :--when the value no crossing the in range l is optional
        long ph = 9965472315L;//l after the values why?:--When the valus is crossing the int range l is need after the value
        long adhar_num = 1234567989874564L;//integer number too large
        System.out.println(pin);
        System.out.println(a);
        System.out.println(ph);
        System.out.println(adhar_num);

        float amount = 560.56F;//possible lossy conversion from double to float
        double bal = 56258.25;
        System.out.println(amount);
        System.out.println(bal);

        char v = 'a';//(A-Z,a-z,0-9,!@#$%^&*()_) ascii
        System.out.println(v);

        // Uppercase Letters (A-Z):
        //The ASCII values for uppercase letters range from 65 (for 'A') to 90 (for 'Z').
        //Lowercase Letters (a-z):
        //The ASCII values for lowercase letters range from 97 (for 'a') to 122 (for 'z').
//        48 for 0, 49 for 1, 50 for 2, 51 for 3, 52 for 4, 53 for 5, 54 for 6, 55 for 7, 56 for 8, and 57 for 9
        boolean b = true;
        System.out.println(b);

    }
}
