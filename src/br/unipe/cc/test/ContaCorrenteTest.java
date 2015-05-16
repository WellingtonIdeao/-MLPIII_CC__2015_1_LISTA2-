package br.unipe.cc.test;
import junit.framework.TestCase;
import br.unipe.cc.negocio.Conta;
import br.unipe.cc.negocio.ContaCorrente;

public class ContaCorrenteTest extends TestCase {
	
	
	public void testFail() { // teste falho
		double saldo = 100;
		Conta c = new ContaCorrente();
		c.creditar(saldo);
		assertEquals(100 - 0.10, c.getSaldo());
		// fail(); basta retirar essa linha de comentário que o teste falhará
	}

	public void testCreditar() {
		double saldo = 200.10;
		Conta c = new ContaCorrente();
		c.creditar(saldo);
		assertEquals(200.00, c.getSaldo()); // teste com desconto de 10 centavos
											// caracteristica da conta corrente
		c.creditar(10.00);
		assertFalse(200 == c.getSaldo());
	}

	public void testDebitar() {
		double saldo = 200.10;
		Conta c = new ContaCorrente();
		c.creditar(saldo);
		c.debitar(200.00);
		assertEquals(0.00, c.getSaldo());
		c.debitar(10.00);
		assertTrue(00 == c.getSaldo());
	}

	public void testAtualizaTaxa() {
		Conta c = new ContaCorrente();
		c.creditar(100.00);
		c.atualizaTaxa(5.00);
		assertEquals(89.90, c.getSaldo());

	}

	public void testEquals() {
		Conta c = new ContaCorrente();
		Conta c2 = c;
		assertSame(c, c2);
		c2 = new ContaCorrente();
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
