package stack;
/**
 * @ClassName ArrayStack
 * @Description 基于数组的栈
 * @Author pujinwen
 * @Date 2020-09-27 11:09
 * @Version 1.0
 **/
public class ArrayStack {

    /**
     * 基于数组实现的栈就是固定大小的栈
     */
    private String[] items;

    /**
     * 栈中元素的个数
     */
    private int count;

    /**
     * 栈的大小
     */
    private int capacity;


    //初始化数组，申请一个大小为n的数组空间
    public ArrayStack(int capacity){
        this.items=new String[capacity];
        this.capacity=capacity;
        this.count=0;
    }

    /**
     * 入栈操作
     * @param item
     * @return
     */
    public boolean push(String item){
        if(count==capacity){
            return false;
        }
        items[count]=item;
         ++count;
         return true;
    }

    /**
     * 出栈的操作
     * @return
     */
    public String pop(){
        //栈中没有数据
        if(count==0){
            return null;
        }
        String temp=items[count-1];
        --count;
        return temp;

    }

}
