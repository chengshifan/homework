import operators.*;
import utils.CacheHandler;
import utils.OutputHandler;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by honestFan on 2020/8/6.
 */
public class AppMain {
    public static void main(String[] args) {
        System.out.println("RPN Staring...Please input number or +,-,*,/,sqrt,clean,undo");
        Stack<ArrayList<String>> cache = new Stack<>();
        Stack<String> datas = new Stack<>();
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
                try {
                    if (cur.matches("^[-+]?[0-9]+(\\.[0-9]+)?$")) {
                        datas.push(cur);
                        pos += cur.length() + 1;
                    } else {
                        if (cur.equals("+")) {
                            datas = new AddOperator().compute(pos, datas);
                        } else if (cur.equals("-")) {
                            datas = new SubtractOperator().compute(pos,datas);
                        } else if (cur.equals("*")) {
                            datas = new MultipleOperator().compute(pos,datas);
                        } else if (cur.equals("/")) {
                            datas = new DivideOperator().compute(pos,datas);
                        } else if (cur.equals("sqrt")) {
                            datas = new SqrtOperator().compute(pos,datas);
                        } else if (cur.equals("undo")) {
                            datas = CacheHandler.handleUndo(cache);
                        } else if (cur.equals("clear")) {
                            datas = new ClearOperator().compute(pos,datas);
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

                if (!cur.equals("undo")) {
                    CacheHandler.handleCache(cache, new ArrayList<>(datas));
                }
                index++;

            }
            OutputHandler.printStack(datas);
        }
    }
}