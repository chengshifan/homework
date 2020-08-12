package operators;

import utils.OutputHandler;

import java.util.Stack;

/**
 * Created by honestFan on 2020/8/6.
 */
public class SqrtOperator implements BaseOperator<String> {

    private static SqrtOperator sqrtOperator;

    private SqrtOperator() {
    }

    public static SqrtOperator getSqrtOperator() {
        if (sqrtOperator == null) {
            synchronized (SqrtOperator.class) {
                if (sqrtOperator == null) {
                    sqrtOperator = new SqrtOperator();
                }
            }
        }
        return sqrtOperator;
    }

    @Override
    public Stack<String> compute(Integer pos, Stack<String> s) throws Exception {
        if (s == null || s.size() < 1)
            throw new Exception("operator sqrt (position: " + pos + "): insufficient parameters");
        String num1Str = s.pop();
        Double num1 = Double.valueOf(num1Str);
        if (num1 < 0) {
            throw new Exception("operator sqrt (position: " + pos + "): sqrt is not available for a negative number");
        }
        String res = Math.sqrt(num1) + "";
        s.push(OutputHandler.handleOutput(res));
        return s;
    }


}
