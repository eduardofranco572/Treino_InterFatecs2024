import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Locale.setDefault(Locale.US);
        double I = sc.nextDouble();
        double A = sc.nextDouble();
        double T = sc.nextDouble();
        int resultado = 0;

        T = T/100;

        if(I >= A){
            System.out.println("pode comprar agora");
        }else{
            resultado = (int) Math.ceil(Math.log10(A/I)/Math.log10(1+T));
            if(resultado == 1){
                System.out.println("possivel em 1 mes");
            }else{
                System.out.println("possivel em " + resultado + " meses");
            }
        }

        sc.close();
    }
}