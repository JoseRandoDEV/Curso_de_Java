package Net.Youstic.Herencias;

public class Estudiante extends Persona {

    private Double promedio;

    public Estudiante(String nombre, String apellido, Double promedio) {
        super(nombre, apellido);
        this.promedio = promedio;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "promedio=" + promedio +
                '}';
    }
}
