public class Dispositivo {

    protected String marca;
    protected String modelo;
    protected double precioBase;

    public Dispositivo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio base: $" + precioBase);
    }
}
