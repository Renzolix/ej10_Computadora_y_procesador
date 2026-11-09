public class Computadora {
    private String marca;
    private int ramGB;
    private Procesador cpu; // Atributo de referencia a objeto

    public Computadora(String marca, int ramGB, Procesador cpu) {
        this.marca = marca;
        this.ramGB = ramGB;
        this.cpu = cpu;
    }

    public void mostrarEspecificaciones() {
        System.out.println("=== Especificaciones del Equipo ===");
        System.out.println("Marca del Equipo: " + marca);
        System.out.println("Memoria RAM: " + ramGB + " GB");
        
        if (cpu != null) {
            // Delegación de impresión al método toString() del objeto cpu
            System.out.println("Procesador Instalado: " + cpu.toString());
        } else {
            System.out.println("Procesador Instalado: Sin CPU");
        }
        System.out.println("===================================");
    }

    public static void main(String[] args) {
        Procesador i7 = new Procesador("Intel", "Core i7-13700K", 5.4);
        Computadora pc = new Computadora("ASUS ROG", 32, i7);

        pc.mostrarEspecificaciones();
    }
}