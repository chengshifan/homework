package operators;

import java.util.List;

/**
 * Created by honestFan on 2020/8/6.
 */
public class DivideOperator implements BaseOperator<String> {

    private static DivideOperator divideOperator;

    private DivideOperator() {
    }

    public static DivideOperator getDivideOperator() {
        if (divideOperator == null) {
            synchronized (DivideOperator.class) {
                if (divideOperator == null) {
                    divideOperator = new DivideOperator();
                }
            }
        }
        return divideOperator;
    }

    @Override
    public String compute(List<String> datas) {
        String num1Str = datas.get(0);
        String num2Str = datas.get(1);
        Double num1 = Double.valueOf(num1Str);
        Double num2 = Double.valueOf(num2Str);
        return num1 / num2 + "";
    }

}
