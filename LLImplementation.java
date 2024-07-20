import java.util.Stack;

public class LLImplementation {

    public static class node{
        int val;
        node next;
        public node(int val){
            this.val=val;
        }
    }


    public static class LLStack{
        node head=null;
        int size=0;
        void push(int x){
            node temp=new node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;

        }



        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;


        }

        void displayrec(node h){
            if(h==null)return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }

        void display(){ 
            displayrec(head);
            System.out.println();

        }


        void displayreverse(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        boolean isempty(){
            if(size==0)return true;
            return false;
        }






    }





    public static void main(String[] args) {
         LLStack st= new LLStack();
        st.push(1);
        st.display();//1
        st.push(2);
        st.display();// 1 2
        st.push(3);
        st.display();// 1 2 3 
        st.push(4);
        st.display();// 1 2 3 4
        st.push(5);
        st.display();// 1 2 3 4 5
        System.out.println(st.size());
        // st.pop();
        // st.display();
      
        st.push(100);
    }
    
}
