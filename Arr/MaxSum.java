public class MaxSum {
    public static void main(String[] args) {
        int arr[]={3,-4,6,2,-5,-6};
        int n=6;
        int maxv=0;
        for(int i=0;i<n;i++){
            int j=i;
            while(j<n-1){
                j++;
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum + arr[k];
                }
                if(sum>maxv){
                    maxv=sum;
                }
            }
        }
        System.out.println(maxv);
    }
}
