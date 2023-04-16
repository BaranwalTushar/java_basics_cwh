import java.util.Scanner;
public class tus_array {
    public static void main(String[] args) {

        //int marks [] = new int[5];// method 1 of declaring array
        //int marks []; // method 2 of declaring array
        //marks = new int[5];
   //     int marks[] = {43, 56, 76, 98, 65, 32};// method 3 of declaring array
//        marks[0] = 43;
//        marks[1] = 56;
//        marks[2] = 43;
//        marks[3] = 86;
//        marks[4] = 78;

       // System.out.println(marks[4]);

//        int marks [] = {45,65,87,98,23};
//        System.out.println(marks.length);
//
//        String student [] = {"Tushar","Triparna","Sayak"};
//        System.out.println(student[1]);
//        System.out.println(student.length);
//        for(int i=marks.length-1;i>=0;i--){
//            System.out.println(marks[i]);
//
   //     }
        //multidimensional 2-d array
//        int flats[][] = new int[2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//        for(int i=0;i<flats.length;i++){
//            for(int j=0;j<flats[i].length;j++){
//                System.out.println(flats[i][j]);
//                System.out.println(" ");
//            }
//            System.out.println(" ");
//        }
        int  flats[][][] = new int[2][3][4];
        flats[0][0][0] = 101;
        flats[0][0][1] = 102;
        flats[0][0][2] = 103;
        flats[0][0][3] = 104;
        flats[0][1][0] = 105;
        flats[0][1][1] = 106;
        flats[0][1][2] = 107;
        flats[0][1][3] = 108;
        flats[0][2][0] = 109;
        flats[0][2][1] = 110;
        flats[0][2][2] = 111;
        flats[0][2][3] = 112;
        flats[1][0][0] = 101;
        flats[1][0][1] = 101;
        flats[1][0][2] = 101;
        flats[1][0][3] = 101;
        flats[1][1][0] = 101;
        flats[1][1][1] = 101;
        flats[1][1][2] = 101;
        flats[1][1][3] = 101;
        flats[1][2][0] = 101;
        flats[1][2][1] = 101;
        flats[1][2][2] = 101;
        flats[1][2][3] = 101;
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                for(int k=0;k<flats[i][j].length;k++){
                    System.out.println(flats[i][j][k]);
                    System.out.println(" ");
                }
                System.out.println(" ");
            }
        }

    }
}
