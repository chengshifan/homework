package operators;


import org.junit.Test;
import utils.OutputHandler;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by honestFan on 2020/8/10.
 */
public class AddOperatorTest {
    @Test
    public void testAddOperator() {
        String res = AddOperator.getAddOperator().compute(Arrays.asList("1", "2"));
        res = OutputHandler.handleOutput(res);
        assertTrue(res.equals("3"));
    }

}
