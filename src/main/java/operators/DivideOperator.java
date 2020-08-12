package operators;

import utils.OutputHandler;

import java.util.Stack;

/**
 * Created by honestFan on 2020/8/6.
 */
public class DivideOperator implements BaseOperator<String> {

    public DivideOperator() {
    }

    @Override
    public Stack<String> compute(Integer pos, Stack<String> s) throws Exception {
        if (s == null || s.size() < 2)
            throw new Exception("operator / (position: " + pos + "): insufficient parameters");
        String num2Str = s.pop();
        String num1Str = s.pop();
        Double num2 = Double.valueOf(num2Str);
        Double num1 = Double.valueOf(num1Str);
        if (num2 == 0) {
            s.push(num1Str);
            s.push(num2Str);
            throw new Exception("operator / (position: " + pos + "): cannot /0");
        }
        String res = num1 / num2 + "";
        s.push(OutputHandler.handleOutput(res));
        return s;
    }


}
