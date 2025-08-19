package Java_classes;

public class Arrays {
    public static void main(String[] args) {

        //arrays :--why array :-->stor the collection of data
        int s1 = 56;
        int s2 = 96;
        int s3 = 89;
        int s4 = 45;
        int s5 = 56;
        int s6 = 89;
        int s7 = 78;
        //only one var :--> data
        //array it can store the homogeneous data (only one of data)
        //fixed m/m(size)

        // 1 way:--at creating array we are passing the values
        //data_type [] var_name = {v1,v2,v3.........};
        int [] arr = {10,20,30,40,50,60,70,80,90,100,110,112};
        System.out.println(arr);//[10,20,30,40,50,60,70,80,90]

        //how we can get the array values?
        //var_name[index]
        System.out.println(arr[3]);
        System.out.println(arr[7]);
//        System.out.println(arr[9]);//ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9

        //getting the all ele
        System.out.println("*****************************");

        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

        //2nd way
        int [] arr1 = new int[15];

        //how to add ele in to the array
        arr1[0] = 89;
        //adding multiple ele
        for(int i = 0; i < arr1.length ; i++ ){
            arr1[i] = i * i;
        }


        //getting the all ele
        System.out.println("*****************************");

//        for(int i = 0; i < arr1.length ; i++){
//            System.out.println(arr1[i]);
//        }
//        for(data_type var : object){
//            System.out.println(var);
//        }

         for(int i : arr1){
            System.out.println(i);
         }

        int [][] arr2d = {  {101,58,58,96,85},{102,56,85,90,45}};
        int[][]arr2d1 = new int[2][5];

        arr2d1[0][0] = 101;
        arr2d1[0][1] = 58;
        arr2d1[0][2] = 58;
        arr2d1[0][3] = 96;
        arr2d1[0][4] = 85;

        arr2d1[1][0] = 102;
        arr2d1[1][1] = 56;
        arr2d1[1][2] = 85;
        arr2d1[1][3] = 90;
        arr2d1[1][4] = 45;

        //getting all ele
//        for(int r = 0; r < 2 ; r++){
//            for(int c = 0; c < 5; c++){
//                System.out.println(arr2d[r][c]);
//            }
//        }

        System.out.println(" ************************  ");
        for(int [] a :arr2d){
            for(int i : a){
                System.out.println(i);
            }

        }



        System.out.println(" ************* 3d ****************");
        int [][][] a3d = {{{101,100},{58,69}},{{102,100},{56,68}}};
        int[][][] a3d1 = new int[2][2][2];

        a3d1[0][0][0] =  101;
        a3d1[0][0][1] =  100;
        a3d1[0][1][0] =  58;
        a3d1[0][1][1] =  69;

        a3d1[1][0][0] =  102;
        a3d1[1][0][1] =  100;
        a3d1[1][1][0] =  56;
        a3d1[1][1][1] =  68;


        //getting all ele
        for(int r = 0; r < 2 ; r++){
            for(int c = 0; c < 2; c++){
                for(int j = 0; j < 2;j++){
                System.out.println(a3d1[r][c][j]);
            }
        }}
        System.out.println(" ************* 3d ****************");
        for(int[][] a : a3d1){
            for(int [] b : a){
                for(int i : b){
                    System.out.println(i);
                }
            }
        }




    }
}
