public class Moto extends Vehiculo {
    private boolean esPista;

    public Moto(String marca, String modelo, int año, String combustible, double precio, boolean esPista) {
        super(marca, modelo, año, combustible, precio);
        this.esPista = esPista;
    }


    public boolean isEsPista() {
        return this.esPista;
    }

    public void setEsPista(boolean esPista) {
        this.esPista = esPista;
    }

    @Override
    public String toString() {
        return super.toString() +
            " es una moto de pista: " + isEsPista();
    }



    
    
}
