package br.com.fabriciocurvello.JUnitAssertivas.model;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class AlunoTest {
	
	@Test
	public void assertTest() {
		
		String nome1 = "casa";
		String nome2 = "casa";
		Aluno a1 = new Aluno("Maria", "maria@email.com");
		Aluno a2 = new Aluno("Maria", "maria@email.com");
		Aluno a3 = a1;
		Aluno a4 = null;
		
		
		Assert.assertTrue(4 > 3); // Tem que dar true
		Assert.assertTrue("Tinha que dar TRUE!", 4 > 3); // String que aparece quando o teste falha
		Assert.assertFalse(4 < 3); // Tem que dar false
		
	
		Assert.assertEquals(1, 1);
		Assert.assertEquals(nome1, nome2);
		// Assert.assertEquals(3.14, 3.14); //Deprecated
		Assert.assertEquals(3.14, 3.14, 0.01);
		Assert.assertEquals(Math.PI, 3.140, 0.01); // Delta 0.01 faz comparar até a segunda casa decimal
		
		// Assert.assertEquals(a1, a2); //Busca método equals na classe de origem (source/gen equals)
		// Assert.assertSame(a1, a2); //Não são a mesma instância
		Assert.assertEquals(a1, a3);
		Assert.assertNotEquals(a1, a4);
		Assert.assertSame(a1, a3);
		Assert.assertNotSame(a1, a2);
		Assert.assertNull(a4);
		Assert.assertNotNull(a1);
		Assert.assertThat(nome1, CoreMatchers.is("casa")); //Interepte como "verifique que nome1 é casa" 
		Assert.assertThat(a1, CoreMatchers.is(a3));
	}

}
