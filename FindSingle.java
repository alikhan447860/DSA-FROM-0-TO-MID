public class FindSingle {
    public static void main(String[] args) {
        int arr[]={323,41,31,41,323};
        int size=arr.length;
        int ans=0;

        for(int i=0;i<size;i++){
            ans=ans^arr[i];
        }
       System.out.println(ans);
    }

}
