package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by honestFan on 2020/8/10.
 */
public class InputHandler {

    public static List<String> getData(Stack<String> stack, String operator, Integer pos) throws Exception {
        List<String> res = new ArrayList<>();
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            if (stack == null || stack.size() < 2) {
                throw new Exception("operator " + operator + " (position: " + pos + "): insufficient parameters");
            } else {
                String num1 = stack.pop();
                String num2 = stack.pop();
                if (operator.equals("/") && num1.equals("0")) {
                    throw new Exception("operator / (position: " + pos + "): cannot /0");
                }
                res.add(num2);
                res.add(num1);
            }

        } else if (operator.equals("sqrt")) {
            if (stack == null || stack.size() < 1) {
                throw new Exception("operator + (position: " + pos + "): insufficient parameters");
            } else {
                String num1 = stack.pop();
                if (Double.valueOf(num1) < 0) {
                    throw new Exception("operator sqrt (position: " + pos + "): sqrt is not available for a negative number");
                }
                res.add(num1);
            }
        } else {
            //undo and clear
            return res;
        }
        return res;

    }


}
