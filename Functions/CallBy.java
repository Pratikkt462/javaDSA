public class CallBy{
    public static void cll(int a){
        a=10;
    }
    public static void main(String[] args){
        int a=20;
        cll(a);
        System.out.print(a);
    }
}