import java.util.ArrayList;

public class EquipoVentas {
    private ArrayList<Vendedor> vendedores;

    public EquipoVentas() {
        vendedores = new ArrayList<>();
    }

    // Incluye el desafío: evita agregar dos vendedores con la misma identificación
    public boolean agregarVendedor(Vendedor vendedor) {
        if (vendedor == null || vendedor.getIdentificacion() == null) {
            return false;
        }
        if (buscarVendedor(vendedor.getIdentificacion()) != null) {
            return false;
        }
        vendedores.add(vendedor);
        return true;
    }

    public Vendedor buscarVendedor(String identificacion) {
        if (identificacion == null) {
            return null;
        }
        for (Vendedor v : vendedores) {
            if (v.getIdentificacion().equals(identificacion)) {
                return v;
            }
        }
        return null;
    }

    public boolean eliminarVendedor(String identificacion) {
        Vendedor encontrado = buscarVendedor(identificacion);
        if (encontrado != null) {
            return vendedores.remove(encontrado);
        }
        return false;
    }

    public double calcularVentasTotales() {
        double suma = 0.0;
        for (Vendedor v : vendedores) {
            suma += v.getVentasTotales();
        }
        return suma;
    }

    public Vendedor obtenerMayorVendedor() {
        if (vendedores.isEmpty()) {
            return null;
        }
        Vendedor mayor = vendedores.get(0);
        for (Vendedor v : vendedores) {
            if (v.getVentasTotales() > mayor.getVentasTotales()) {
                mayor = v;
            }
        }
        return mayor;
    }
}