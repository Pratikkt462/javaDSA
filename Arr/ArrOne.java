// package Arr;
import java.util.*;
public class ArrOne {
    public static void main(String[] args) {
        int Arr[]=new int[10]; 
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            Arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
        System.out.print(Arr[i]);    
        System.out.print(' ');    
        }
    }
    
}
