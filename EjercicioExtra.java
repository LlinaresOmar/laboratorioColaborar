import java.util.Scanner;

public class EjercicioExtra {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int numero1, numero2;

        System.out.println("Modificación de Isaac prueba de git con IntelliJ");
        System.out.println("Introduce un número");
        numero1 = validaInt();
        do{
            System.out.println("Introduce el segundo numero, debe ser mayor que el primero:");
            numero2 = validaInt();
        } while (numero2 <= numero1);

            System.out.print("[");

            for (int i = numero1; i <= numero2; i++) {
                System.out.print(i);
                if (i < numero2) {
                    System.out.print(", ");
                }
            }
            
            System.out.println("]");
    }
    public static int validaInt() {
        while (!sc.hasNextInt()) {
            System.out.println("Eso no es un número!:");
            sc.next();
        }
        return sc.nextInt();
    }
}