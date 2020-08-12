package operators;


import org.junit.Test;

import java.util.Stack;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by honestFan on 2020/8/10.
 */
public class DivideOperatorTest {
    @Test
    public void testAddOperator() throws Exception{
        Stack<String> stack = new Stack<>();
        stack.push("1.0");
        stack.push("3.0");
        Stack<String> res = new DivideOperator().compute(9, stack);
        assertTrue(res.peek().equals("0.3333333333"));
        assertEquals(1, res.size());
    }

}
