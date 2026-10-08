package pe.edu.unsch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuentaBancariaTest {

    @Test
    void depositoDebeIncrementarSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.depositar(50);
        assertEquals(150, cuenta.obtenerSaldo());
    }
    @Test
    void retiroDebeDisminuirSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        cuenta.retirar(30);
        assertEquals(70, cuenta.obtenerSaldo());
    }

    @Test
    void transferenciaDebeMoverFondosEntreCuentas() {
        CuentaBancaria origen = new CuentaBancaria(200);
        CuentaBancaria destino = new CuentaBancaria(50);

        origen.transferir(destino, 100);

        assertEquals(100, origen.obtenerSaldo());
        assertEquals(150, destino.obtenerSaldo());
    }
}

