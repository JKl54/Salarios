package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Calcular Salario");
            System.out.println("2. Pagar Nómina");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularSalario();
                    break;
                case 2:
                    pagarNomina();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 3);

        scanner.close();
    }

    public static void calcularSalario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        double horas = scanner.nextDouble();
        System.out.print("Tarifa por hora: ");
        double tarifa = scanner.nextDouble();
        double salario = horas * tarifa;
        System.out.println("Salario calculado: $" + salario);
    }

    public static void pagarNomina() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Salario a pagar: $");
        double salario = scanner.nextDouble();
        double deduccion = salario * 0.08;
        double salarioNeto = salario - deduccion;
        System.out.println("Pago de nómina a " + nombre);
        System.out.println("Salario neto: $" + salarioNeto);

        return;
    }
}
