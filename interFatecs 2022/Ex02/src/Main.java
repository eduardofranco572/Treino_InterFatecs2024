import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double Tr = sc.nextDouble();
        double P = sc.nextDouble();
        double V = sc.nextDouble();

        System.out.printf("%.2f",(P-Tr)*V);

        sc.close();
    }
}