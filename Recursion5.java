public class Recursion5 {
    public static void revarr(int arr[],int s,int e ){
          if(s>=e){
            return;
          }
          int t=arr[s];
          arr[s]=arr[e];
          arr[e]=arr[t];
          revarr(arr, s+1, e-1);

    }

    
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
       revarr(arr, 0,4);
       for(int j:arr){
        System.out.print(" "+j);
       }
        
    }
}
