package operators;

import utils.OutputHandler;

import java.util.Stack;

/**
 * Created by honestFan on 2020/8/6.
 */
public class SubtractOperator implements BaseOperator<String> {

    private static SubtractOperator subtractOperator;

    private SubtractOperator() {
    }

    public static SubtractOperator getSubtractOperator() {
        if (subtractOperator == null) {
            synchronized (SubtractOperator.class) {
                if (subtractOperator == null) {
                    subtractOperator = new SubtractOperator();
                }
            }
        }
        return subtractOperator;
    }

    @Override
    public Stack<String> compute(Integer pos, Stack<String> s) throws Exception{
        if (s == null || s.size() < 2)
            throw new Exception("operator - (position: " + pos + "): insufficient parameters");
        Double num2 = Double.valueOf(s.pop());
        Double num1 = Double.valueOf(s.pop());
        String res = num1 - num2 + "";
        s.push(OutputHandler.handleOutput(res));
        return s;
    }


}
