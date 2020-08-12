package utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by honestFan on 2020/8/10.
 */
public class CacheHandlerTest {

    @Test
    public void testHandleCache() {
        Stack<ArrayList<String>> cache = new Stack<>();
        ArrayList<String> datas = new ArrayList<>();
        List list = Arrays.asList("1.0", "2.0");
        datas.addAll(list);
        CacheHandler.handleCache(cache, datas);
        assertTrue(cache.peek().equals(Arrays.asList("1.0", "2.0")));
        assertEquals(1, cache.size());
    }

    @Test
    public void testHandleUndo() {
        Stack<ArrayList<String>> cache = new Stack<>();
        List list1 = Arrays.asList("1.0");
        List list2 = Arrays.asList("2.0");
        ArrayList<String> datas = new ArrayList<>();
        datas.addAll(list1);
        cache.push(datas);
        datas = new ArrayList<>();
        datas.addAll(list2);
        cache.push(datas);
        Stack<String> res = CacheHandler.handleUndo(cache);
        assertTrue(res.equals(Arrays.asList("1.0")));
        assertEquals(1, cache.size());
    }

}
