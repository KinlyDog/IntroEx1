public class Level1 {
    public static int squirrel(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        String s = String.valueOf(factorial);

        return Character.getNumericValue(s.charAt(0));
    }
}
