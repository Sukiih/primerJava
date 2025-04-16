import java.util.Scanner;

public class desafioBancario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = "Pedro Pascal";
        String tipoCuenta = "Corriente";
        double saldo = 2589.36;

        System.out.println("\nBienvenido " + nombre);
        System.out.println("Su cuenta: " + tipoCuenta);
        System.out.println("Su saldo actual es: $" + saldo + "\n");

        String menu = """
                Ingrese su opción:
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        int opcion = 0;
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            if (opcion == 1) {
                mostrarSaldo(saldo);
            } else if (opcion == 2) {
                saldo = retirar(saldo, teclado);
            } else if (opcion == 3) {
                saldo = depositar(saldo, teclado);
            } else if (opcion == 9) {
                System.out.println("Gracias por usar nuestro sistema. ¡Hasta luego!");
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        teclado.close();
    }

    public static void mostrarSaldo(double saldo) {
        System.out.println("Su saldo actual es: $" + saldo);
    }

    public static double retirar(double saldo, Scanner teclado) {
        System.out.println("Ingrese el monto que desea retirar:");
        double monto = teclado.nextDouble();

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
        } else if (monto > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("El saldo actualizado es: $" + saldo);
        }

        return saldo;
    }

    public static double depositar(double saldo, Scanner teclado) {
        System.out.println("Ingrese el monto que desea depositar:");
        double monto = teclado.nextDouble();

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
        } else {
            saldo += monto;
            System.out.println("El saldo actualizado es: $" + saldo);
        }

        return saldo;
    }
}
