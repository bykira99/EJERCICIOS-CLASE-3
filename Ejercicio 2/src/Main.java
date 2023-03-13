import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    //LA RUTA DEBE ESTAR ESPECIFICADA DENTRO DE LOS PARÁMETROS DE String[] args

    public static void main(String[] args) throws IOException {

        String texto = "";
        Integer valorReal = 0;


        for (String linea : Files.readAllLines(Paths.get(args[0]))) {
            texto += linea;
        }

        for (String numero : texto.split(" ")) {
            valorReal += Integer.parseInt(numero);
        }
        System.out.println(valorReal);

    }
}