/*
 * @author tong_Uawsscu
 */
import java.util.*;

public class Q1_FactoringNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(;;) {
            int min = 1;
            int x = in.nextInt();
            if (x <= 0) break;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    min = x/i;
                    break;
                }
            }
            System.out.println(x + " "+min);
        }
        
        
    }
}