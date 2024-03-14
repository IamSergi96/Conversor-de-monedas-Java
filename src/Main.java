import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();
        System.out.println("Introduce el tipo de moneda a que quieres convertir (dólares, libras, yenes)");
        String monedaFinal = scanner.next();
        if (monedaFinal.toLowerCase().equals("dólares")) {
            double dolares = euros * 1.11;
            System.out.printf("%.2f corresponden a %.2f dólares", euros, dolares);
        } else if (monedaFinal.toLowerCase().equals("libras")) {
            double libras = euros * 0.87;
            System.out.printf("%.2f corresponden a %.2f libras", euros, libras);
        } else if (monedaFinal.toLowerCase().equals("yenes")) {
            double yenes = euros * 156.47;
            System.out.printf("%.2f corresponden a %.2f yenes", euros, yenes);
        } else {
            System.out.printf("Opción incorrecta %s no es una moneda válida", monedaFinal);
        }
    }
}