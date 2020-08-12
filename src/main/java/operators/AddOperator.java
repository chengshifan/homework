package operators;

import utils.OutputHandler;

import java.util.Stack;

/**
 * Created by honestFan on 2020/8/6.
 */
public class AddOperator implements BaseOperator<String> {

    private static AddOperator addOperator;

    private AddOperator() {
    }

    public static AddOperator getAddOperator() {
        if (addOperator == null) {
            synchronized (AddOperator.class) {
                if (addOperator == null) {
                    addOperator = new AddOperator();
                }
            }
        }
        return addOperator;
    }

    @Override
    public Stack<String> compute(Integer pos, Stack<String> s) throws Exception {
        if (s == null || s.size() < 2)
            throw new Exception("operator + (position: " + pos + "): insufficient parameters");
        Double num1 = Double.valueOf(s.pop());
        Double num2 = Double.valueOf(s.pop());
        String res = num1 + num2 + "";
        s.push(OutputHandler.handleOutput(res));
        return s;
    }


}
