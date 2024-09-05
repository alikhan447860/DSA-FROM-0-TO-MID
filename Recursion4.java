public class Recursion4{
    public static void f(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            n--;
            f(n);
        }

    }
    public static void main(String[] args) {
        f(4);
    }
}
