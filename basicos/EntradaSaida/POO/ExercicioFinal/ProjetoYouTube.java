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

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]); // Davi assiste Projeto Final em Java
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]); // Davi assiste Java POO
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());

        /*System.out.println("VÍDEOS\n---------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("PESSOAS\n---------------------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
     }
}
