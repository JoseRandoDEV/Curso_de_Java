public class Main {

    public static void main(String[] args) {

        int[] lista = new int[10]; //CREO UN ARREGLO DE 10 ELEMENTOS
        lista[0] = 10;
        lista[1] = 20;
        lista[2] = 40;
        //System.out.println("lista[0] = " + lista[0]);

        /*for (int i = 0; i < lista.length; i = i + 1)
        {
            System.out.println("lista = " + lista[i]);
        }*/
        /*for (int numero: lista)   //ASI MUESTRA LOS DATOS VALIDOS SOLAMANTE SIN LOS 0
        {
            if (numero !=0)
            {
                System.out.println("numero = " + numero);
            }else {
                break;
            }

        }*/

        /*String[] palabras = {"Jose","Laura","Milo","Gael","Nieve","Cloe"};
            for (String p: palabras)
            {
                System.out.println("p = " + p);
            }*/

        String nombre = "Jose";
        Integer numero = 20;

            if (numero instanceof Number)
            {
                System.out.println("Es un Number ");
            }else
                {
                System.out.println("No es un Number ");
                }
        //MISMO EJEMPLO CON OPERADORES TERNARIOS

            String mensaje = (numero instanceof Number)? "Es un Number " : "No es un Number ";
            System.out.println("mensaje = " + mensaje);

            mensaje = (numero == 22)? "El numero es igual 20" : "El numero es distinto de 20";
            System.out.println("mensaje = " + mensaje);
    }
}