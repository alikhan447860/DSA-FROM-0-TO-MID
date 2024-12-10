public class Reverse {
    public static void main(String[] args) {
        int arr[]={12,13,14,15};
        int start=0,end=arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
