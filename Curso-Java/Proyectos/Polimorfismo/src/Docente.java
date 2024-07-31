public class Docente extends Persona {

    private Integer canHorasClase;

    public Docente(String nomYape, Integer dni, Integer canHorasClase) {
        super(nomYape, dni);
        this.canHorasClase = canHorasClase;
    }

    public Integer getCanHorasClase() {
        return canHorasClase;
    }

    public void setCanHorasClase(Integer canHorasClase) {
        this.canHorasClase = canHorasClase;
    }

    @Override
    public String toString() {
        return "Docente: " +
                "Cantidad de Horas Clase: " + canHorasClase +
                "\n" + super.toString();
    }
}
