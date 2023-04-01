package basico;

public class Barco extends Auto{   // aqui usamos herencia el metodo extends y hereda las propiedades de la clase auto
	
	private int carga;  // declaramos sus atributos unicos de este objeto
	
	public Barco (String marca,int maxvel,int puertas,String motor,String conductor,int carga) { 
		// en el constructor usamos  super que hace referencia al contructor de auto
		super(marca, maxvel, puertas, motor, conductor);
		this.carga=carga;
	}
//creamos sus getters y setters
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public static void main(String[] args) {
		//creamos el objeto
		Barco goleta= new Barco("goleta",200,2,"motor Iron200 nudos","Capitan Roger",800);
		
		//aqui llama a un metodo como marca es de auto aunque lo herede usamos el getmarca
		goleta.encender(goleta.getMarca());
	}
}