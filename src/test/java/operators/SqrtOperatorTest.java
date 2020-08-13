package operators;


import org.junit.Test;
import utils.OutputHandler;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by honestFan on 2020/8/10.
 */
public class SqrtOperatorTest {
    @Test
    public void testSqrtOperator() {
        String res = SqrtOperator.getSqrtOperator().compute(Arrays.asList("2.0"));
        res = OutputHandler.handleOutput(res);
        assertTrue(res.equals("1.4142135623"));
    }


}
