import operators.*;
import utils.CacheHandler;
import utils.InputHandler;
import utils.OutputHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by honestFan on 2020/8/6.
 */
public class AppMain {
    static BaseOperator addOperator = AddOperator.getAddOperator();
    static BaseOperator subtractOperator = SubtractOperator.getSubtractOperator();
    static BaseOperator multipleOperator = MultipleOperator.getMultipleOperator();
    static BaseOperator sqrtOperator = SqrtOperator.getSqrtOperator();
    static BaseOperator divideOperator = DivideOperator.getDivideOperator();

    public static void main(String[] args) {
        System.out.println("RPN Staring...Please input number or +,-,*,/,sqrt,clean,undo");
        Stack<ArrayList<String>> cache = new Stack<>();
        Stack<String> stack = new Stack<>();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String data = scanner.nextLine();
            if (data == null || data.trim().length() == 0) {
                continue;
            }
            Integer index = 0;
            Integer pos = 1;
            String[] dataArr = data.trim().split(" ");
            Integer n = dataArr.length;
            while (index < n) {
                String cur = dataArr[index];
                String result = null;
                try {
                    if (cur.matches("^[-+]?[0-9]+(\\.[0-9]+)?$")) {
                        stack.push(cur);
                        pos += cur.length() + 1;
                    } else {
                        List<String> datas = InputHandler.getData(stack, cur, pos);
                        if (cur.equals("+")) {
                            result = (String) addOperator.compute(datas);
                        } else if (cur.equals("-")) {
                            result = (String) subtractOperator.compute(datas);
                        } else if (cur.equals("*")) {
                            result = (String) multipleOperator.compute(datas);
                        } else if (cur.equals("/")) {
                            result = (String) divideOperator.compute(datas);
                        } else if (cur.equals("sqrt")) {
                            result = (String) sqrtOperator.compute(datas);
                        } else if (cur.equals("undo")) {
                            stack = CacheHandler.handleUndo(cache);
                        } else if (cur.equals("clear")) {
                            stack.clear();
                        } else {
                            System.err.println("Unknown operator");
                            break;
                        }
                        pos += cur.length() + 1;
                    }
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                    break;
                }

                if (result != null) {
                    OutputHandler.handleStack(result, stack);
                }
                if (!cur.equals("undo")) {
                    CacheHandler.handleCache(cache, new ArrayList<>(stack));
                }
                index++;

            }
            OutputHandler.printStack(stack);
        }
    }
}
