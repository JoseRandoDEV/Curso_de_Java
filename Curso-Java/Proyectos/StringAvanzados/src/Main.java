public class Main {
    public static void main(String[] args){

        /*String nombre = "Jose";
        String nombre2 = new String("Jose");

        boolean comparar = nombre2 == nombre;
        System.out.println("La Comparación es = " + comparar);

        comparar = nombre.equals(nombre2);
        System.out.println("La Comparación es = " + comparar); //COMPARA LINEA DE CARACTERES NO VARIABLES

        String nombre3 = "Jose";
        comparar = nombre == nombre3;
        System.out.println("La Comparación es = " + comparar);*/

        String curso = "Java 2024 - String";  //EJEMPLO DE CONCATENAR (UNIR)
        String docente = "Gabriel Chaldu";

        String mensaje = curso + " con " + docente;
        System.out.println("mensaje = " + mensaje);

        int num = 2;
        int num2 = 20;
        System.out.println("La Suma es = " + num + num2); //CONCATENA NO SUMA
        System.out.println("La Suma es = " + (num + num2)); //ASI LO SUMA
        System.out.println(num + num2 + " seria la suma de los dos números..") ; //ASI LO SUMA DE ATRAS HACIA ADELANTE

        String mensaje3 = curso.concat(" ")
                                .concat(docente);
        System.out.println("mensaje3 = " + mensaje3); //CONCATENANDO EL MENSAJE

        curso.concat(docente);
        System.out.println("curso = " + curso); //CONCAT ES INMUTABLE
    }
}