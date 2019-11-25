package annotation;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        String s = "1221337";
        Stack<Integer> strings = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int res = strings.search(s.charAt(i));
            if (res < 0) {
                System.out.printf(res + "");
            } else {
                strings.push(res);
            }
        }
    }
}
