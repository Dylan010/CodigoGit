package unidades;

public abstract class Unidad {
    protected int salud;
    protected int distanciaMinima;
    protected int distanciaMaxima;
    protected int danio; // daño  no se si el programa se rompera por la ñ yo por las dudas

    public Unidad(int salud, int distanciaMinima, int distanciaMaxima, int danio) {
        this.salud = salud;
        this.distanciaMinima = distanciaMinima;
        this.distanciaMaxima = distanciaMaxima;
        this.danio = danio; 
    }

    public boolean puedeAtacar(int distancia) {
        return distancia >= distanciaMinima && distancia <= distanciaMaxima && salud > 0;  // comprobamos la distancia
        // salud lo puse a modo de que si la unidad esta muerta no puede hacer nada
    }
    
    public void recibirDanio(int danio) {
        salud -= danio;
    }								

    public void atacar(Unidad enemigo) {  // 
        enemigo.recibirDanio(danio); // enemigo aun no lo tengo armado
    }

}
