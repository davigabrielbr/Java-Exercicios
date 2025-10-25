package Celular;

public class ExercicioCelular {
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.setMarca("Apple");
        c1.setModelo("Iphone 12 pro max");
        
        System.out.println(c1.getMarca());
        System.out.println(c1.getModelo());
    }
}