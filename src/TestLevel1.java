import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestLevel1 {

    @Test
    public void test() {
        int N = 21;
        long num = 1;

        for (int i = 1; i < N; i++) {
            num *= i;

            String s = String.valueOf(num);
            int firstSym = Character.getNumericValue(s.charAt(0));

            long num2 = num;

            while (num2 > 9) {
                num2 /= 10;
            }

            assertTrue(firstSym == num2);
        }
    }
}