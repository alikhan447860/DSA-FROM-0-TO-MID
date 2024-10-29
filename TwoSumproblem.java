public class TwoSumproblem {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=8;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    found=true;
                    System.out.println("The sum is found at the index "+i+" and "+j);
                 break;
                }
            }
            if(!found){
                System.out.println("The sum is not found at any two combined index");
            }
        }
    }
}
