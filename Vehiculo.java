import java.util.Scanner;

class Vehiculo {
    private String placa;
    private String propietario;
    private int cilindraje;
    private String modelo;
    private boolean disponible;

    public Vehiculo(String placa, String propietario, int cilindraje, String modelo) {
        this.placa = placa;
        this.propietario = propietario;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
        this.disponible = false;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Propietario: " + propietario + ", Cilindraje: " + cilindraje + ", Modelo: " + modelo;
    }
}