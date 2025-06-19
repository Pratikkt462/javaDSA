public class SunArr {
    public static void main(String[] args) {
        int arr[]={3,-4,6,2,-5,-6};
        int n=6;
        for(int i=0;i<n;i++){
            int j=i;
            while(j<n-1){
                j++;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                    System.out.print(' ');
                }
                System.out.println();
            }
        }
    }
}
