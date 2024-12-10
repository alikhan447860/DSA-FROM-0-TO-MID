public class ReverseArr {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5,6,7,8};
       int m=2;
       int start=m+1;
       int end=arr.length-1;
       while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }
       for(int val:arr){
        System.out.print(val+" ");
       }
    }
}
