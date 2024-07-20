import java.util.*;
public class displayStack {

    public static void displayreverseRec(Stack<Integer> s){
        if(s.size()==0) return;
    int top=s.pop();
    System.out.print(top+" ");
    displayreverseRec(s);
    s.push(top);
    }

    public static void displayRec(Stack<Integer> s){
        if(s.size()==0) return;
    int top=s.pop();
    
    displayRec(s);
    System.out.print(top+" ");
    s.push(top);
    }

public static void pushAtBottom(Stack<Integer> s,int ele){
    if(s.size()==0) {
        s.push(ele);
        return;
    }
    int top=s.pop();
    
    pushAtBottom(s,ele);
   
    s.push(top);
    
}

public static void reversestack(Stack<Integer> st){
    if(st.size()==1) return;//kyuki single element ka reverse wahi hota hai
    int top=st.pop();
    reversestack(st);
    pushAtBottom(st, top);
}





    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
       
        // displayreverseRec(st);
        reversestack(st);
        System.out.println();
        System.out.println(st);
        // displayRec(st);
    //   pushAtBottom(st, 8);
    //   System.out.println("Stack after pushing element at bottom: " + st);
        /
        
        //STACK TO STACK DISPLAY


        // System.out.println(st);
        // Stack<Integer> rt=new Stack<>();
        // while(!st.isEmpty()){
        //     rt.push(st.pop());
        // }
        // while(rt.size()>0){
        //     int x=rt.pop();
        //     System.out.print(x+ " ");
        //     st.push(x);
        // }



        //ARRAY TO STACK DISPLAY

        // int n=st.size();
        // int[] arr=new int[n];
        // for(int i=n-1;i>=0;i--){
        //     int x=st.pop();
        //     arr[i]=x;
        //     //arr[i]=st.pop();
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }




    }
    
}
