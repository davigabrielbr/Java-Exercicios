package ExercicioFinal;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 14 Projeto Final em Java");
        v[1] = new Video("Aula 1 Java POO");
        v[2] = new Video("Aula 5 POO Java");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Davi", 21, "M", "davi86154");
        g[1] = new Gafanhoto("Adrielly", 24, "F", "drika");

        System.out.println(g[0].toString());
        System.out.println(v[0].toString());
     }
}
