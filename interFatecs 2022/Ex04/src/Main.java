import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_pessoas = sc.nextInt();
        int n_eventos = sc.nextInt();
        List<Grupo> grupos = new ArrayList<Grupo>();

        for (int i = 1; i <= n_pessoas; i++) {
            grupos.add(new Grupo(i));
        }

        int p1;
        int p2;
        int pos_p1;
        int pos_p2;
        int n;

        List<String> impressao = new ArrayList<String>();

        for (int i = 0; i < n_eventos; i++) {
            String comando = sc.next();
            switch (comando) {
                case "c": // cria contato
                    p1 = sc.nextInt();
                    p2 = sc.nextInt();

                    pos_p1 = buscaGrp(grupos, p1);
                    pos_p2 = buscaGrp(grupos, p2);

                    for (int j = 0; j < grupos.get(pos_p2).pessoas.size(); j++) {
                        grupos.get(pos_p1).pessoas.add(grupos.get(pos_p2).pessoas.get(j));
                    }

                    if(grupos.get(pos_p1).pessoas.size() == 2) {
                        int temp;
                        if (grupos.get(pos_p1).pessoas.get(0) > grupos.get(pos_p1).pessoas.get(1)) {
                            temp = grupos.get(pos_p1).pessoas.get(1);
                            grupos.get(pos_p1).pessoas.set(1, grupos.get(pos_p1).pessoas.get(0));
                            grupos.get(pos_p1).pessoas.set(0, temp);
                        }
                    }

                    grupos.remove(pos_p2);

                    break;
                case "p": // contaminado
                    p1 = sc.nextInt();

                    pos_p1 = buscaGrp(grupos, p1);
                    grupos.get(pos_p1).seguro = false;

                    break;
                case "n": // total
                    n = grupos.size();
                    impressao.add(String.valueOf(n));

                    break;
                case "ns": // seguros
                    n = 0;
                    for (int j = 0; j < grupos.size(); j++) {
                        if(grupos.get(j).seguro) {
                            n++;
                        }
                    }

                    impressao.add(String.valueOf(n));

                    break;
                case "ni": // inseguros
                    n = 0;
                    for (int j = 0; j < grupos.size(); j++) {
                        if(!grupos.get(j).seguro) {
                            n++;
                        }
                    }

                    impressao.add(String.valueOf(n));

                    break;
                case "ii": // pessoas inseguras

                    String linha = "";
                    n = 0;

                    for (int j = 0; j < grupos.size(); j++) {
                        if(!grupos.get(j).seguro) {
                            for (int k = 0; k < grupos.get(j).pessoas.size(); k++) {
                                n++;
                                linha += grupos.get(j).pessoas.get(k);
                                if(k != grupos.get(j).pessoas.size() - 1) {
                                    linha += " ";
                                }
                            }
                        }
                    }

                    if(n == 0) {
                        impressao.add("vazio");
                    } else {
                        impressao.add(linha);
                    }

                    break;
            }

        }

        for (int i = 0; i < impressao.size(); i++) {
            System.out.println(impressao.get(i));
        }
    }

    public static int buscaGrp(List<Grupo> grupos, int pessoa) {
        for (int i = 0; i < grupos.size(); i++) {
            for(int j = 0; j < grupos.get(i).pessoas.size(); j++) {
                if(pessoa == grupos.get(i).pessoas.get(j)) {
                    return i;
                }
            }
        }

        return -1;
    }

}

class Grupo{
    public List<Integer> pessoas;
    public Boolean seguro;

    public Grupo(int pessoa) {
        this.pessoas = new ArrayList<Integer>();
        this.pessoas.add(pessoa);
        this.seguro = true;
    }
}