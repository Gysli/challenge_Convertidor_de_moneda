import java.io.IOException;
import java.util.Scanner;

public class MenuPrinciapal {

    public static void main(String[] args) throws InterruptedException, IOException {
        int opcion=0;
        double CantidadIngresadaUsuaio;
        double resultadoCambio;
        ConversorApi consultaTasa  = new ConversorApi();

        String menu = """
                ++++++++++++++++++++++++++++++++++++++++++
                BIENVENIDO AL CONVERTIDOR DE MONEDAS ALURA
                ++++++++++++++++++++++++++++++++++++++++++
                1) Dólar a Pesos Argentinos
                2) Peso Argentino a Dolar
                3) Dólar a Real Brasileño
                4) Real Brasileño a Dolar
                5) Dolar a peso Colombiano
                6) Peso Colombiano a Dolar
                7) Salir
                ++++++++++++++++++++++++++++++++++++++++++
                ++++++++++++++++++++++++++++++++++++++++++
                """;



        Scanner teclado = new Scanner(System.in);

        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

//Fin de la segunda parte montando el menú de oppression

            System.out.println("Favor Digitar el Valor a Convertir");
            Scanner teclado1 = new Scanner(System.in);
            CantidadIngresadaUsuaio = teclado1.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Convirtiendo de Dólares a Pesos Argentinos...");
                    consultaTasa.tasadeCambio(moneda.USD, moneda.ARS, CantidadIngresadaUsuaio);
                    break;
                case 2:
                    System.out.println("Convirtiendo de Pesos Argentinos a Pesos Dólares...");
                    consultaTasa.tasadeCambio(moneda.ARS, moneda.USD, CantidadIngresadaUsuaio);
                    break;
                case 3:
                    System.out.println("Convirtiendo de Dólares a Reales Brasileños...");
                    consultaTasa.tasadeCambio(moneda.USD, moneda.BRL, CantidadIngresadaUsuaio);
                    break;
                case 4:
                    System.out.println("Convirtiendo Reales Brasileños a Dólares...");
                    consultaTasa.tasadeCambio(moneda.BRL, moneda.USD, CantidadIngresadaUsuaio);
                    break;
                case 5:
                    System.out.println("Convirtiendo  Dólares a Pesos Colombianos...");
                    consultaTasa.tasadeCambio(moneda.USD, moneda.COP, CantidadIngresadaUsuaio);
                    break;
                case 6:
                    System.out.println("Convirtiendo Pesos Colombianos a Dólares...");
                    consultaTasa.tasadeCambio(moneda.COP, moneda.USD, CantidadIngresadaUsuaio);
                    break;
                case 7:
                    System.out.println("Finalizando el programa");
                    System.out.println("Feliz  día!");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

        //Fin de la tercera parte implementando los cálculos
    }
}






