public class Main {
    public static void main(String[] args) {
        // Task 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Task 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Task 3
        for (int i = 0; i <= 17; i += 2) {
            if (i == 0) {
                continue;
            }
            System.out.println(i);
        }

        // Task 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Task 5
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }
}