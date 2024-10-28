public class maxConseOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,1};
        int count=0;
        int maxcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxcount=Math.max(maxcount, count);
            }else{
                count=0;
            }
        }
        System.out.println("The longest consective of ones is "+maxcount);
    }
}
