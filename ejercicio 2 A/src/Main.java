import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    //para que el código funciones se debe poner como primer parámetro el número "1" para el método suma
    //o "2" para el método de producto, seguido debe estar especificada la ruta del archivo .txt
    //

    static Integer valorReal;

    public static void main(String[] args) throws IOException {
        String respuesta = "";

        switch (args[0]) {
            case "1":
                System.out.println("La suma es: " + metodoSuma(args[1]));
                break;
            case "2":
                System.out.println("El producto es: " + metodoProducto(args[1]));
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }

    private static String metodoTipeoString() {
        String texto = "";
        Scanner tipeo = new Scanner(System.in);
        texto = tipeo.next();
        return texto;
    }

    private static String capturaArchivo(String archivo) throws IOException {
        String texto = "";
        for (String linea : Files.readAllLines(Paths.get(archivo))) {
            texto += linea;
        }
        return texto;
    }

    private static Integer metodoSuma(String archivo) throws IOException {
        valorReal = 0;
        for (String numero : capturaArchivo(archivo).split(" ")) {
            valorReal += Integer.parseInt(numero);
        }
        return valorReal;
    }

    private static Integer metodoProducto(String archivo) throws IOException {
        valorReal = 1;
        for (String numero : capturaArchivo(archivo).split(" ")) {
            valorReal *= Integer.parseInt(numero);
        }
        return valorReal;
    }

}