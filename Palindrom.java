public class Palindrom {
    public static void main(String[] args) {
        String str="racecar";
        boolean ispalin=true;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
               ispalin=false;
               break;
            }
        }
        if(ispalin){
            System.out.println("This is palindrom string");
        }else{
            System.out.println("This is not a palindrome string");
        }
    }
}
