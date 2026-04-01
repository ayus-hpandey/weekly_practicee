package week3;
import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        double[] returns = {12, 8, 15};

        Arrays.sort(returns);
        System.out.println("Ascending: " + Arrays.toString(returns));

        // Descending
        for (int i = 0; i < returns.length / 2; i++) {
            double temp = returns[i];
            returns[i] = returns[returns.length - i - 1];
            returns[returns.length - i - 1] = temp;
        }

        System.out.println("Descending: " + Arrays.toString(returns));
    }
}