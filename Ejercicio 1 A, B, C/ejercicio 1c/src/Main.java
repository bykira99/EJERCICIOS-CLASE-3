import java.util.Scanner;

public class Main {

    private static String[] vector = new String[4];

    public static void main(String[] args) {
        while (true) { // a fin de optimizar las pruebas del código lo dejo dentro de un while(true)
            System.out.println("Ingrese 3 números enteros seguidos\n" +
                    "y por último ingrese 'a' si desea ordenar\n" +
                    "los números en orden ascendente o nada\n" +
                    "si lo desea en orden descendente, luego presione enter");

            vector = stringAVector(tipeoString()); // PARA QUE EL CÓDIGO FUNCIONES, LOS NÚMEROS DEBEN
                                                    // SER INGRESADOS SEGUIDOS, NO SEPARADOS CON UN ENTER

            if (vector[vector.length - 1].toLowerCase().equals("a")) {
                ordenAscendente(vector);
            } else {
                ordenDescendente(vector);
            }
        }
    }

    private static String[] stringAVector(String textoIngresado) {
        int c = 0;
        for (String aux : textoIngresado.split(" ")) {
            vector[c] = aux;
            c++;
        }
        if (c == 3) {
            vector[3] = "0";
        }
        return vector;
    }

    private static String tipeoString() {
        Scanner tipeoTeclado = new Scanner(System.in);
        String linea = tipeoTeclado.nextLine();
        return linea;
    }

    private static void ordenAscendente(String[] respuesta) {
        for (int i = 0; i < respuesta.length - 1; i++) {
            System.out.println(respuesta[i]);
        }
    }

    private static void ordenDescendente(String[] respuesta) {
        for (int i = respuesta.length - 2; i >= 0; i--) {
            System.out.println(respuesta[i]);
        }
    }
}
