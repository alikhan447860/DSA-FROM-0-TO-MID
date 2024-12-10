public class ReverseEveryWord {
    public static void main(String[] args) {
        String str="Hello world from Alikhan";
       String result="";
       String []words=str.split(" ");
       for(String word:words){
        String reverseword=" ";
        for(int i=word.length()-1;i>=0;i--){
            reverseword=reverseword+word+word.charAt(i);
        }
        result=result+reverseword;
       }

        System.out.println(result);
    }
}
