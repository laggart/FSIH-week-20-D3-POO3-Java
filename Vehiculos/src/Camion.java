public class Camion extends Vehiculo {
    private int numeroEjes;

    public Camion(String marca, String modelo, int año, String combustible, double precio, int numeroEjes) {
        super(marca, modelo, año, combustible, precio);
        this.numeroEjes = numeroEjes;
    }

    public int getNumeroEjes() {
        return this.numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    
    @Override
    public String toString() {
        return super.toString() + " numero de ejes: " + getNumeroEjes() + " para mas estabilidad ";
    } 
}
