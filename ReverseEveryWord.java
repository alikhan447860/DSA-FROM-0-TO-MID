public class ReverseEveryWord {
    public static void main(String[] args) {
        String str="Hello world from chatgpt";
        String[] words=str.split(" ");
        String result="";
        for(String word:words){
            String reverseword="";
            for(int i=word.length()-1;i>=0;i--){
                 reverseword=reverseword+word.charAt(i);
            }
            result=result+reverseword+" ";
        }
        System.out.println(result);
    }
}
