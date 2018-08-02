import java.util.Scanner;
public class revn {

    public static void main(String[] args) {

        int n, rev = 0;
Scanner s=new Scanner(System.in);
System.out.println("Enter a no: ");
	n=s.nextInt();
        while(n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        System.out.println("Reversed Number: " + rev);
    }
}
