public class FindDuplicate {
    public static void main(String[] args) {
        int arr[]={21,2,12,423,121,22,2};
        int size=arr.length;
        int ans=0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;i++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element is "+arr[i]);
                    return;
                }
            }
            System.out.println("No duplicate found");
        }
    }
}
