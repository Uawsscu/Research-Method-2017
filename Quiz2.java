
/**
 * Factoring number classification
 *
 * @author tong_Uawsscu
 */
import java.util.ArrayList;
import java.util.*;

public class Quiz2 {

    Scanner in = new Scanner(System.in);
    ArrayList<Integer> Odd = new ArrayList<>();
    ArrayList<Integer> Even = new ArrayList<>();
    ArrayList<Integer> equal = new ArrayList<>();
    ArrayList<Integer> Prime = new ArrayList<>();
    Map<Integer, ArrayList> input = new TreeMap();

    public static void main(String[] args) {
        Quiz2 t = new Quiz2();
        t.getInput();
        t.printAll();
    }

    void getInput() {

        int i = 1;
        while (i <= 10000) {
            ArrayList<Integer> arr = new ArrayList<>();
            int countOdd = 0, countEven = 0;

            int x = in.nextInt();
            if (x <= 0) {
                break;
            }
            for (int j = 1; j <= x; j++) {

                if (x % j == 0 && (x / j) % 2 == 0) {
                    arr.add(j);
                    countEven++;
                } else if (x % j == 0 && (x / j) % 2 != 0) {
                    arr.add(j);
                    countOdd++;
                }

            }
            if (countEven + countOdd == 2) {
                Prime.add(x);
            } else if (countEven > countOdd) {
                Even.add(x);
            } else if (countOdd > countEven) {
                Odd.add(x);
            } else {
                equal.add(x);
            }
//            for (Integer a : arr) {
//                System.out.print(a + " ");
//            }
            input.put(x, arr);
            i++;
        }
    }

    void printAll() {
        System.out.println("prime = " + Prime.size() + " more odd = " + Odd.size() + " more even = " + Even.size() + " equal = " + equal.size());
        printList(Prime);
        printList(Odd);
        printList(Even);
        printList(equal);
    }

    void printList(ArrayList arr) {
        System.out.println("##########");
        for (int indexArr = 0; indexArr < arr.size(); indexArr++) {
            System.out.print(arr.get(indexArr) + " ");
            for (int i = 0; i < input.get(arr.get(indexArr)).size(); i++) {
                System.out.print(input.get(arr.get(indexArr)).get(i) + " ");
            }
            System.out.println();
        }

    }
}
