package br.unipe.cc.test;
import junit.framework.TestCase;
import br.unipe.cc.negocio.Item;

public class ItemTest extends TestCase {
	
	public void testCompareTo(){
		Item it = new Item();
		Item it2 = new Item();
		it.setCod(1);
		it2.setCod(2);
		assertEquals(-1,it.compareTo(it2));
		assertEquals(1,it2.compareTo(it));
		it.setCod(2);
		assertEquals(0,it.compareTo(it2));
	}

}
