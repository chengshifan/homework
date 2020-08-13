package operators;

import java.util.List;

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
    public String compute(List<String> datas) {
        Double num1 = Double.valueOf(datas.get(0));
        Double num2 = Double.valueOf(datas.get(1));
        return num1 + num2 + "";
    }


}
