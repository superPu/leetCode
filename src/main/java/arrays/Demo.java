package arrays;
import java.util.Arrays;
/**
 * @ClassName Demo
 * @Description 测试
 * @Author pujinwen
 * @Date 2020-10-14 16:14
 * @Version 1.0
 **/
public class Demo {

    public int findBestValue(int[] arr,int target){
        /**
         * 思路：
         *
         * 第一次二分查找：
         *
         * 从0--->arr.length-1
         *
         * arr[i]  arr[i+1]
         *
         * s=sum(arr[0->mid]+arr[mid]*(n-1-mid))
         *
         * 第二次二分
         *
         * val in [arr[i],arr[i+1]]
         */
        Arrays.sort(arr);


        int n=arr.length;

        //求前缀合

        long[] presum=new long[n+1];

        for(int i=1;i<=n;i++){
            presum[i] += presum[i-1]+arr[i-1];
        }

        int start=0;

        int end=n-1;

        while (start+1<end){
            int mid=start+(end-start)/2;

            long sum=presum[mid+1]+arr[mid]*(n-1-mid);

            if(sum<target){
                start=mid;
            }else{
                end=mid;
            }
        }

        long pre=presum[start];
        int count=n-start-1;
        if((long)arr[0]*n>target){
            start=0;
            end=arr[0];
            count+=1;
        }else{
            pre=presum[start+1];
            start=arr[start];
            end=arr[end];
        }

        while (start+1<end){
            int mid=start+(end-start)/2;
            long sum=pre+mid*count;
            if(start<target){
                start=mid;
            }else{
                end=mid;
            }
        }

        long startSum=pre+start*count;
        long endSum=pre+end*count;

        if(Math.abs(startSum-target)<= Math.abs(endSum-target)){
            return start;
        }else{
            return end;
        }












    }











}
