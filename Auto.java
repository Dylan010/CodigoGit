package basico;


// las clases son los planos o estructura del objeto que quieres hacer
public class Auto {

	// Primero declaramos los atribustos de la clase
	
	private String marca;
	private int maxvel;
	private int puertas;
	private String motor;
	
	// ahora hacemos el constructor llamamos a todos los atrivutos y los seteamos de esta manera
	
	public Auto(String marca,int maxvel,int puertas,String motor){
		
		this.marca=marca;
		this.maxvel=maxvel;
		this.puertas=puertas;
		this.motor=motor;
		
	}

	 // Getters y Setters
	
	public String getMarca() {
		return marca;
	}
	// los setter van con void
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMaxvel() {
		return maxvel;
	}

	public void setMaxvel(int maxvel) {
		this.maxvel = maxvel;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	 // Método para obtener la información
	
	public String toString() {
		return "Auto [marca=" + marca + ", maxvel=" + maxvel + ", puertas=" + puertas + ", motor=" + motor + "]";
	}
	
	//ejemplo de como se declara un metodo
	/*[modificador] tipoRetorno nombreMetodo([tipoParametro1] [nombreParametro1], ...) {
	    // Cuerpo del método
	}*/
	public void encender(String marca) {
		System.out.println("El auto "+ marca +" se encendio");
	}
	
	public void  avanzar(String marca) {
		System.out.println("El auto"+ marca +" hace rum rum hacia adelante");
	}
	
	public static void main(String[] args) {
		
		
		// creo un objeto llamado auto ford eh inserto los valores de autoford  que son los atrivutos que definimos de la clase Auto
		Auto autoford = new Auto("Ford",280,4,"motorVX3000");
		
		System.out.println(autoford.toString()); // aqui hago que el objeto ford llame al metodo que muestra la info basica
		
		autoford.encender(autoford.marca);
		autoford.avanzar(autoford.marca);
	}
	
	
	
	
}
