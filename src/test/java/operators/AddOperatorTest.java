package operators;


import org.junit.Test;

import java.util.Stack;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by honestFan on 2020/8/10.
 */
public class AddOperatorTest {
    @Test
    public void testAddOperator() throws Exception {
        Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2.0");
        Stack<String> res = new AddOperator().compute(7, stack);
        assertTrue(res.peek().equals("3"));
        assertEquals(1, res.size());
    }

}
