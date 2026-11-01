public class Smartphone extends Dispositivo {

    private int megapixelesCamara;
    private int almacenamiento;

    public Smartphone(String marca, String modelo, double precioBase,
                      int megapixelesCamara, int almacenamiento) {

        super(marca, modelo, precioBase);

        this.megapixelesCamara = megapixelesCamara;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("=== FICHA TÉCNICA SMARTPHONE ===");

        super.mostrarInformacion();

        System.out.println("Cámara: " + megapixelesCamara + " MP");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
    }
}
