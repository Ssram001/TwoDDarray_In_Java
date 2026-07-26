package MultiDiMensionsArrays;

import java.util.Scanner;

public class forEach {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        for(int i=0;i<n;i++){
//            for(int ele :  arr[i]){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }


        //IT IS IMP IN GRAPH A LITTLE BIT
        for(int[] row:arr){
            for(int ele : row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
