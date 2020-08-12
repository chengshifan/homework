package utils;

import java.util.Stack;

/**
 * Created by honestFan on 2020/8/10.
 */
public class OutputHandler {

    public static String handleOutput(String res) {
        Integer begin = res.indexOf(".") + 1;
        Integer end = begin + res.substring(begin).length();
        if (end > begin && res.substring(begin, end).matches("^[0]*$")) {
            res = res.substring(0, begin - 1);
            return res;
        } else {
            if (end - begin > 10) {
                String newRes = String.format("%.11f", Double.valueOf(res)).substring(0, String.format("%.11f", Double.valueOf(res)).length() - 1);
                if (newRes.endsWith("0")) {
                   return handleOutput(newRes);
                }
                return newRes;
            } else {
                String newRes = Double.valueOf(res) + "";
                if (newRes.endsWith("0")) {
                    return handleOutput(newRes);
                }
                return newRes;
            }
        }
    }

    public static void printStack(Stack<String> stack) {
        System.out.println("stack: " + stack);
    }

}
