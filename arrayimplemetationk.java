


public class arrayimplemetationk {

    public static class Stack{
        private int[] arr=new int[5];
        private int idx=0;
        public void push(int x){
            if(isfull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }

        int peek(){
            if(idx==0){
                System.out.println("empty stack");
                return -1;
            }else{
                return arr[idx-1];
            }
        }

            int pop(){
                if(idx==0){
                    System.out.println("empty stack");
                    return -1;
                }
                int top=arr[idx-1];
                arr[idx-1]=0;
                idx--;
                return top;
            }

            void display(){
                for(int i=0; i<=idx-1;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            int size(){
                return idx;
            }

            boolean isEmpty(){
                if(size()==0)return true;
                else return false;
            }

            boolean isfull(){
                if(idx==arr.length)return true;
                else return false;
            }
            int capacity(){
                return arr.length;
            }
        
    }

    public static void main(String[] args) {
        Stack st= new Stack();
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
        System.out.println(st.isfull());
        st.push(100);
       
    }
    
}
