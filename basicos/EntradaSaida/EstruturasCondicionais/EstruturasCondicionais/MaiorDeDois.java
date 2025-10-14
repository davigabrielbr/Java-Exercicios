package EstruturasCondicionais;

import java.util.Scanner;

public class MaiorDeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        if (n1 == n2) {
            System.out.println("Os valores digitados são iguais!");
        } else if (n1 > n2) {
            System.out.println("Maior número digitado: " + n1);
        } else {
            System.out.println("Maior número digitado: " + n2);
        }

        scanner.close();
    }
}
