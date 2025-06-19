import java.util.*; 
public class BinomialCoeff{
    public static int fact(int n){
        int ans=1;
        for(int i=2;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int fAns=fact(n)/(fact(n-r)*fact(r));
        System.out.print(fAns);
    }
}