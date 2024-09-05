public class Linera {
    public static void main(String[] args) {
        int arr[]={1,4,3,42};
        int size=arr.length;
        int key=88;
        boolean found=false;
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                System.out.println("Elemet is found at the index "+i);
                found =true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found in the array");
        }
    }
}
