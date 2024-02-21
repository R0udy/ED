package practica;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CCuentaTest {
    private CCuenta cuenta;

    @Before
    public void setUp() throws Exception {
        cuenta = new CCuenta();
    }

    @Test
    public void testIngresarCantidadNegativa() {
        int resultado = cuenta.ingresar(-100);
        assertEquals("Prueba con cantidad negativa", 1, resultado);
        assertEquals("El saldo no debe cambiar con cantidad negativa", 0, cuenta.dSaldo, 0.01);
    }

    @Test
    public void testIngresarCajaBlanca() {
        int resultado = cuenta.ingresar(-3);
        assertEquals("Prueba específica para caja blanca", 2, resultado);
        assertEquals("El saldo no debe cambiar para prueba de caja blanca", 0, cuenta.dSaldo, 0.01);
    }

    @Test
    public void testIngresarCantidadPositiva() {
        int resultado = cuenta.ingresar(100);
        assertEquals("Prueba con cantidad positiva", 0, resultado);
        assertEquals("El saldo debe incrementarse con cantidad positiva", 100, cuenta.dSaldo, 0.01);
    }

    @Test
    public void testIngresarCero() {
        int resultado = cuenta.ingresar(0);
        assertEquals("Prueba con cero", 0, resultado);
        assertEquals("El saldo debe permanecer igual con cero", 0, cuenta.dSaldo, 0.01);
    }
}
