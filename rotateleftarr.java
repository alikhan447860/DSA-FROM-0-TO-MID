public class rotateleftarr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=3;
        int rotatedarr[]=new int[arr.length];
        int index=0;
        for(int i=k;i<arr.length;i++){
rotatedarr[index++]=arr[i];
        }
        for(int i=0;i<k;i++){
            rotatedarr[index++]=arr[i];
        }
        for(int val:rotatedarr){
            System.out.print(" "+val);
        }
    }
}
