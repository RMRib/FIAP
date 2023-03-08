package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClass {

	Calculadora calc = new Calculadora();
	@Test
	public void testSoma() {
		int valor1 = 1;
		int valor2 = 2;
		int resultado = calc.somar(valor1,valor2);
		//assertEquals(valor-esperado, retorno-do-metodo)
		assertEquals(3, resultado);
	}

}
