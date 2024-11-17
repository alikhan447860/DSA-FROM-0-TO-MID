public class BStofindX{
    public static void main(String[] args) {
        int arr[]={12,13,14,15};
        int x=14;
        int start=0,end=arr.length-1,result=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                System.out.println("The element is found at index "+mid);
                result=mid;
                break;
            }else if(arr[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
}