public class Main {

    public static void main(String[] args) {

        Smartphone celular = new Smartphone(
                "Samsung", "Galaxy S24", 1200000, 50, 256
        );

        Laptop computadora = new Laptop(
                "Lenovo", "IdeaPad 3", 950000, "Intel Core i5", 16
        );

        celular.mostrarInformacion();

        System.out.println();

        computadora.mostrarInformacion();
    }
}
