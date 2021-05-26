package myjava.myproject;

public class My_tut_07_Array_marray {
    public static void main(String[] args) {
//        int [] arr = {12, 25, 65, 78, 98, 67, 57, 66};
//        System.out.println(arr[6]);
//        int tmp;
//        int l = arr.length;
//        System.out.println(l);
//        int n = Math.floorDiv(l, 2);
//        for (int i=0; i<n; i++){ //For each-Loop
//            tmp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = tmp;
//        }
//        for (int element:arr){
//            System.out.print(element +" ");
//        }

        int [][] flt;
        flt = new int[3][3];
        flt [0][0] = 100;
        flt [0][1] = 101;
        flt [0][2] = 102;
        flt [1][0] = 200;
        flt [1][1] = 201;
        flt [1][2] = 202;
        flt [2][0] = 300;
        flt [2][1] = 301;
        flt [2][2] = 302;

        System.out.println("Printing a 2-D array using for loop");
        for (int[] ints : flt) {          //for (int i=0; i<flt.length; i++)
            for (int anInt : ints) {      //for (int j = 0; j<flt[i].length; j++)
                System.out.print(anInt);  //System.out.print(flt[i][j])
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
