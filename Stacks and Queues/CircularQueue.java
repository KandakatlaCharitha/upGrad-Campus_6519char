public class CircularQueue{
    //Implement circular queue using array
    static class Queue{
        static int arr[];
        static int size;
         static int rear=-1;
         static front=-1;
       
         Queue(int size){
            arr=new int[size];
            this.size=size;
        }
    
    public static boolean isEmpty(){
        return rear==-1 && front==-1;
    }

    public static boolean isFull(){
        return (rea+1)%size==front;
    }

    public static void add(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int result=arr[front];
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        return result;
    }

     public static int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[front];
     }


    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove);
        q.add(6);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}