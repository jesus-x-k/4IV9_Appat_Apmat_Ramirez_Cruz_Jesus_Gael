public class Estudiante extends Persona {
    private int numboleta;

    public Estudiante(int numboleta, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.numboleta = numboleta;

} 
    
    public Estudiante(int numboleta, String chillon,String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.numboleta = numboleta;
        
    }

    public int getNumboleta() {
        return numboleta;
    }

    public void setNumboleta(int numboleta) {
        this.numboleta = numboleta;
    }


}