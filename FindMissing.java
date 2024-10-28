public class FindMissing {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        int size=arr.length+1;
        int total=size*(size+1)/2;
        for(int val:arr){
            total=total-val;
        }
        System.out.println("The missing element in array is "+total);
    }
}
