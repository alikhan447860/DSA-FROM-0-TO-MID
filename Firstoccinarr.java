public class Firstoccinarr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6,4,5};
        int x=4;
        int start =0;
        int end=arr.length-1;
        int firstocc=-1;
        int lastocc=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                firstocc=mid;
                end=mid-1;
            }else if(arr[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        
        
        if(firstocc!=-1){
            System.out.println("first occurence of "+x+" at index "+firstocc);
        }else{
            System.out.println("element is not found in the array");
        }
        start=0;
        end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
          lastocc=mid;
          start=mid+1;
            }
            else if(arr[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if(lastocc!=-1){
            System.out.println("Last occurence of "+x+" is at index "+lastocc);
        }else{
            System.out.println("The element is not found in the array");
        }
    }
}
