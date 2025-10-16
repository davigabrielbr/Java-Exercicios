package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        float vetor[] = new float[4];
        float soma = 0;

        for (int contador = 0; contador < vetor.length; contador++) {
            System.out.print("Digite a nota " + (contador + 1) + ": ");
            vetor[contador] = scanner.nextFloat();
            soma += vetor[contador];
        }

        float media = soma / vetor.length;

        System.out.printf("Média das notas: %.2f\n", media);

        scanner.close();
    }
}