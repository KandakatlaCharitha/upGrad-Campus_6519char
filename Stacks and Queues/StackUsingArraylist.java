import java.util.*;
public class StackUsingArraylist{
    static class Stack1{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
    
    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        if(list.isEmpty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    public static int peek(){
        if(list.isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
}
    public static void main(String[] args) {
        Stack1 s=new Stack1();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}