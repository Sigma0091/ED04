package cuentas.cliente;

/**
 * @author Ismael
 * @version 2.2
 * @since 1
 */
public class Main {
//Modificación para github 2 Main
    /**
     * Método principal para probar la funcionalidad de la clase Cuenta.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     * Realiza operaciones básicas sobre una cuenta.
     *
     * @param cantidad La cantidad inicial de la cuenta.
     */
    public static void operativa_cuenta(float cantidad) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
