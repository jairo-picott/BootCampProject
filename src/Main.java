public class Main {
    public static void main(String[] args) {
        suma(5, 6, 8);
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int d = a+b+c;
        System.out.println("El resultado es " + d);
    }
}

class Coche {
    public int puertas = 0;

    public void agregarPuerta() {
        this.puertas++;
    }

}
