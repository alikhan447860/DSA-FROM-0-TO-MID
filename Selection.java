public class Selection {
 public static void main(String[] args) {
    int arr[]={33,2,121,423,3432,2,43};
    for(int i=0;i<=arr.length-1;i++){
     int mini=i;
     for(int j=i+1;j<=arr.length-1;j++){
        if(arr[j]<arr[mini]){
            mini=j;
        }
     }
     int temp=arr[mini];
     arr[mini]=arr[i];
     arr[i]=temp;
    }
    for(int val:arr){
        System.out.print(val+" ");
    }
 }

}
