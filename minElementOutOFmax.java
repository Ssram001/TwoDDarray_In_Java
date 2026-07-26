package MultiDiMensionsArrays;

import java.util.Scanner;

public class minElementOutOFmax {
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
        System.out.println();
        int maxEle = Integer.MIN_VALUE;
        int a=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              if(arr[i][j]>max){
                  max=arr[i][j];
              }
              if(max>maxEle){
                  maxEle=max;
                  a=i;
              }
            }
        }
        System.out.println(maxEle);
        System.out.println(a);
    }

}
