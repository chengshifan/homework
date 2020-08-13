package operators;

import java.util.List;

/**
 * Created by honestFan on 2020/8/6.
 */
public class MultipleOperator implements BaseOperator<String> {

    private static MultipleOperator multipleOperator;

    private MultipleOperator() {
    }

    public static MultipleOperator getMultipleOperator() {
        if (multipleOperator == null) {
            synchronized (MultipleOperator.class) {
                if (multipleOperator == null) {
                    multipleOperator = new MultipleOperator();
                }
            }
        }
        return multipleOperator;
    }

    @Override
    public String compute(List<String> datas) {
        Double num1 = Double.valueOf(datas.get(0));
        Double num2 = Double.valueOf(datas.get(1));
        return num1 * num2 + "";
    }


}
