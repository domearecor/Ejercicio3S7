public class MainVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("V01", "Carla Mendoza", 15400.0);
        Vendedor v2 = new Vendedor("V02", "Jorge Salazar", 22800.0);
        Vendedor v3 = new Vendedor("V03", "Lucía Vera", 18900.0);
        Vendedor v4 = new Vendedor("V04", "Andrés Ríos", 11200.0);
        Vendedor v5 = new Vendedor("V05", "Paola Guamán", 25600.0);

        EquipoVentas equipo = new EquipoVentas();
        System.out.println("Agregado v1: " + equipo.agregarVendedor(v1));
        System.out.println("Agregado v2: " + equipo.agregarVendedor(v2));
        System.out.println("Agregado v3: " + equipo.agregarVendedor(v3));
        System.out.println("Agregado v4: " + equipo.agregarVendedor(v4));
        System.out.println("Agregado v5: " + equipo.agregarVendedor(v5));

        // Desafío: intentar agregar ID duplicado
        Vendedor duplicado = new Vendedor("V02", "Duplicado", 5000.0);
        System.out.println("Intento duplicar V02: " + equipo.agregarVendedor(duplicado));

        System.out.println("\n--- Pruebas mínimas ND-L2 ---");
        Vendedor buscado = equipo.buscarVendedor("V03");
        System.out.println("Buscar V03: " + (buscado != null ? buscado.mostrarInformacion() : "No encontrado"));

        Vendedor noExiste = equipo.buscarVendedor("V99");
        System.out.println("Buscar V99: " + (noExiste != null ? noExiste.mostrarInformacion() : "No encontrado"));

        System.out.println("Ventas totales del equipo: $" + equipo.calcularVentasTotales());

        Vendedor mayor = equipo.obtenerMayorVendedor();
        System.out.println("Mayor vendedor: " + (mayor != null ? mayor.mostrarInformacion() : "Sin vendedores"));

        System.out.println("\n--- Eliminar vendedor V04 ---");
        System.out.println("Eliminado V04: " + equipo.eliminarVendedor("V04"));
        System.out.println("Ventas totales tras eliminar V04: $" + equipo.calcularVentasTotales());
        System.out.println("Objeto v4 sigue existiendo fuera: " + v4.mostrarInformacion());
    }
}