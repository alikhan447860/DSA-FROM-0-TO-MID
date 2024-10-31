public class CountSubstr {
    public static void main(String[] args) {
        String str="abc";
        int n=str.length();
        int totalsubstr=n*(n+1)/2;
        System.out.println("The total number of substring is : "+totalsubstr);
    }
}
