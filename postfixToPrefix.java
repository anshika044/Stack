import java.util.*;
public class postfixToPrefix {
    public static void main(String[] args) {
        String s="953+4*6/-";
        Stack<String> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int asci=(int) ch;
            if(asci>=48 && asci<=57){
                String str=" "+ch;
                st.push(str);
            }
            else{
                String v2=st.pop();
                String v1=st.pop();
                char o=ch;
                st.push(o+v1+v2);

            }
    }
    System.out.print(st.peek());
    }
    
}
