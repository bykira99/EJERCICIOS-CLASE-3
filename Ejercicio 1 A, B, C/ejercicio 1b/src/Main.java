import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] respuesta = new String[4];
        System.out.println("Ingrese 3 números enteros de a uno\n" +
                "y por último ingrese 'a' si desea ordenar\n" +
                "los números en orden ascendente o 'b'\n" +
                "si lo dese en orden descendente");
        for (int i = 0; i < respuesta.length; i++) {
            respuesta[i] = tipeoString();
        }
        switch (respuesta[respuesta.length - 1].toLowerCase()) {
            case "a":
                ordenAscendente(respuesta);
                break;
            case "b":
                ordenDescendente(respuesta);
                break;
            default:
                System.out.println("Hubo un error");
                break;
        }
    }

    private static String tipeoString() {
        Scanner tipeoTeclado = new Scanner(System.in);
        String linea = tipeoTeclado.next();
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
