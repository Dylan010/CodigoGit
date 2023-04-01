package basico;

//Clase Perro que hereda de Mascota
public class Perro extends Mascota {
 // Atributo adicional
 private String raza;

 // Constructor
 public Perro(String nombre, int edad, String raza) {
     // Llamar al constructor de la clase base (Mascota)
     super(nombre, edad, "Perro");
     this.raza = raza;
 }

 // Getter y Setter para el atributo raza
 public String getRaza() {
     return raza;
 }

 public void setRaza(String raza) {
     this.raza = raza;
 }

 // Sobrescribir el método getInfo() para incluir la raza del perro
 @Override
 public String getInfo() {
     return super.getInfo() + ", Raza: " + raza;
 }
}
