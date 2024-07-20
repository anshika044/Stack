import java.util.*;
public class findminbracketToBeBalanced {


    public static int findmin(String str){
        Stack<Character> st=new Stack<>();
        int unmatchedclosing=0;
        for(int i=0; i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                if(st.isEmpty()){
                    unmatchedclosing++;
                }else{
                    st.pop();
                }
            }
        }

        int unmacthedopening=st.size();

        return unmacthedopening+unmatchedclosing;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(findmin(str));

    }
    
}

