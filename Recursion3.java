public class Recursion3 {
    public static void f(int sum,int count){
      if(count==111){
      System.out.println(sum);
      return;
      }
      else{
      sum=sum+count;
      count++;
      f(sum,count);
    }
}
    public static void main(String[] args) {
        f(0,100);
    }
}
