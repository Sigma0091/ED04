/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package entornos.tema3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ismael
 */
public class CalculadorTest {
    
    public CalculadorTest() {
    }
    
    /**
     * Test of cuentaCifras method, of class Calculador.
     */

    @Test
    public void testCuentaCifras_Uno() {
        System.out.println("Caso de prueba para el número 1");
        int num = 1;
        int expResult = 1;
        int result = Calculador.cuentaCifras(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testCuentaCifras_CasoCero() {
        System.out.println("Caso de prueba para el número 0");
        int num = 0;
        int expResult = 1; // Según la implementación actual
        int result = Calculador.cuentaCifras(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testCuentaCifras_CasoPositivo() {
        System.out.println("Caso de prueba para el número positivo 123");
        int num = 123;
        int expResult = 3;
        int result = Calculador.cuentaCifras(num);
        assertEquals(expResult, result);
    }

    @Test
    public void testCuentaCifras_CasoNegativo() {
        System.out.println("Caso de prueba para el número negativo -4567");
        int num = -4567;
        int expResult = 4;
        int result = Calculador.cuentaCifras(num);
        assertEquals(expResult, result);
    }
    
    //test de fallo CuentaCifras
    @Test
    public void testCuentaCifras_CasoFalso() {
        System.out.println("Caso de fallo forzado para CuentaCifras");
        int num = 0;
        int expResult = 9999999; // Según la implementación actual
        int result = Calculador.cuentaCifras(num);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of potencia method, of class Calculador.
     */
    @Test
    public void testPotencia_CasoExponenteCero() {
        System.out.println("Caso de prueba para exponente igual a cero");
        int base = 5;
        int expo = 0;
        int expResult = 1;
        int result = Calculador.potencia(base, expo);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotencia_CasoBaseCero() {
        System.out.println("Caso de prueba para base igual a cero");
        int base = 0;
        int expo = 3;
        int expResult = 0;
        int result = Calculador.potencia(base, expo);
        assertEquals(expResult, result);
    }

    @Test
    public void testPotencia_CasoExponenteUno() {
        System.out.println("Caso de prueba para exponente igual a uno");
        int base = 2;
        int expo = 1;
        int expResult = 2;
        int result = Calculador.potencia(base, expo);
        assertEquals(expResult, result);
    }
    
    //Forzar fallo en Potencia
    @Test
    public void testPotencia_CasoIncorrecto() {
        System.out.println("Caso de fallo forzado para Potencia");
        int base = 2;
        int expo = 1;
        int expResult = -3;
        int result = Calculador.potencia(base, expo);
        assertEquals(expResult, result);
    }
    
    
}
