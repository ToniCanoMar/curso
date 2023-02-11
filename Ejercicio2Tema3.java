public class Coche {
    private int numPuertas;
    
    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    public void aumentarNumPuertas() {
        this.numPuertas++;
    }
    
    public int getNumPuertas() {
        return this.numPuertas;
    }
}

public static void main(String[] args) {
    Coche miCoche = new Coche(4);
    miCoche.aumentarNumPuertas();
    System.out.println("El número de puertas de mi coche es: " + miCoche.getNumPuertas());
}
