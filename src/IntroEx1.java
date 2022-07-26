public class IntroEx1 {
    public static int squirrel(int n) {
        long num = 1;

        for (int i = 1; i <= n; i++) {
            num *= i;
        }
        String s = String.valueOf(num);

        return Character.getNumericValue(s.charAt(0));
    }
}
