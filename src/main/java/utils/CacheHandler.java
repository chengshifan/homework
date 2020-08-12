package utils;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by honestFan on 2020/8/10.
 */
public class CacheHandler {

    public static void handleCache(Stack<ArrayList<String>> cache, ArrayList<String> datas) {
        cache.push(datas);
    }

    public static Stack<String> handleUndo(Stack<ArrayList<String>> cache) {
        if (cache != null && cache.size() > 0) {
            cache.pop();
            if (cache != null && cache.size() > 0) {
                Stack<String> datas = new Stack<>();
                ArrayList<String> c = cache.peek();
                c.stream().forEach(x -> datas.push(x));
                return datas;
            }
            else{
                return new Stack<>();
            }
        } else {
            return new Stack<>();
        }
    }

}
