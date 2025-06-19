
import java.util.Scanner;

public class SpiralArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimentions");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("enter the digits");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("printing the given matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]); 
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        System.out.println("printing array");
        int r=n-1;
        int l=0;
        int u=0;
        int d=n-1;
        System.out.println();
        System.out.println("printing array");

        while(r>=l && u<=d ){
            for(int i=l;i<=r; i++){
                System.out.println(arr[u][i]);
            }
            u++;
            for(int i=u;i<=d;i++){
                System.out.println(arr[i][r]);
            }
            r--;
            for(int i=r;i>=l;i--){
               System.out.println(arr[d][i]);
            }
            d--;
            for(int i=d;i>=u;i--){
                System.out.println(arr[i][l]);
            }
            l++;
        }
    }
}

// 1 2 3 4
// 1 13 14 15
// 5 11 16 15
// 6 10 9 8