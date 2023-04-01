package basico;
// lo que hacemos aqui es declarar una clase mascota  con todo lo necesario

//creamos una clase mascota y en otro archivo la clase persona

//Clase Mascota
public class Mascota {
 // Atributos
 private String nombre;
 private int edad;
 private String tipo;

 // Constructor
 public Mascota(String nombre, int edad, String tipo) {
     this.nombre = nombre;
     this.edad = edad;
     this.tipo = tipo;
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

 public String getTipo() {
     return tipo;
 }

 public void setTipo(String tipo) {
     this.tipo = tipo;
 }

 // Método para obtener la información de la mascota
 public String getInfo() {
     return "Nombre: " + nombre + ", Edad: " + edad + ", Tipo: " + tipo;
 }
 public static void main(String[] args) {
	Mascota loro=new Mascota("Periquitos",1,"ave");
	loro.toString();
}
}