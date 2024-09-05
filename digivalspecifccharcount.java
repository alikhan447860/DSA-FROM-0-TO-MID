import java.util.*;
public class digivalspecifccharcount{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENter the string");
String input=sc.nextLine();
System.out.println("enter the specific char");
char specific =sc.next().charAt(0);
int count=0;
for(int i=0;i<input.length();i++){
    if(input.charAt(i)==specific){
        count++;
    }
}
System.out.println("char "+specific+" apperars "+ count+" times" );
}
}