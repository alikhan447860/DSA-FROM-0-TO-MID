public class Removedupsort {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,6};
     if(arr.length==0||arr.length==1){
      return;
     }
     int j=0;
     for(int i=0;i<arr.length;i++){
      if(arr[i]!=arr[j]){
        j++;
        arr[j]=arr[i];
      }
     }
     System.out.println("Array after removing duplicates:");
     for(int i=0;i<j;i++){
      System.out.print(arr[i]+" ");
     }
    }
}
