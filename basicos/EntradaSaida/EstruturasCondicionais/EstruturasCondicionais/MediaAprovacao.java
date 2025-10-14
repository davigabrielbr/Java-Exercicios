package EstruturasCondicionais;

import java.util.Scanner;

public class MediaAprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }

        scanner.close();
    }
}