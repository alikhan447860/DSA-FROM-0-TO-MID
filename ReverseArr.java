public class ReverseArr {
    public static void main(String[] args) {
        int arr[]={43,642,532,543,54532,77};
        int m=3;
        int start=m+1;
        int end=arr.length-1;
        while(start<end){
            int temp=0;
            temp=arr[start];
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
