public class Recursion {
    public static void f(int n){
       if(n==4){
        return;
       }
       else{
        System.out.println("Ali khan");
        n++;
        f(n);
       }
    }
    public static void main(String[] args) {
        f(0);
    }
}
