import java.util.*;

public class PushAtBottom{
    //push the element at the bottom of the stack 
    public static void pushatbottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top =s.pop();
        pushatbottom((data), s);
        s.push(top);
    }
    //reverse the stack
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushatbottom(top,s);//pushing the top element in the bottom
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
       s.push(5);
       s.push(6);
       s.push(7);
       s.push(8);
       s.push(9);
       pushatbottom(4, s);
       reverse(s);
       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }
    }
}