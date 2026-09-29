 public class twinprimenumber {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            int factors1 = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors1++;
                }
            }

            int factors2 = 0;
            for (int j = 1; j <= i + 2; j++) {
                if ((i + 2) % j == 0) {
                    factors2++;
                }
            }

            if (factors1 == 2 && factors2 == 2) {
                System.out.println(i + " " + (i + 2));
            }
        }
    }
} 
