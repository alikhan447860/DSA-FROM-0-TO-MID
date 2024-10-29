public class kadensalgo {
    public static void main(String[] args) {
        int arr[]={-1,1,2,3,-4,-5,3,5,6};
        int maxsum=arr[0];
        int curentsum=0;
        for(int i=0;i<arr.length;i++){
            curentsum=curentsum+arr[i];
            if(curentsum>maxsum){
                maxsum=curentsum;
            }
            if(curentsum<0){
                curentsum=0;
            }
        }
        System.out.println("The maximum subarray sum is "+maxsum);
    }
}
