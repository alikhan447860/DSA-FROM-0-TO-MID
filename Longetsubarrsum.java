public class Longetsubarrsum {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int sum=11;
        int maxlength=0;
        for(int i=0;i<arr.length;i=i+1){
            int curentsum=0;
            for(int j=i;j<arr.length;j++){
                curentsum=curentsum+arr[j];
                if(curentsum==sum){
                    int length=j-i+1;
                    maxlength=Math.max(maxlength, length);
                }
            }
            
        }
        System.out.println("The longest sub array with sum "+sum+" is has lenghth "+maxlength);
    }
}
