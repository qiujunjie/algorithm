import annotation.TestMain;

import java.util.Arrays;

public class Main {
    private static int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

    public static void main(String[] args) throws Exception{
        method2(arr,6);
    }

    private static void method2(int array[],int number) {
        Arrays.sort(array);//对数组进行排序
        int begin=0;
        int end=array.length-1;
        int count=0;//两两相加等于number的组合种数
        System.out.println("方法二：");
        while (begin!=end) {
            if (array[begin]+array[end]<number) {
                begin++; //begin向后移动一位
            }else if (array[begin]+array[end]>number) {
                end--; //end向前移动一位
            }else {
                count++;
                System.out.println("第"+count+"种"+": "+array[begin]+"+"+array[end]+"=20");
                begin++;
                end--;
            }
        }
        System.out.println("等于20的组合共有"+count+"种");
    }

        /**
         * 算法分析：
         * 1、给定某个特定的价格，和价格数组，返回一组
         * @param target
         * @return
         */
    private String getBatterNum(int target) {
        for (int i :
                arr) {

        }

        return "null";
    }
}
