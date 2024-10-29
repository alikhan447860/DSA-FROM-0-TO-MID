public class Majority{
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,1,2,2};
        int candidate=arr[0];
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
                candidate=arr[i];
                count=1;
            }
        }
        System.out.print("The Majority element is "+candidate);
    }
}