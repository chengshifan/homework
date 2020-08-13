package operators;


import org.junit.Test;
import utils.OutputHandler;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by honestFan on 2020/8/10.
 */
public class DivideOperatorTest {
    @Test
    public void testDivideOperator() {
        String res = DivideOperator.getDivideOperator().compute(Arrays.asList("1", "3"));
        res = OutputHandler.handleOutput(res);
        assertTrue(res.equals("0.3333333333"));
    }

}
