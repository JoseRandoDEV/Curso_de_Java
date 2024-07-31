public class Main {
    public static void main(String[] args) {

        String numberstr = "50";
        String numberstr2 = "10";
        String realstr = "50.25";

        int num = Integer.parseInt(numberstr);
        int num2 = Integer.parseInt(numberstr2);
        int res = num + num2;
        double real = Double.parseDouble(realstr);


        System.out.println("numerstr = " + numberstr + numberstr2);
        System.out.println("La Suma es: = " + num + num2);
        System.out.println("La Suma de los dos numeros es: = " + res);
        System.out.println("El numero Real es: = " + real);

        Integer numeroInteger = 110;
        String StrNumero = Integer.toString(numeroInteger);
        System.out.println("StrNumero = " + StrNumero);

        String caracter = "A";
        char c = caracter.charAt(0);
        System.out.println("c = " + c);

        int i = 200;
        short s = (short) i;
        System.out.println("s = " + s);
        System.out.println("Numero Minimo Usando SHORT = " + Short.MIN_VALUE);
        System.out.println("Numero Maximo Usando SHORT = " + Short.MAX_VALUE);
    }
}