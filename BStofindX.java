public class BStofindX{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=6;
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("The target element is found "+target);
                break;
            }
            if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
}