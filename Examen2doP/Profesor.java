public class Profesor extends Persona {
    private String rfc;

    public Profesor(String rfc, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
}