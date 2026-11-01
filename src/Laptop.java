public class Laptop extends Dispositivo {

    private String procesador;
    private int memoriaRAM;

    public Laptop(String marca, String modelo, double precioBase,
                  String procesador, int memoriaRAM) {

        super(marca, modelo, precioBase);

        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("=== FICHA TÉCNICA LAPTOP ===");

        super.mostrarInformacion();

        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
    }
}
