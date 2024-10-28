public class Secondlar{
    public static void main(String[] args) {
        int arr[]={23,44,232,9};
        int largest=Integer.MIN_VALUE;
        int Second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                Second=largest;
                largest=arr[i];
            }else if(arr[i]>Second && arr[i]!=largest){
                Second=arr[i];
            }
        }
System.out.println("The second largest elemtn in array is "+Second);
    }
}