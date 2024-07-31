public class Primitivos {
    public static void main(String[] args) {
        /** Enteros */
        byte numero = 127;
        System.out.println("numero = " + numero); //Escribimos soutv y nos pone todo el renglon
        System.out.println("Cuantos BYTES tiene un Bite = " + Byte.BYTES);
        System.out.println("Cuantos BYTES tiene un Bites = " + Byte.SIZE);
        System.out.println("Maximo valor del tipo de Dato = " + Byte.MAX_VALUE);
        System.out.println("Minimo valor del tipo de Dato = " + Byte.MIN_VALUE);

        short numShort = 3000;
        System.out.println("numero = " + numShort);
        System.out.println("Cuantos SHORT tiene un Bite = " + Short.BYTES);
        System.out.println("Cuantos SHORT tiene un Bites = " + Short.SIZE);
        System.out.println("Maximo valor del tipo de Dato = " + Short.MAX_VALUE);
        System.out.println("Minimo valor del tipo de Dato = " + Short.MIN_VALUE);

        /** Coma Flotante */

        float numReal = 1.5e4f; // esto es igual que 15000
        float n = 0.00015f;  // 0.00015
        System.out.println("n = " + n);
        System.out.println("Numero Real = " + numReal);
        System.out.println("Cuantos FLOAT tiene un Bite = " + Float.BYTES);
        System.out.println("Cuantos FLOAT tiene un Bites = " + Float.SIZE);
        System.out.println("Maximo valor del tipo de Dato = " + Float.MAX_VALUE);
        System.out.println("Minimo valor del tipo de Dato = " + Float.MIN_VALUE);

        System.out.println("LONG valor del tipo de Dato = " + Long.MAX_VALUE);
        var numVar = 9223372036854775807F;
    }
}
