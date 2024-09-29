import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String linha1 = sc.next();
        String linha2 = sc.next();
        String saida = "";

        int maisoumenos = 0;
        int contador = 0;

        // Criar vetor com o alfabeto
        char[] alfabeto = new char[26];
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ('a' + i);
        }

        for (int i = 0; i < linha1.length(); i++) {
            char letra = linha1.charAt(i);

            if(letra == 'w'){
                saida += " ";
            }else {
                if(linha2.charAt(contador) == '+'){
                    maisoumenos = 1;
                    contador++;

                }else if(linha2.charAt(contador) == '-'){
                    maisoumenos = -1;
                    contador++;
                }

                int conta = linha2.charAt(contador) - '0';
                contador++;

                int posicao = -1;
                for (int j = 0; j < alfabeto.length; j++) {
                    if (alfabeto[j] == letra) {
                        posicao = j;
                        break;
                    }
                }

                if (posicao != -1){
                    int novaPosicao = posicao + maisoumenos * conta;

                    // Girar para tras
                    if (novaPosicao < 0) {
                        novaPosicao = 26 + (novaPosicao % 26);
                    }
                    // Girar para frente
                    if (novaPosicao >= 26) {
                        novaPosicao = novaPosicao % 26;
                    }

                    saida += alfabeto[novaPosicao];

                }
            }
        }
        System.out.println(saida);

        sc.close();
    }
}

