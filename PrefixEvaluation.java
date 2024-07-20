import java.util.*;
public class PrefixEvaluation {

    public static void main(String[] args) {
        String s="-9/*+5346";
        System.out.println(s);
        Stack<Integer> st=new Stack<>();
        int n=s.length()-1;
        for(int i=n;i>=0; i--){
            char ch=s.charAt(i);
            int asci=(int) ch;
            if(asci>=48 && asci<=57){//0 to 9
                st.push(asci-48);
            }
            else{
                int v1=st.pop();
                int v2=st.pop();
                if(ch=='-')st.push(v1-v2);
                if(ch=='+')st.push(v1+v2);
                if(ch=='/')st.push(v1/v2);
                if(ch=='*')st.push(v1*v2);


            }
        }
        System.out.println(st.peek());
    }
    
}
