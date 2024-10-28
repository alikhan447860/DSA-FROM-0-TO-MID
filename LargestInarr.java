public class LargestInarr {
    public static void main(String[] args) {
        int arr[]={12,3,53,232};
       int largest=arr[0];
       for(int num:arr){
        if(num>largest){
            largest=num;
        }
       }
       System.out.println("The largest element in array is " +largest);
    }
}
