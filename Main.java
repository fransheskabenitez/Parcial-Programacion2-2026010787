public class Main {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor(
                "Fransheska",
                1000.0,
                new ComisionPersonalizada()
        );

        vendedor.mostrarDetalle();
    }
}