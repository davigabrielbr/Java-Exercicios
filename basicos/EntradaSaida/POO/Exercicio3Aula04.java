package POO;

public class Exercicio3Aula04 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Davi", "Análise e Desenvolvimento de Sistemas", 1354637443, 7.7);
        System.out.println("-------------------------");
        System.out.println("ALUNO 1");
        a1.mostrarInfo();
        a1.verificarAprovacao();
        
        Aluno a2 = new Aluno("Gabriel", "Medicina", 1523542343, 6.5);
        System.out.println("-------------------------");
        System.out.println("ALUNO 2");
        a2.mostrarInfo();
        a2.verificarAprovacao();
    }
}