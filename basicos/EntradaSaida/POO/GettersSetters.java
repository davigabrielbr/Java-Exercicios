package POO;

public class GettersSetters {
    public static void main(String[] args) {
        CanetaGettersSetters c1 = new CanetaGettersSetters("BIC", 0.5f, "Preto");
        
        System.out.println("Modelo: " + c1.getModelo() + " de ponta " + c1.getPonta() + " com a cor " + c1.getCor());
    }
}
