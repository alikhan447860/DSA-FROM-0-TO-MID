public class SwapAlter {
    public static void main(String[] args) {
        int arr[]={23,22,44,232};
        int size=arr.length;
        for(int i=0;i<size;i=i+2){
            if(i+1<size){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        }
}
