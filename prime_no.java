public class prime_no {
    public static void main(String[] args) {
        System.out.println("Prime numbers:");

        for (int i = 2; i < 40; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2)
                System.out.print(i + " ");
        }
    }
}