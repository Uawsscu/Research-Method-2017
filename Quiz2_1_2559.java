/*
 * @author tong_Uawsscu
 */
import java.util.*;

public class Quiz2_1_2559 {

    Map<Integer, Integer> input = new HashMap<>();
    Scanner in = new Scanner(System.in);
    int max = -1;

    public static void main(String[] args) {
        Quiz2_1_2559 t = new Quiz2_1_2559();
        t.getInput();
        t.printAll();
    }

    void getInput() {
        for (;;) {
            int x = in.nextInt();
            if (x < 0) {
                break;
            }
            if (input.get(x) == null) {
                input.put(x, 1);
            } else {
                input.put(x, input.get(x) + 1);
                if (input.get(x) > max) {
                    max = input.get(x);
                }
            }

        }
    }

    void printAll() {
        for (Map.Entry entry : input.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Max Frequency = " + max);
        for (Map.Entry entry : input.entrySet()) {
            if ((int) entry.getValue() == max) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

}
