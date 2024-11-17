public class countTheocurence {
    public static void main(String[] args) {
        int arr[]={2,2,2,3,4,5,6,2};
        int tar=2;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                count++;
            }
        }
        if(count==0){
            System.out.println("No elemtn is found");
        }else{
            System.out.println("THe element if found at "+count+" times");
        }
    }
}
