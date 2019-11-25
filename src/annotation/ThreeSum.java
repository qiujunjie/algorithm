package annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] num = {};

    }

    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> arrs = new ArrayList();
        int len = nums.length;
        if (len < 3) {
            return arrs;
        }
        Arrays.sort(nums);
        for (int i = 0;i<len;i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i + 1]) {
                continue;
            }
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    arrs.add(Arrays.asList(nums[i] , nums[L] , nums[R]));
                    while (nums[L] == nums[L + 1]) {
                        L++;
                    }
                    while (nums[R] == nums[R - 1]) {
                        R--;
                    }
                    L++;
                    R--;
                } else if (sum > 0) {
                    R--;
                } else {
                    L++;
                }
            }
        }
        return arrs;
    }
}
