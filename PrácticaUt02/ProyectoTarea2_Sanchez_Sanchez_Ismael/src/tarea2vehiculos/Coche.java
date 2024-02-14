package tarea2vehiculos;
/**
 * @author Ismael
 */
public class Coche {
    public static void main(String[] args) {
        Coche car = new Coche();
        car.setMarca("Opel");
        car.setModelo("Corsa");
        car.setNumeroPuertas(400);
        car.setTipoCombustible(TipoCombustible.GASOLINA);
        car.setEsNuevo(true);
        car.setPrecio(5000.0);

        System.out.println("Marca del coche: " + car.getMarca());
        System.out.println("Número de puertas: " + car.getNumeroPuertas());

        System.out.println("Detalles del coche:");
        System.out.println(car.toString());
    }
    
    private String marca;
    private String modelo;
    private int numeroPuertas;
    private TipoCombustible tipo;
    private boolean esNuevo;
    private double precio;

    public enum TipoCombustible {
        GASOLINA,
        GASOIL,
        HIBRIDO,
        ELECTRICO
    }
    
    public Coche() {
    }
    
    public Coche(String marca, int numeroPuertas, TipoCombustible tipo, boolean esNuevo, double precio) {
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.tipo = tipo;
        this.esNuevo = esNuevo;
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", numeroPuertas=" + numeroPuertas + ", tipo=" + tipo + ", esNuevo=" + esNuevo + ", precio=" + precio + '}';
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public TipoCombustible getTipoCombustible() {
        return tipo;
    }
    public void setTipoCombustible(TipoCombustible tipo) {
        this.tipo = tipo;
    }
    public boolean isEsNuevo() {
        return esNuevo;
    }
    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    }

