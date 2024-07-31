package Net.Youstic.Herencias;

public class Docente extends Persona{

    private Integer horasDocente;

    public Docente(String nombre, String apellido, Integer horasDocente) {
        super(nombre, apellido);
        this.horasDocente = horasDocente;
    }

    public Integer getHorasDocente() {
        return horasDocente;
    }

    public void setHorasDocente(Integer horasDocente) {
        this.horasDocente = horasDocente;
    }

    @Override
    public String toString() {
        return "Docente: " +
                "Horas docente= " + horasDocente + "\n" +
                super.toString();
    }
}
