import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();
        int opcion;

        do {
            System.out.println("\n1. Registrar vehículo");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Mostrar celdas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese propietario: ");
                    String propietario = scanner.nextLine();
                    System.out.print("Ingrese cilindraje: ");
                    int cilindraje = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese modelo: ");
                    String modelo = scanner.nextLine();
                    parqueadero.registrarVehiculo(placa, propietario, cilindraje, modelo);
                    break;
                case 2:
                    System.out.print("Ingrese placa del vehículo a retirar: ");
                    String placaRetiro = scanner.nextLine();
                    parqueadero.retirarVehiculo(placaRetiro);
                    break;
                case 3:
                    parqueadero.mostrarCeldas();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
}

