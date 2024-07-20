import java.util.*;
public class nextGreaterStack {

    public static int[] nextgreater(int[] arr){
        int n=arr.length;
        Stack<Integer> st= new Stack<>();
        int[] ans=new int[n];
        ans[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            while(st.size()>0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0) ans[i]=-1;
            else ans[i]=st.peek();
            st.push(arr[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr={1,5,3,2,1,6,3,4};
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
      int[] result=nextgreater(arr);
      System.out.println();
      System.out.println("Next greater elements");
      for(int i=0; i<result.length;i++){
        System.out.print(result[i]+" ");
      }
    }
    
}
