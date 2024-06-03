import org.example.Banco;
import org.example.CaixaEletronico;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class CaixaEletronicoTest {

    @Test
    public void testeCaixaEletronicoMock(){
        Banco bancoMock = Mockito.mock(Banco.class);

        when(bancoMock.getSaldoContaPoupanca()).thenReturn(100.00);
        when(bancoMock.getSaldoContaCorrente()).thenReturn(250.00);

        CaixaEletronico caixaEletronico = new CaixaEletronico(bancoMock);

        double saldo = caixaEletronico.calcularSaldoTotal();
        Assertions.assertEquals(350.00,saldo);
    }

    @Test
    public void testeCaixaEletronicoSpy(){
        Banco banco1 = new Banco();
        Banco bancoSpy = Mockito.spy(banco1);

        when(bancoSpy.getSaldoContaPoupanca()).thenReturn(500.00);

        CaixaEletronico caixaEletronico = new CaixaEletronico(bancoSpy);

        double saldo = caixaEletronico.calcularSaldoTotal();
        Assertions.assertEquals(1500.00, saldo);
    }
}
