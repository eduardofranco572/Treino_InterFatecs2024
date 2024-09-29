import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito;
        int tipo = 0;

        for (int i = 0; i < 7; i++) {
            digito = sc.nextInt();
            if(tipo != 3) {
                if(i < 3) {
                    if (!(digito >= 65 && digito <= 90)) {
                        tipo = 3;
                    }

                } else if(i == 3 || i > 4) {
                    if (!(digito >= 48 && digito <= 57)) {
                        tipo = 3;
                    }
                } else if(i == 4) {
                    if(digito >= 48 && digito <= 57) {
                        tipo = 1;
                    }

                    if(digito >= 65 && digito <= 90) {
                        tipo = 2;
                    }
                }
            }
        }

        switch(tipo) {
            case 1:
                System.out.println("ANTIGA");
                break;
            case 2:
                System.out.println("MERCOSUL");
                break;
            case 3:
                System.out.println("ERRO");
                break;
        }
    }
}