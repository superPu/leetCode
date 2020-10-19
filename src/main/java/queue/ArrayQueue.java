package queue;
/**
 * @ClassName ArrayQueue 基于数组的队列
 * @Description 基于数组的队列
 * @Author pujinwen
 * @Date 2020-09-29 11:14
 * @Version 1.0
 **/
public class ArrayQueue {
    /**
     * 数组 item
     */
    private String[] items;

    private int size=0;
    /**
     * head指针
     */
    private int head=0;
    /**
     * tail指针
     */
    private int tail=0;

    public ArrayQueue(int capacity){
        items=new String[capacity];
        this.size=capacity;
    }

    /**
     * 入队操作
     * @param item
     * @return
     */
    public boolean enqueue(String item){
        if(tail==size){
            //tail=数组的长度&& head==0的时候，表示队列已经满满当当的了
            if(head==0){
                return false;
            }
            //如果head不是0的时候，表示因为数据出队的时候，造成了数据的空洞
            for (int i=head;i<tail;++i){
                items[i-head]=items[i];
            }
            //搬完以后
            tail-=head;
            head=0;
        }
        items[tail]=item;
        ++tail;
        return true;
    }

    /**
     * 出队操作
     * @return
     */
    public String dequeue(){
        /**
         * 如果head==tail 表示队列为空队列
         */
        if(head==tail){
            return null;
        }
        String ret=items[head];
        ++head;
        return ret;

    }
}
