public class Main {
    public static void main(String[] args) {
        //PARA MOSTRAR LOS NÚMEROS EN ORDEN ASCENDENTE EL 4TO ESPACIO DE STRING[] ARGS DEBE SER A
        //PARA MOSTRAR LOS NÚMEROS EN ORDEN DESCENDENTE EL 4TO ESPACIO DE STRING[] ARGS DEBE SER B

        switch (args[3]) {

            case "a":
                for (int i = 0; i < args.length - 1; i++) {
                    System.out.println(args[i]);
                }
                break;
            case "b":
                for (int i = args.length - 2; i >= 0; i--) {
                    System.out.println(args[i]);
                }
                break;
            default:
            System.out.println("Caracter mal ingresado");
            break;
        }


    }
}