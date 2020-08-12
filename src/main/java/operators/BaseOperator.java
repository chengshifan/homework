package operators;

import java.util.Stack;

/**
 * Created by honestFan on 2020/8/6.
 */
public interface BaseOperator<T>{

    Stack<T> compute(Integer pos, Stack<T> s) throws Exception;

}
