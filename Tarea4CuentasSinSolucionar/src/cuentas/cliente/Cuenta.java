package cuentas.cliente;

/**
 * @author Ismael
 * @version 2.2
 * @since 1
 */
public class Cuenta {

//modificacion para github 2 Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase Cuenta.
     */
    public Cuenta()
    {
        nombre ="";
        cuenta="";
        saldo=0;
        tipoInteres=0;
    }
    
    /**
     * Constructor con parámetros de la clase Cuenta.
     *
     * @param nom   El nombre del titular de la cuenta.
     * @param cue   El número de cuenta.
     * @param sal   El saldo inicial.
     * @param tipo  El tipo de interés.
     */
    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return Saldo actual.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Sirve para ingresar una cantidad en la cuenta.
     *
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si se intenta ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Sirve para retirar una cantidad de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @throws Exception Si se intenta retirar una cantidad negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /*Getters y setters*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
