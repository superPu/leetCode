package stack;
/**
 * @ClassName LinkedListStack
 * @Description 基于链表实现栈的操作,链表实现的栈是链式栈，没有大小的限制
 * @Author pujinwen
 * @Date 2020-09-28 15:10
 * @Version 1.0
 **/
public class LinkedListStack {

    private Node head=null;
    /**
     * 数据入栈
     * @param value
     */
    public void push(int value){
        Node newNode=new Node(value,null);
        //判断是否栈为空
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }

    }

    /**
     * 数据弹栈
     * @return
     */
    public int pop(){
        if(head==null){
            return -1;
        }
        int value=head.data;
        head=head.next;
        return value;
    }


    public void printAll(){
        Node p=head;
        while (p!=null){
            System.out.println(p.data+" ");
            p=p.next;
        }

    }


    private static class Node{

        private int data;

        private Node next;

        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    public static void main(String[] args) {
        LinkedListStack stack=new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printAll();

        stack.pop();

        stack.printAll();


    }
}
