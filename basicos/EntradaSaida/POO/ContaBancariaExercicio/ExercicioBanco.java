package ContaBancariaExercicio;

public class ExercicioBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumeroConta(1234);
        p1.setDonoConta("Davi");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumeroConta(5678);
        p2.setDonoConta("Gabriel");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        
        p1.sacar(150);
        p1.fecharConta();

        p2.sacar(650);
        p2.fecharConta();

        p1.statusAtual();
        p2.statusAtual();
    }
}