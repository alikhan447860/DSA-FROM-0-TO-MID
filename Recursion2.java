public class Recursion2 {
   
    public static void f(int count){
        if(count==4)
            return ;
            System.out.println(count);
            count++;
            f(count);
    }
    public static void main(String[] args) {
        f(0);
    }
}
