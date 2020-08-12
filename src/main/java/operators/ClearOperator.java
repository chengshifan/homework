package operators;

import java.util.Stack;

/**
 * Created by honestFan on 2020/8/6.
 */
public class ClearOperator implements BaseOperator<String> {

    public ClearOperator() {
    }

    @Override
    public Stack<String> compute(Integer pos, Stack<String> s) throws Exception{
        s.clear();
        return s;
    }


}
