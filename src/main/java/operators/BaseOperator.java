package operators;

import java.util.List;

/**
 * Created by honestFan on 2020/8/6.
 */
public interface BaseOperator<T> {

    T compute(List<T> datas) throws Exception;

}
