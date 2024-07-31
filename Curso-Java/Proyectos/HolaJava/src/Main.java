public class Main {
    public static void main(String[] args) {
        String mensaje = "Hola";
        Main m = new Main();
        m.Saludar(mensaje.toUpperCase()); // El hola se imprime en mayusculas

        int numero = 10;
        Integer numero2 = 12;
        System.out.println("El numero de referencia es: " + numero2 + "\n" + "El numero es: " + numero);
        // el \n es el salto de linea

        var nombre = "Jose";
        System.out.println(nombre);

    }

    public void Saludar(String mensaje) {
        System.out.println(mensaje);
    }
}
