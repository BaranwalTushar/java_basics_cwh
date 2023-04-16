import java.util.Scanner;
public class tus_arrayprac {
    public static void main(String[] args) {
        //problem 1
//        float marks[] = {43.0f , 56.4f,76.4f};
//        float sum =0;
//        for(int i=0;i< marks.length;i++){
//            sum = sum + marks[i];
//        }
//        System.out.println("the sum of above array is " + sum);

        //problem 2
//        float marks[] = {43.0f , 56.4f,76.4f};
//        float num = 43.0f;
//        boolean isinarray=false;
//        for(int i=0;i< marks.length;i++){
//            if(num ==marks[i]){
//                isinarray=true;
//                break;
//            }
//        }
//        if(isinarray) {
//            System.out.println("element present in an array");
//        }
//        else{
//            System.out.println("element not present in an array");
//        }
        // problem 3

//        int matrix1[][] = {{1, 2, 3},
//                {4, 5, 6}};
//        int matrix2[][] = {{2, 6, 13},
//                {3, 7, 1}};
//        int result[][] = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i = 0; i<matrix1.length; i++) {
//            for (int j = 0; j<matrix1[i].length; j++) {
//                System.out.format("the value for i=%d and j=%d\n", i, j);
//                result[i][j] = matrix1[i][j] + matrix2[i][j];
//            }
//        }
//        for (int i = 0; i<matrix1.length; i++) {
//            for (int j = 0; j<matrix1[i].length; j++) {
//                System.out.print(result[i][j] + " ");
//                result[i][j] = matrix1[i][j] + matrix2[i][j];
//
//            }
//            System.out.println("");
//        }
        //problem 4
        //int arr[] = {2,3,4,5,6};
//        int l = arr.length;
//        int a = Math.floorDiv(l, 2);
//        int temp;
//        for(int i=0;i<a;i++){
//            temp=arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

        //problem 5
//        int arr[] = {2,3,4,5,6};
//      int max = 0;
       // int max = Integer.MIN_VALUE;//important package instead of (int max=0)
//      for(int i=0;i<arr.length;i++){
//          if(arr[i]>max){
//              max=arr[i];
//
//          }
//      }
//        System.out.println("the maximum number is: " + max);
//problem 6
//        int arr[] = { 3,2, 4, 5, 6};
//        int min=Integer.MAX_VALUE;//important package
//        for (int i= 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//
//        }
//        System.out.println("the minimum number is: " + min );
        //problem 7
        int arr[] = {23,24,25,26,27};
        boolean issorted = true;
        for(int i=0;i<arr.length-1;i++){// important we can check the elemnt with his right element last one has no right element
            if(arr[i]>arr[i+1]){
                issorted = false;
                break;
            }
        }
        if(issorted){
            System.out.println("the element is sorted");
        }
        else{
            System.out.println("the element is not sorted");
        }

    }
}
