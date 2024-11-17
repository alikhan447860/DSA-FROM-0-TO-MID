import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        System.out.println("Original stack"+st);
        reversestack(st);
        System.out.println("Reversed stack :"+st);
    }
    public static void reversestack(Stack<Integer>st){
        if(st.isEmpty()){
            return;
    
        }
        int top=st.pop();
        reversestack(st);
        putatbottom(st, top);

    }
    public static void putatbottom(Stack<Integer>st,int item){
     if(st.isEmpty()){
        st.push(item);
        return;

     }
     int top=st.pop();
     putatbottom(st, item);
     st.push(top);
    }

}
