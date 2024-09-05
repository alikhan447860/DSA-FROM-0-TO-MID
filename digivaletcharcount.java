import java.util.*;
public class digivaletcharcount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=sc.nextLine();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            int count=0;
            for(int j=0;j<input.length();j++){
                if(input.charAt(j)==ch){
                    count++;
                }
            }
            System.out.println(ch+" : "+count);
        }
    }
}