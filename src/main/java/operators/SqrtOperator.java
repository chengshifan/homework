package operators;

import java.util.List;

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
    public String compute(List<String> s) {
        String num1Str = s.get(0);
        Double num1 = Double.valueOf(num1Str);
        return Math.sqrt(num1) + "";
    }


}
