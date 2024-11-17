import java.util.*;
public class GoodNum {
    public static void main(String[] args) {
        int lowerbond=1;
        int upperbond=100;
        LinkedList<Integer>goodnumber=new LinkedList<>();
        int count=0;
        for(int num=lowerbond;num<=upperbond;num++){
            int temp=num;
            boolean isgood=true;
            while(temp>0){
                int digit=temp%10;
                if(digit%2!=0){
                    isgood=false;
                    break;
                }
                temp=temp/10;
            }
            if(isgood){
                goodnumber.add(num);
                count++;
            }
        } 
        System.out.println("THe count of good num is "+count);
        for(Integer goodnum:goodnumber){
            System.out.print(goodnum+" ");
        }
    }
}
