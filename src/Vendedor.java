public class Vendedor {
    private String identificacion;
    private String nombre;
    private double ventasTotales;

    public Vendedor(String identificacion, String nombre, double ventasTotales) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.ventasTotales = ventasTotales;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVentasTotales() {
        return ventasTotales;
    }

    public String mostrarInformacion() {
        return nombre + " (ID: " + identificacion + ") | Ventas: $" + ventasTotales;
    }
}
