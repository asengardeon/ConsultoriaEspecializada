/**
 * 
 */
package testes.Controle.Pergunta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import Controle.Pergunta.ControllerCategoria;
import Controle.Pergunta.ControllerRegra;
import Controle.Pergunta.ControllerTarifa;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ControllerTarifaTest {
	@Mock
	private ControllerCategoria m_ControllerCategoria;

	@Mock
	private ControllerRegra m_ControllerRegra;
	@InjectMocks
	private ControllerTarifa controllerTarifa;

	/**
	 * Test method for {@link Controle.Pergunta.ControllerTarifa#ControllerTarifa()}.
	 */
	@Test
	public void testControllerTarifa() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerTarifa#alterarTarifa(Dominio.Pergunta.Tarifa)}.
	 */
	@Test
	public void testAlterarTarifa() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerTarifa#buscarTarifa(long)}.
	 */
	@Test
	public void testBuscarTarifa() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerTarifa#buscarTodasTarifas()}.
	 */
	@Test
	public void testBuscarTodasTarifas() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerTarifa#excluirTarifa(long)}.
	 */
	@Test
	public void testExcluirTarifa() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerTarifa#gerarTarifa(long, java.lang.String)}.
	 */
	@Test
	public void testGerarTarifa() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
