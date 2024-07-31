public class Estudiante extends Persona {

    private Integer numeroLegajo;

    public Estudiante(String nomYape, Integer dni, Integer numeroLegajo) {
        super(nomYape, dni);
        this.numeroLegajo = numeroLegajo;
    }

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    @Override
    public String toString() {
        return "Estudiante: " +
                "Numero de Legajo: " + numeroLegajo +
                "\n" + super.toString();
    }
}
