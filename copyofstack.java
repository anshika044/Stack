import java.util.*;
import java.util.Stack;
public class copyofstack {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       Stack<Integer> st=new Stack<>();
        // int n;
        // System.out.println("enter the no of elements you want to insert");
        // n = sc.nextInt();
        // System.out.println("ente the elements");
        // for(int i=1; i<=n; i++){
        //     int x=sc.nextInt();
        //     st.push(x);
        // }

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        System.out.println(st);
        //reverse order

        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            int x=st.peek();
            rt.push(x);
            st.pop();

        }

        Stack<Integer> gt=new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);




}
}