public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int año, String combustible, double precio, int numeroPuertas) {
        super(marca, modelo, año, combustible, precio);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
   

    @Override
    public String toString() {
        return  super.toString() + " numero de puertas: " + getNumeroPuertas();
    }

}
