import java.util.*;
public class removeconsequetiveSubsequence {
    public static int[] reason(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i])
            st.push(arr[i]);
            else if(arr[i]==st.peek()){
                if(i==n-1 || arr[i]!=arr[i+1])
                    st.pop();
                
            }
        }
        int[] res =new int[st.size()];
        int m =res.length;
        for(int i=m-1; i>=0; i--){
            res[i]=st.pop();
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr={1,2,2,10,10,10,3,5,5,6,2};
        int[] res= reason(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
    }
    
}
}
