package unidades;

public class Soldado extends Unidad {
    private int energia = 100;

    public Soldado() {
        super(200, 1, 1, 10);
    }

    @Override
    public boolean puedeAtacar(int distancia) {
        return super.puedeAtacar(distancia) && energia >= 10;
    }

    @Override
    public void atacar(Unidad enemigo) {
        super.atacar(enemigo);
        energia -= 10;
    }

    public void recibirRacionDeAgua() {
        energia = 100;
    }
}