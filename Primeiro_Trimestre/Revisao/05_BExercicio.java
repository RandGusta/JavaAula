//Classificação de Notas
//Implemente um programa que leia as notas dos alunos e as ordene em ordem crescente usando o algoritmo de ordenação.
//O programa deve então exibir a
//lista ordenada e calcular a mediana das notas. Você deve utilizar métodos já implementados anteriormente.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de notas que irá inserir: ");
        int quantidade = scanner.nextInt();
        int[] vetor = new int[quantidade];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("informe a " + (i + 1) + "° nota: ");
            vetor[i] = scanner.nextInt();
        }
        DividirNotasMerge(vetor, 0, vetor.length - 1);
        double mediana  = calculandoMediana(vetor);
        System.out.println(mediana);


    }

    public static void DividirNotasMerge(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            DividirNotasMerge(vetor, inicio, meio);
            DividirNotasMerge(vetor, meio + 1, fim);
            OrdenarNotasMerge(vetor, inicio, meio, fim);
        }
    }

    public static void OrdenarNotasMerge(int[] vetor, int inicio, int meio, int fim) {
        int[] vetorTemporario = new int[fim - inicio + 1];
        int i = inicio;
        int j = meio + 1;
        int k = 0;
        while (i <= meio && j <= fim) {
            if (vetor[i] < vetor[j]) {
                vetorTemporario[k++] = vetor[i++];
            } else {
                vetorTemporario[k++] = vetor[j++];
            }
        }

        while (i <= meio) {
            vetorTemporario[k++] = vetor[i++];
        }

        while (j <= fim) {
            vetorTemporario[k++] = vetor[j++];
        }

        for (int l = 0; l < vetorTemporario.length; l++) {
            vetor[l + inicio] = vetorTemporario[l];
        }


    }

    public static double calculandoMediana(int[] vetor) {
        double mediana;
        if ((vetor.length) % 2 == 0) {
             mediana = ((vetor[((vetor.length) / 2) - 1]) + (vetor[((vetor.length) / 2)])) / 2.0;
        } else {
             mediana = vetor[(vetor.length - 1) / 2];
        }
        return mediana;
    }


}
