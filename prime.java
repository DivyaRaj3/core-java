public class prime {

    public static void main(String[] args) {
        int i, j,c, n;
        System.out.println("All Prime Numbers Between 1 to 100");

        // For every number between 2 to 100, check
        //  whether it is prime number or not
        for (i = 2; i <= 100; i++) {
            c = 0;
            // Check whether i is prime or not
            for (j = 2; j <= i/2 ; j++) {
                // If any number between 2 to i/2 divides i
                // completely then i cannot be prime number
                if (i % j == 0) {
                    c++;
                    
                }
            }

            if (c == 0)
                System.out.print(i + " ");
        }

    }
}