public class rotationofstr {
public static void main(String[] args) {
    String s1="abcd";
    String s2="cdab";
    if(s1.length()!=s2.length()){
        return;
    }
    String concat=s1+s1;
    if(concat.contains(s2)){
        System.out.println("s2 is a rotation of s1");
    }else{
        System.out.println("s2 is not a rotaion of s1");
    }
}
}