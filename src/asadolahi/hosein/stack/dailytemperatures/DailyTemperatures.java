package asadolahi.hosein.stack.dailytemperatures;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] stack = new int[temperatures.length];
        int[] res = new int[temperatures.length];
        int pointer = 0;
        for (int i = 0; i < temperatures.length; i++) {
            while (pointer != 0 && temperatures[i] > temperatures[stack[pointer - 1]]) {
                int j = stack[--pointer];
                res[j] = i - j;
            }
            stack[pointer++] = i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
    }
}