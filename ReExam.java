
/**
 * @author tong_Uawsscu
 */
import java.util.*;

public class ReExam {

    static Scanner in = new Scanner(System.in);
    Map<Integer, Integer> input = new HashMap();
    int max = Integer.MIN_VALUE;
    int v1 = 0, v2 = 0, v3 = 0;
    ArrayList<Integer> arrVote = new ArrayList();

    public static void main(String[] args) {
        ReExam t = new ReExam();

        t.getInput();
        t.printAll();
        t.printMax();
    }

    void getInput() {

        for (;;) {
            int id = in.nextInt();
            if (id < 0) {
                break;
            }
            int x = in.nextInt();
            if (input.get(id) == null) {
                input.put(id, x);
                if (x == 1) {
                    v1++;
                } else if (x == 2) {
                    v2++;
                } else if (x == 3) {
                    v3++;
                }
            }
        }
        arrVote.add(v1);
        arrVote.add(v2);
        arrVote.add(v3);
    }

    void printAll() {
        int i=0;
        for (Integer arr : arrVote) {
            i++;
            if (arr > max) {
                max = arr;
            }
            System.out.println( i+ " has " + arr + " votes");
        }
    }

    void printMax() {
        int i=0;
       for (Integer arr : arrVote) {
           i++;
            if (arr == max) {
                System.out.println( i+ " win");
                break;
            }
        }
    }
}
