public class Gato extends Animal {
    
    private int num_vidas;

    public Gato() {
    }

    public Gato(String nombre, String raza, String tipo_alimento, int edad, int num_vidas) {
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }

    public int getNum_vidas() {
        return num_vidas;
    }

    public void setNum_vidas(int num_vidas) {
        this.num_vidas = num_vidas;
    }

    public void mostrarGato(){
        System.out.println("El nombre del michi es: " + getNombre());
        System.out.println("La raza del michi es: " + getRaza());
        System.out.println("El tipo de alimento del michi es: " + getTipo_alimento());
        System.out.println("La edad del michi es: " + getEdad());
        System.out.println("El numero de vidas que le quedan al michi son: " + getNum_vidas());
    }
}
