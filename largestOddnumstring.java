public class largestOddnumstring {
    public static void main(String[] args) {
        String str="134567";
        char largestodd='0';

        for(int i=0;i<str.length();i++){
        char currentchar=str.charAt(i);
            if((currentchar-'0')% 2!=0 && currentchar>largestodd){
                largestodd=currentchar;
            }
        }
        if(largestodd!='0'){
        System.out.println("largest odd digit in string is "+largestodd);
        }else{
            System.out.println("No odd digit found in the string");
        }
    }
}
