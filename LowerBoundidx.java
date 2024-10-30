public class LowerBoundidx {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int x=4;
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]<x){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        System.out.println("Lower bond of "+x+ " index is "+start);
    }
}
