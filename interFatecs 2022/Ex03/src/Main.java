import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n > 100 || n < 1) {
            return;
        }

        int n_atual;
        List<Integer> n_falta = new ArrayList<>();
        int cont = 1;

        for(int i = 1; i <= n; i++) {
            n_atual = sc.nextInt();
            if(n_atual > 200 || n_atual < 1) {
                return;
            }
            while(cont != n_atual) {
                n_falta.add(cont);
                cont++;
            }
            cont++;
        }

        if(n_falta.size() == 0) {
            System.out.println("bom trabalho");
        } else {
            for(int i = 0; i < n_falta.size(); i++) {
                System.out.println(n_falta.get(i));
            }
        }

        sc.close();
    }
}