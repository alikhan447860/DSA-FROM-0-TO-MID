public class countopenparenthesis {
   public static void main(String[] args) {
    String str="((()()))";
    int curentopen=0;
    int maxopen=0;
    for(int i=0;i<str.length()-1;i++){
        if(str.charAt(i)=='('){
            curentopen++;
        }else if(curentopen>maxopen){
            maxopen=curentopen;
        }else if(str.charAt(i)==')'){
            maxopen--;
        }
    }
    System.out.println("Maximum nesting open bracket is :"+maxopen);
   }
}