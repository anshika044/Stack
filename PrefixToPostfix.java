import java.util.*;
public class PrefixToPostfix {
    public static void main(String[] args) {
        String s="-9/*+5346";
        Stack<String> st=new Stack<>();
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
            char ch=s.charAt(i);
            int asci=(int) ch;
            if(asci>=48 && asci<=57){
                String str=" "+ch;
                st.push(str);
            }
            else{
                String v1=st.pop();
                String v2=st.pop();
                char o=ch;
                st.push(v1+v2+o);

            }
    }
    System.out.print(st.peek());
}
}
