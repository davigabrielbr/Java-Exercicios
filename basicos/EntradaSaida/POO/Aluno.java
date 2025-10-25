

public class Aluno {
    private String nome;
    private String curso;
    private int matricula;
    private double nota;

    void verificarAprovacao() {
        if (this.getNota() >= 7) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }

    void mostrarInfo() {
        System.out.println("Nome:" + this.getNome());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Nota: " + this.getNota());
    }

    public Aluno(String nome, String curso, int matricula, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}