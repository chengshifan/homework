package operators;

import java.util.List;

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
    public String compute(List<String> datas) {
        Double num1 = Double.valueOf(datas.get(0));
        Double num2 = Double.valueOf(datas.get(1));
        return num1 - num2 + "";
    }


}
