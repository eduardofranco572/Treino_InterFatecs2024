import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String E = scanner.nextLine().replace(" ", "");

        int s = (int) Math.pow(2, N) - 1;
        int movjafeitos = Integer.parseInt(E, 2);
        int mandafuncao = s - movjafeitos;

        System.out.println(mandafuncao);
    }

}