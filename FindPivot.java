public class FindPivot {
    public static void main(String[] args) {
        int arr[]={7,9,1,2,3};
        int start=0;
        int end=arr.length-1;
      
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>=arr[0]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        System.out.println("pivot element is at index "+start+" with the value "+arr[start]);
    }

}
