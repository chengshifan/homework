package operators;


import org.junit.Test;

import java.util.Stack;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by honestFan on 2020/8/10.
 */
public class SubtractOperatorTest {
    @Test
    public void testAddOperator() throws Exception{
        Stack<String> stack = new Stack<>();
        stack.push("1.0");
        stack.push("2.0");
        Stack<String> res = new SubtractOperator().compute(9, stack);
        assertTrue(res.peek().equals("-1"));
        assertEquals(1, res.size());
    }

}
