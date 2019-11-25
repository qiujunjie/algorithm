import java.util.Arrays;

public class SumTest {
    private static int arr[] = {1, 2, 3, 4, 5, 6, 7};
    private String name ;
    private int age;

    public class InnerClass{
        public InnerClass(){
            name = "chenssy";
            age = 23;
        }

        public void display(){
            System.out.println("name：" + name +"   ;age：" + age);
        }
    }

    public static void main(String[] args) {
//        methon(arr,7);
//        doMySum(arr, 10);
        SumTest sumTest = new SumTest();
        SumTest.InnerClass innerClass = new SumTest().new InnerClass();
        SumTest.InnerClass InnerClass = sumTest.new InnerClass();
        InnerClass.display();
    }

    private static void methon(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetSum) {
                priin(arr);
            }
            if (arr[i] > targetSum) {
                break;
            }
        }
    }


    public static void sum(int[] array, int sum) {
        int pos = -1;
        for (int index = 0; index < array.length; index++) {
            int[] tmpArr = new int[index + 1];
            digui(pos, index, 0, array, tmpArr, sum);
        }
    }

    // 递归求结果
    public static void digui(int pos, int index, int startPiont, int[] array, int[] tmpArr, int sum) {
        pos++;
        for (int i = startPiont; i < array.length; i++) {
            tmpArr[pos] = array[i];
            if (pos == index) {
                int sum1 = getSum(tmpArr);
                if (sum1 == sum) {
                    priin(tmpArr);
                }
                if (sum1 > sum) {
                    break;
                }
            }
            if (pos < index) {
                startPiont = i;
                digui(pos, index, startPiont, array, tmpArr, sum);
            }
        }
    }

    // 获取组合数字之和
    public static int getSum(int[] cache) {
        int sum = 0;
        for (int i = 0; i < cache.length; i++) {
            sum = sum + cache[i];
        }
        return sum;
    }

    // 打印组合的可能
    public static void priin(int[] cache) {
        for (int i = 0; i < cache.length; i++) {
            System.out.print(cache[i] + ",");
        }
        System.out.println();
    }

    // 转换数组类型 且为提高效率做准备
    public static int[] arrayTransform(String[] strArray) {
        int length = 0;
        int[] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.valueOf(strArray[i]);
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                length = i;
                break;
            }
        }
        int[] dest = new int[length];
        if (length == 0) {
            return array;
        }
        System.arraycopy(array, 0, dest, 0, length);
        return dest;
    }
}
