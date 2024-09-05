public class BinarySearch{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=2;
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                result=mid;
                break;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(result==-1){
            System.out.println("elemnt not found");
        }else{
            System.out.println("element is found at index "+result);
        }
    }

}