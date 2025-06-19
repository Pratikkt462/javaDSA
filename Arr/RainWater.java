public class RainWater {

    public static int max(int arr[]) {
        int max=0;
        int maxInd=0;
        for(int i=0;i<7;i++){
            if(arr[i]>max){
                max=arr[i];
                maxInd=i;
            }
        }
        return maxInd;
    }
    
    public static void main(String[] args) {
        // int arr[] = new  int[7];
        int arr[]={4,2,0,6,3,2,5};
        max(arr);
    }
    
}
