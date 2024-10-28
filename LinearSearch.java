public class LinearSearch {
    public static  void main (String[]args){
int arr[]={1,2,3,4,6,7};
int target=3;
boolean found=false;
for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
        System.out.println("The element is found at index "+i);
         found=true;
        break;
    }
}
if(!found){
    System.out.println("element is not found");
}
    }
}
