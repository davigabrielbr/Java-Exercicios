package Herançaa;

public class App {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Davi");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Gabriel");
        a1.setIdade(21);
        a1.setSexo("M");
        a1.setCurso("Análise e Desenvolvimento de Sistemas");
        a1.setMatricula(123456789);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Mago");
        b1.setIdade(21);
        b1.setSexo("M");
        b1.setMatricula(987654321);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setEspecialidade("Tecnologia");
        p1.setSalario(2.500f);
        p1.receberAumento();

        Tecnico t1 = new Tecnico();
        t1.setRegistroProfissional("Técnico em Tecnologia");
        t1.praticar();
    }
}