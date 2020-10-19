package BinarySearch;

/**
 * @ClassName SimpleBrinarySearch
 * @Description 简单的二分查找
 * 条件：有序数组中不存在重复数据
 * @Author pujinwen
 * @Date 2020-10-16 17:22
 * @Version 1.0
 **/
public class SimpleBrinarySearch {

    public int  bsearch(int[] a,int value){
        //需要两个指针
        int low=0;

        int n=a.length;

        int high=n-1;

        while (low<=high){
            int mid=(low+high)/2;

            if(a[mid]==value){
                return mid;
            }else if(a[mid]<value){

                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return -1;
    }


}
