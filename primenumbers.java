public class primenumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 20; i++) {
            int factors = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }
            if (factors == 2) {
                count++;
                if (count == 5) {
                    continue;   
                }
                System.out.print(i + " ");
            }
        }
    }
}