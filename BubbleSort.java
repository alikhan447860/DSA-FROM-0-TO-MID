public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={32,4,323,434,23};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
