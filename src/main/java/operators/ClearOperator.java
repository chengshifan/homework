package operators;

import java.util.Stack;

/**
 * Created by honestFan on 2020/8/6.
 */
public class ClearOperator implements BaseOperator<String> {
    private static ClearOperator clearOperator;

    private ClearOperator() {
    }

    public static ClearOperator getClearOperator() {
        if (clearOperator == null) {
            synchronized (ClearOperator.class) {
                if (clearOperator == null) {
                    clearOperator = new ClearOperator();
                }
            }
        }
        return clearOperator;
    }


    @Override
    public Stack<String> compute(Integer pos, Stack<String> s) throws Exception {
        s.clear();
        return s;
    }


}
