package annotation;

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = {6,2,1,9,6,4,3,2,1,7,11};
        sort1(nums,0,nums.length -1);
        for (int i : nums){
            System.out.printf(i + " ");
        }
    }


    /**
     * 思想，双重while循环，分治法加递归，取第一个a作为对比对象，从0到最高位进行对比，把小于a的放在左边，大于的放在右边，
     * 1.a和高位对比，如果高位小于a，则把a的位置赋值给高位，
     * 2.然后再从低位+1开始对比a，如果大于a，咋把低位赋值给高位height，height在减1
     * 3.循环结束，把指针最后的位置赋值给a，a正好是分割点，左边小于a，右边大于a
     * 4.然后递归a的左边，low~low-1,low+1~height
     * @param num
     * @param low
     * @param height
     */
    public static void sort1(int[] num,int low,int height) {
        if (low >= height) {
            return;
        }
        int low1 = low;
        int height1 = height;
        int index = num[low1];
        while (low1 < height1) {
            while (low1 < height1 && index < num[height1]) {
                height1--;
            }
            if (low1 < height1) {
                num[low1++] = num[height1];
            }
            while (low1 < height1 && index > num[low1]) {
                low1++;
            }
            if (low1 < height1) {
                num[height1--] = num[low1];
            }
        }
        num[low1] = index;
        sort1(num,low,low1 - 1);
        sort1(num,low1 + 1,height);
    }


    public static void sort(int nums[],int low,int height) {
        if (low >= height) {
            return;
        }
        int i = low;
        int j = height;
        int index = nums[i];
        while (i < j) {
            while (i < j && nums[j] > index) {
                j--;
            }
            if (i < j) {
                nums[i++] = nums[j];
            }
            while (i < j && nums[i] < index) {
                i++;
            }
            if (i < j) {
                nums[j--] = nums[i];
            }
        }
        nums[i] = index;
        sort(nums,low,i-1);
        sort(nums,i + 1,height);
    }
}
