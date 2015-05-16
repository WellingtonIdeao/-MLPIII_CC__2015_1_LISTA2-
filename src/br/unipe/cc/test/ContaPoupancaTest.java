package br.unipe.cc.test;
import junit.framework.TestCase;
import br.unipe.cc.negocio.Conta;
import br.unipe.cc.negocio.ContaPoupanca;

public class ContaPoupancaTest extends TestCase {

	public void testFail() { // teste falho
		double saldo = 100.00;
		Conta c = new ContaPoupanca();
		c.creditar(saldo);
		assertEquals(100.00, c.getSaldo());
		// fail(); basta retirar essa linha de comentário que o teste falhará.
	}

	public void testCreditar() {
		double saldo = 200.00;
		Conta c = new ContaPoupanca();
		c.creditar(saldo);
		assertEquals(200.00, c.getSaldo());
		c.creditar(10.00);
		assertFalse(200 == c.getSaldo());
	}

	public void testDebitar() {
		double saldo = 200.00;
		Conta c = new ContaPoupanca();
		c.creditar(saldo);
		c.debitar(200.00);
		assertEquals(0.00, c.getSaldo());
		c.debitar(10.00);
		assertTrue(00 == c.getSaldo());
	}

	public void testAtualizaTaxa() {
		Conta c = new ContaPoupanca();
		c.creditar(100.00);
		c.atualizaTaxa(5.00);
		assertEquals(85.00, c.getSaldo());
		c.creditar(15.00);
		c.atualizaTaxa(10.00);
		assertEquals(70.00, c.getSaldo());

	}

	public void testEquals() {
		Conta c = new ContaPoupanca();
		Conta c2 = c;
		assertSame(c, c2);
		c2 = new ContaPoupanca();
		assertNotSame(c, c2);
		assertNull(c.getNumero());
		assertNull(c2.getNumero());
		c.setNumero("a2");
		c2.setNumero("a1");
		assertNotNull(c.getNumero());
		assertNotNull(c2.getNumero());
		assertFalse(c.equals(c2));
		c2.setNumero("a2");
		assertTrue(c.equals(c2));

	}
}
