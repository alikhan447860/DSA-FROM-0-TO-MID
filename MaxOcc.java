public class MaxOcc {
    public static void main(String[] args) {
        String str="Good boy";
        int charcount[]=new int [256];
        char maxchar=' ';
        int maxcount=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length()-1;i++){
            char c=str.charAt(i);
            if(c!=' '){
                charcount[c]++;
                if(charcount[c]>maxcount){
                    maxchar=c;
                    maxcount=charcount[c];
                }
            }
        }
  System.out.println("The char "+maxchar+" appears max "+maxcount+" times");
    }
}
