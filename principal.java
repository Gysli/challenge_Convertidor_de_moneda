import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws IOException {


        double cantidadIngresadaUsuario = 0;
        double resultadoConversion = 0;
        int opcion = 0;


        String busqueda2 = "ARS";
        String busqueda1 = "USD";

        Scanner scanner = new Scanner(System.in);
        PrincipalAPI convertidor = new PrincipalAPI();

        String menu = """
                *****************************************
                Bienvenidos Al  Conversor de Monedas Alura
                ++++++++++++++++++++++++++++++++++++++++++
                                
                1 - Dólar =>>>> Peso Argentino
                2 - Peso Argentino =>>>> Dólar
                3 - Dólar =>>>> Real Brasileño
                4 - Real Brasileño =>>>>  Dólar
                5 - Dólar =>>>>  Peso Colombiano
                6 - Peso Colombiano =>>>> Dólar
                7 - Salir
                Elija una opción válida:
                                
                 ++++++++++++++++++++++++++++++++++++++++++
                """;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();


//ininio de menú de convesión de monedas


            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el valor a convertir: ");
                    Scanner teclado1 = new Scanner(System.in);
                    cantidadIngresadaUsuario = teclado1.nextDouble();
                    busqueda1 = "USD";
                    busqueda2 = "ARS";
                    String resultado = convertidor.PrincipalAPI(opcion, cantidadIngresadaUsuario);
                    System.out.println("El valor de:" + cantidadIngresadaUsuario + busqueda1 + "   A Pesos Argentinos es "  + busqueda2);
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++");
                    break;

                case 2:
                    System.out.println("Ingresa el valor a convertir: ");
                    Scanner teclado2 = new Scanner(System.in);
                    cantidadIngresadaUsuario = teclado2.nextDouble();
                    System.out.println("El valor de:" + cantidadIngresadaUsuario + "ARS" + "A Dólar es " + resultadoConversion + "USD");
                    break;

                case 3:
                    System.out.println("Ingresa el valor a convertir: ");
                    Scanner teclado3 = new Scanner(System.in);
                    cantidadIngresadaUsuario = teclado3.nextDouble();
                    System.out.println("El valor de:" + cantidadIngresadaUsuario + "USD" + "A Real Brasileño" + resultadoConversion + "BRL");
                    break;
                case 4:
                    System.out.println("Ingresa el valor a convertir: ");
                    Scanner teclado4 = new Scanner(System.in);
                    cantidadIngresadaUsuario = teclado4.nextDouble();
                    System.out.println("El valor de:" + cantidadIngresadaUsuario + "BRL" + "A Dólar" + resultadoConversion + "USD");
                    break;

                case 5:
                    System.out.println("Ingresa el valor a convertir: ");
                    Scanner teclado5 = new Scanner(System.in);
                    cantidadIngresadaUsuario = teclado5.nextDouble();
                    System.out.println("El valor de:" + cantidadIngresadaUsuario + "USD" + "A Peso Colombiano " + resultadoConversion + "COP");
                    break;

                case 6:
                    System.out.println("Ingresa el valor a convertir: ");
                    Scanner teclado6 = new Scanner(System.in);
                    cantidadIngresadaUsuario = teclado6.nextDouble();
                    System.out.println("El valor de:" + cantidadIngresadaUsuario + "COP" + "A Dolar" + resultadoConversion + "USD");
                    break;

                case 7:
                    System.out.println("Saliendo de la aplicación...");
                    System.out.println("Gracias por Utilizar Nuestros servicios, Feliz día!");
                    break;
            }
        }

        //fin de opcion menú de conversión de moneda
    }
}


