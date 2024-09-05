public class PalindromStr {
    public static void main(String[] args) {
        String str="Racecar";
        str=str.toLowerCase();
        int s=0;
        int end=str.length()-1;
        while(s<end){
            if(str.charAt(s)!=str.charAt(end)){
                System.out.println("Not a Palindrome");
                return;
            }
            s++;
            end--;
        }
System.out.println("This is a Palindrome String");
    }
}
