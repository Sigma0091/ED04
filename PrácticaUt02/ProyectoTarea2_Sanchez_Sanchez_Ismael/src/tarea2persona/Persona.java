package tarea2persona;
/**
 * @author Ismael
 */
public class Persona {
    public static void main(String[] args) {
        Persona individuo = new Persona();
        individuo.setNombre("David");
        individuo.setEdad(23);
        individuo.setAltura(1.74);
        individuo.setOcupación("Camarero");
        
        System.out.println("Nombre: " + individuo.getNombre());
        System.out.println("Edad: " + individuo.getEdad());
        System.out.println("Altura: " + individuo.getAltura());
        System.out.println("Ocupación: " + individuo.getOcupación());
    }
    private String nombre;
    private int edad;
    private double altura;
    private String ocupación;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public String getOcupación() {
        return ocupación;
    }
    public void setOcupación(String ocupación) {
        this.ocupación = ocupación;
    }
    
}
