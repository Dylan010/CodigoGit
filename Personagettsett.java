package basico;

// ejemplo de como se usan los getter y settser y para que sirver 
public class Personagettsett {
    private String nombre;
    private int edad;

    public Personagettsett(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {
        Personagettsett persona = new Personagettsett("Juan", 25);
        System.out.println("Nombre: " + persona.getNombre());   // el getter es para mostrar 
        System.out.println("Edad: " + persona.getEdad());

        persona.setNombre("Pedro");  // el setter es para cambiarlo en caso de que debas cambiarlo
        persona.setEdad(30);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}