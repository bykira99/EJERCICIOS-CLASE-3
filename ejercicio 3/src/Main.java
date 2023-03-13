import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    //EL CÓDIGO SIEMPRE VA A RETORNAR EL TEXTO EN MINÚSCULAS PARA EVITAR ERRORES AL LEERLO
    //EN EL PRIMER PARÁMETRO INGRESAR LA OPCIÓN DESEADA Y EN EL SEGUNDO PARÁMETRO EL DESPLAZAMIENTO DESEADO

    //PARA QUE EL CÓDGIO FUNCIONE SE DEBE INTRODUCIR POR PARÁMETRO EN EL PRIMER ESPACIO LA OPCIÓN QUE DESEA UTILIZAR
    //"1" PARA ENCRIPTAR Y "2" PARA DESENCRIPTAR, SEGUIDO EL NÚMERO DE DESPLAZAMIENTO DESEADO, SEGUIDO LA RUTA DEL
    //ARCHIVO DE ENTRADA O ARCHIVO DE LECTURA, SEGUIDO Y POR ÚLTIMO LA RUTA DEL ARCHIVO DE SALIDA O ESCRITURA
    private static String abc = "abcdefghijklmnopqrstuvwxyz ";

    public static void main(String[] args) throws IOException {
        switch (args[0]) {
            case "1": {
                escrituraArchivo(args[3], encriptar(capturaArchivo(args[2]).toLowerCase(), Integer.parseInt(args[1])));
                System.out.println("El archivo fue encriptado con éxito");
                break;
            }
            case "2": {
                escrituraArchivo(args[3], desencriptar(capturaArchivo(args[2]).toLowerCase(), Integer.parseInt(args[1])));
                System.out.println("El archivo fue desencriptado con éxito");
                break;
            }
            default:
                System.out.println("Opción incorrecta\n");
        }
    }

    private static String capturaArchivo(String archivoParaLeer) throws IOException {
        String texto = "";
        for (String linea : Files.readAllLines(Paths.get(archivoParaLeer))) {
            texto += linea + '\n';
        }
        return texto;
    }

    private static void escrituraArchivo(String archivoParaEscribir, String texto) throws IOException {
        Files.writeString(Paths.get(archivoParaEscribir), texto);
    }

    public static String encriptar(String texto, Integer desplazamiento) {
        String nuevoTexto = "";
        for (int recorridoTexto = 0; recorridoTexto < texto.length(); recorridoTexto++) {
            for (int recorridoAbecedario = 0; recorridoAbecedario < abc.length(); recorridoAbecedario++) {
                if (texto.charAt(recorridoTexto) == abc.charAt(recorridoAbecedario)) {
                    if (recorridoAbecedario + desplazamiento >= abc.length()) {
                        nuevoTexto += abc.charAt(recorridoAbecedario + desplazamiento - abc.length());
                    } else {
                        nuevoTexto += abc.charAt(recorridoAbecedario + desplazamiento);
                    }
                }
            }
        }
        return nuevoTexto;
    }

    public static String desencriptar(String texto, Integer desplazamiento) {
        String nuevoTexto = "";
        for (int recorridoTexto = 0; recorridoTexto < texto.length(); recorridoTexto++) {
            for (int recorridoAbecedario = 0; recorridoAbecedario < abc.length(); recorridoAbecedario++) {
                if (texto.charAt(recorridoTexto) == abc.charAt(recorridoAbecedario)) {
                    if (recorridoAbecedario - desplazamiento < 0) {
                        nuevoTexto += abc.charAt(recorridoAbecedario - desplazamiento + abc.length());
                    } else {
                        nuevoTexto += abc.charAt(recorridoAbecedario - desplazamiento);
                    }
                }
            }
        }
        return nuevoTexto;
    }
}