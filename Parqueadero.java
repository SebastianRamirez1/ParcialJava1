class Parqueadero {
    private Vehiculo[] celdas;
    private final int capacidad = 16;

    public Parqueadero() {
        celdas = new Vehiculo[capacidad];
    }

    public void registrarVehiculo(String placa, String propietario, int cilindraje, String modelo) {
        for (int i = 0; i < capacidad; i++) {
            if (celdas[i] == null) {
                celdas[i] = new Vehiculo(placa, propietario, cilindraje, modelo);
                System.out.println("Vehículo registrado en la celda " + (i + 1));
                return;
            }
        }
        System.out.println("No hay celdas disponibles.");
    }

    public void retirarVehiculo(String placa) {
        for (int i = 0; i < capacidad; i++) {
            if (celdas[i] != null && celdas[i].getPlaca().equals(placa)) {
                celdas[i] = null;
                System.out.println("Vehículo con placa " + placa + " retirado de la celda " + (i + 1));
                return;
            }
        }
        System.out.println("Vehículo no encontrado.");
    }

    public void mostrarCeldas() {
        for (int i = 0; i < capacidad; i++) {
            if (celdas[i] == null) {
                System.out.println("Celda " + (i + 1) + " está disponible.");
            } else {
                System.out.println("Celda " + (i + 1) + " ocupada por: " + celdas[i]);
            }
        }
    }
}