import java.util.Scanner;
//import java.util.LinkedList;
//import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int qtd = sc.nextInt();
            int passos = sc.nextInt();
            int result = 0;

            for (int i = 2; i <= qtd; i++) {
                result = (result + passos) % i;
            }

            System.out.println(result + 1);
        }
        sc.close();
    }
}

//        Integer qtd = sc.nextInt();
//        Integer passos = sc.nextInt();
//        int atual = 0;
//
//        Queue<Integer> fila = new LinkedList<>();
//        LinkedList<Integer> fila = new LinkedList<>();
//        Queue<Integer> filaTemporaria = new LinkedList<>();
//
//        for (int i = 0; i < qtd; i++){
//            fila.add(i);
//        }
//
//        while (!fila.isEmpty()){
//            for(int j = 0; j < qtd; j += passos) {
//                Integer num = fila.poll();
//                System.out.println(j);
//
//                if (fila.equals(qtd - 1)) {
//                    atual++;
//                    fila = filaTemporaria;
//                   break;
//                }
//                if (num != j ){
//                    filaTemporaria.add(num);
//                }
//
//            }
//        }

//System.out.println(atual);
