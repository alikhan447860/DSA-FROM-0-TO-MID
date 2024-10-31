public class countopenparenthesis {
   public static void main(String[] args) {
    String str="((()()))";
    int currendepth=0;
    int maxdepth=0;
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch=='('){
            currendepth++;
            if(currendepth>maxdepth){
                maxdepth=currendepth;
            }
        }
        else if(ch==')'){
            currendepth--;
        }
    }
    System.out.println("Maximum nesting depth :"+maxdepth);
   }
}