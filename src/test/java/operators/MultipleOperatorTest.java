package operators;


import org.junit.Test;
import utils.OutputHandler;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by honestFan on 2020/8/10.
 */
public class MultipleOperatorTest {
    @Test
    public void testMultipleOperator() {
        String res = MultipleOperator.getMultipleOperator().compute(Arrays.asList("1.0", "2.0"));
        res = OutputHandler.handleOutput(res);
        assertTrue(res.equals("2"));
    }

}
