package basico;

public class Nombre {
    public static void main(String[] args) {
        // Crear una mascota
        Mascota miMascota = new Mascota("Fido", 5, "Perro");

        // Crear una persona con la mascota creada anteriormente
        Persona yo = new Persona("Juan", 30, miMascota);

        // Utilizar el getter para obtener el nombre de la mascota
        String nombreMascota = yo.getMascota().getNombre();
        System.out.println("El nombre de mi mascota es: " + nombreMascota);

        // Utilizar el setter para cambiar el nombre de la mascota
        yo.getMascota().setNombre("Scooby");
        System.out.println("El nuevo nombre de mi mascota es: " + yo.getMascota().getNombre());
    }
}