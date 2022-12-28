public class Main {
    public static void main(String[] args) {
        suma(5, 6, 8);
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("Numero de puertas del miCoche" + miCoche.puertas);
        EjercicioTema4 resultado = new EjercicioTema4();
        resultado.usandoIf(5);
        resultado.bucleWhile(0);
        resultado.doWhile(0 );
        resultado.bucleFor(0);
        resultado.CasoSwitch("verano");
    }

    public static void suma(int a, int b, int c) {
        int d = a+b+c;
        System.out.println("El resultado es SUMA " + d);
    }
}

class Coche {
    public int puertas = 0;

    public void agregarPuerta() {
        this.puertas++;
    }
}

class EjercicioTema4 {
    public void usandoIf(int a) {
        int numerolf = a;

        if (a>0) {
            System.out.println("Numerolf es positivo");
        } else if (a<0) {
            System.out.println("Numerolf es negativo");
        } else {
            System.out.println("Numerolf es igual a 0");
        }
    }

    public void bucleWhile(int numeroWhile) {
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Bucle While output:" + numeroWhile);
        }
    }

    public void doWhile(int numeroWhile) {
        do{
            numeroWhile++;
        }while(numeroWhile < 3);
        System.out.println("Bucle Do While output" + numeroWhile);
    }

    public void bucleFor(int numeroFor) {
        for (int i=numeroFor;i<=3;i++) {
            System.out.println("Bluce For output: " + i);
        }
    }

    public void CasoSwitch(String estacion) {
        switch (estacion){
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "otono":
                System.out.println("La estacion es otono");
                break;
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            default:
                System.out.println("Por favor ingrese una estacion valida");
                break;
        }
    }
}
