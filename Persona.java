package basico;
//aqui creamos a persona que sera el duenio de la mascota tiene un objeto(vacio) llamado  mascota como atributo que llama al metodo de get info de la clase Mascota 
//Clase Persona
public class Persona {
 // Atributos
 private String nombre;
 private int edad;
 private Mascota mascota;

 // Constructor
 public Persona(String nombre, int edad, Mascota mascota) {
     this.nombre = nombre;
     this.edad = edad;
     this.mascota = mascota;
 }

 // Getters y Setters
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

 public Mascota getMascota() {
     return mascota;
 }

 public void setMascota(Mascota mascota) {
     this.mascota = mascota;
 }

 // Método para obtener la información de la persona y su mascota
 public String getInfo() {
     return "Nombre: " + nombre + ", Edad: " + edad + ", Mascota: {" + mascota.getInfo() + "}";
 }
 public static void main(String[] args) {
	 Mascota mascota = new Mascota("senior gato", 1, "gato");
	 Persona duenio1 = new Persona("Julia", 23, mascota);
	duenio1.toString();
}
}