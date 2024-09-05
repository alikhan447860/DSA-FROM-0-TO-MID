public class SumofTwoArr {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]={4,5,6};
        int sum[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sum[i]=arr[i]+arr2[i];
        }
        for(int val:sum){
            System.out.print(val+" ");
        }
    }
}
