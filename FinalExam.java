
/**
 *
 * @author tong_Uawsscu
 */
import java.util.*;

public class FinalExam {

    Map<Integer, Integer> input = new HashMap();
    Scanner in = new Scanner(System.in);
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        FinalExam t = new FinalExam();
        t.getInput();
        t.printAll();
    }

    void getInput() {
        for (;;) {
            int x = in.nextInt();
            if (x < 0) {
                break;
            }
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (input.get(x) == null) {
                input.put(x, 1);
            } else {
                input.put(x, input.get(x) + 1);
            }

        }
    }

    void printAll() {
        System.out.println("Number = " + input.size() + " min = " + min + " max = " + max);
        for (int i = max; i >= min; i--) {
            if(input.get(i)==null) System.out.print(i+" ");
        }
    }
}
//0 5 9 6 8 8 5 3 7 0 9 -1
