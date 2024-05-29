public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private String combustible;
    private double precio;


    public Vehiculo(String marca, String modelo, int año, String combustible, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.combustible = combustible;
        this.precio = precio;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCombustible() {
        return this.combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return " Marca: " + getMarca() + ", modelo: " + getModelo() + ", año: " + getAño() + ", combustible: " + getCombustible() + ", precio: " + getPrecio();
    }


}
