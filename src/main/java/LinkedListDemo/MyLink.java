package LinkedListDemo;


/**
 * @ClassName MyLink
 * @Description java实现链表的操作
 * @Author pujinwen
 * @Date 2020-09-22 17:13
 * @Version 1.0
 **/
public class MyLink {

    public static   Node head=new Node();

    static class Node{
        public int data;

        public Node next;

        public Node(){

        }

        public Node(int data){
            this.data=data;
        }

    }


    /**
     * 顺序添加节点
     * @param value
     */
    public static void addNode(int value){
        //创建这个插入的新节点
        Node newNode=new Node(value);
        //临时节点
        Node temp=head;
        while (temp.next!=null){

            temp=temp.next;
        }
        temp.next=newNode;
    }

    /**
     * 遍历链表
     * @param head
     */
    public static  void forNode(Node head){
        Node temp=head.next;
        while (temp!=null){
            if(temp.data!=0){
                System.out.println("链表的数据 {"+temp.data+"}");
                temp=temp.next;
            }

        }

    }

    /**
     * 获取链表的长度
     * @return
     */
    public static int length(){
        int length=0;
        Node temp=head.next;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    /**
     * 插入节点
     * @param head 头指针
     * @param index 要插入的位置
     * @param value 要插入的值
     */
    public static void insertNode(Node head,int index,int value){
        //插入到指定的位置时候，我们就需要认为的给链表的节点记录位置，我们假设头节点为1
        //插入的时候不能在头节点以前吧,也不能插入的位置大于链表的长度吧  比如链表长度就是10,非要插入的位置为15,这里加1是头指针。
        if(index>1||index>length()+1){
            System.out.println("插入的位置不合法");
            return;
        }
        int count=1;

        Node newNode=new Node(value);

        Node temp=head;

        while (head.next!=null){
            if(index==count++){
                newNode.next=temp.next;
                temp.next=newNode;
                return;
            }
            temp=temp.next;
        }
    }

    /**
     * 删除节点
     * @param index
     */
    public void deleteByIndex(int index){

        //判断位置是否合法
        if(index<1||index>length()+1){
            System.out.println("插入的位置不合法");
            return;
        }

        int count=1;
         Node temp=head;
         while (temp.next!=null){
             if(index==count++){
                 temp.next=temp.next.next;
                 return;
             }
         }
         temp=temp.next;

    }




}
