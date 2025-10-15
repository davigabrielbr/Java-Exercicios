import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        for (int contador = numero; contador >= 0; contador--) {
            System.out.println(contador);
        }

        scanner.close();
    }
}