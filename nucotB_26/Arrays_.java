package nucotB_26;

public class Arrays_ {
    public static void main(String[] args) {
        int[][][] a = new int[2][4][2];
        a[0][0][0] = 10;
        a[0][0][1] = 20;
        a[0][1][0] = 30;
        a[0][1][1] = 40;
        a[0][2][0] = 50;
        a[0][2][1] = 60;
        a[0][3][0] = 70;
        a[0][3][1] = 80;

        a[1][0][0] = 11;
        a[1][0][1] = 22;
        a[1][1][0] = 33;
        a[1][1][1] = 44;
        a[1][2][0] = 55;
        a[1][2][1] = 66;
        a[1][3][0] = 77;
        a[1][3][1] = 88;

        for(int i = 0; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j ++){
                for(int k = 0 ; k < a[i][j].length ;k++ ){
                    System.out.println(a[i][j][k]);
                }
            }
        }

        System.out.println("  ********************************       ");
        for(int[][] i : a){
            for(int [] j : i){
                for(int k : j){
                    System.out.println(k);
                }
            }
        }

//        int[][] a = new int[3][6];
//
//        a[0][0] = 10;
//        a[0][1] = 20;
//        a[0][2] = 30;
//        a[0][3] = 40;
//        a[0][4] = 50;
//        a[0][5] = 60;
//
//        a[1][0] = 1;
//        a[1][1] = 2;
//        a[1][2] = 3;
//        a[1][3] = 4;
//        a[1][4] = 5;
//        a[1][5] = 6;
//
//        a[2][0] = 11;
//        a[2][1] = 22;
//        a[2][2] = 33;
//        a[2][3] = 44;
//        a[2][4] = 55;
//        a[2][5] = 66;
//
//        for(int i = 0; i < a.length ; i ++){
//            for(int j = 0 ; j < a[i].length ; j++){
//                System.out.println(a[i][j]);
//            }
//        }
//
//        System.out.println(" ******************************************     ");
//
//        for(int[] i : a){
//            for (int j : i){
//                System.out.println(j);
//            }
//        }


//        int [] array = new  int[15];
//        System.out.println(array); //[I@254989ff

//        array[0] = 100;
//        array[1] = 50;
//        array[2] = 60;
//        array[3] = 70;
//        array[4] = 80;
//        array[5] = 90;
//        array[6] = 100;
//        array[8] = 50;
//        array[9] = 200;
//        array[10] = 50;//ArrayIndexOutOfBoundsException
//getting the single le

//        int[] array = {100,50,40,50,70,80,90,100,200,250,600,45,25};
//
//        System.out.println(array[3]);
//        //getting the all ele
//
//        for(int i = 0; i < array.length ; i++){
//            System.out.println(array[i]);
//        }
//
//        System.out.println(" ****************************************        ");
//        for( int i : array){
//            System.out.println(i);
//        }



    }
}
