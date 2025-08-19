package B22;

public class Arrays_ {
    public static void main(String[] args) {


        int [][][] a = new int[2][3][2];

        a[0][0][0] = 1;
        a[0][0][1] = 2;
        a[0][1][0] = 11;
        a[0][1][1] = 12;
        a[0][2][0] = 10;
        a[0][2][1] = 20;

        a[1][0][0] = 15;
        a[1][0][1] = 25;
        a[1][1][0] = 23;
        a[1][1][1] = 33;
        a[1][2][0] = 40;
        a[1][2][1] = 50;

        for(int i = 0 ; i < a.length;i++){
            for(int j = 0 ; j < 3 ; j++ ){
                for(int k = 0; k < 2 ; k++){
                    System.out.println(a[i][j][k]);
                }
            }
        }

        for(int[][] i : a){
            for(int [] j : i){
                for(int k : j){
                    System.out.println(k);
                }
            }
        }


//        int[][] a = new int[3][3];
//        a[0][0] = 1;
//        a[0][1] = 2;
//        a[0][2] = 3;
//
//        a[1][0] = 10;
//        a[1][1] = 20;
//        a[1][2] = 30;
//
//        a[2][0] = 11;
//        a[2][1] = 12;
//        a[2][2] = 13;
//        //getting ele
//        for(int i = 0; i < a.length;i++){
//            for(int j = 0 ; j < a[i].length ; j++){
//                System.out.println(a[i][j]);
//            }
//        }
//
//        for(int[] i : a){
//            for(int j : i){
//                System.out.println(j);
//            }
//        }















//        int[] s_m = {10,20,30,40,50,60,70,80,90,40,20,30};
//        System.out.println(s_m); //[I@254989ff
//        s_m[0] = 30;
//        s_m[1] = 40;
//        s_m[2] = 50;
//        s_m[3] = 30;
//        s_m[4] = 40;
//        s_m[5] = 50;
//        s_m[6] = 30;
//        s_m[7] = 40;
//        s_m[8] = 50;

//        s_m[10] = 40; //ArrayIndexOutOfBoundsException

        //getting the all ele in the array
//        for(int i = 0; i < s_m.length;i++ ){
//           //gettingt he values
//           //var_name[index]
//           System.out.println(s_m[i]);
//        }
//
//        //foreach
//        for( int i : s_m){
//            System.out.println(i);
//        }


    }
}
