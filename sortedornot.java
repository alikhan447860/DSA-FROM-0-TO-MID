public class sortedornot {
    public static void main(String[] args){
        int arr[]={1,2,4,3,5,6};
        if(isSorted(arr)){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
    public static boolean isSorted(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
   
    
}
