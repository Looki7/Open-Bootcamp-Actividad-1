
// Actividad 1A

/* Crear una función con tres parámetros que sean números que se suman entre sí, llamar a la función en el main
y darle valores. */

public class Main {
    public static void main(String[] args) {

        suma (10,23,45);

    }

    public static void suma (int a, int b, int c) {

        int resultado;

        resultado=a+b+c;

        System.out.println(resultado);

    }

}


// Actividad 1B

/* Crear una clase coche incluyendo una variable numérica que almacene el número de puertas que tiene, una
función que incremente el número de puertas, crear un objeto miCoche en el main y añadirle una puerta y mostrar
el número de puertas que tiene el objeto. */

public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.AñadirPuertas();

        System.out.println(miCoche.puertas);
    }

static class Coche {
        public int puertas = 0;

        public void AñadirPuertas (){
            this.puertas++;

    }
    }


}