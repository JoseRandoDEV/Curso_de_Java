import net.youtic.modelo.Automovil;

public class Main {         //CLASE MAIN

    public static void main(String[] args) {      //METODO DE LA CLASE MAIN

        Automovil automovil = new Automovil("Jose Rando");
        automovil.setCilindrada(300000);
        automovil.setColor("Rojo");
        automovil.setTanque(50);

        //System.out.println(automovil.getPersona()); //get retorna el valor de la propiedad

        System.out.println(automovil.toString());

        Automovil automovil2 = new Automovil("Amarillo",68,"Milo Rando",15000);
        //automovil2.toString();
        System.out.println("automovil2 = " + automovil2.toString());

    }
}