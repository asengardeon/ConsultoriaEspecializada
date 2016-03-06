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
import Controle.Pergunta.ControllerTarifa;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ControllerCategoriaTest {
	@Mock
	private ControllerTarifa m_ControllerTarifa;
	@InjectMocks
	private ControllerCategoria controllerCategoria;

	/**
	 * Test method for {@link Controle.Pergunta.ControllerCategoria#ControllerCategoria()}.
	 */
	@Test
	public void testControllerCategoria() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerCategoria#alterarCategoria(Dominio.Pergunta.Categoria)}.
	 */
	@Test
	public void testAlterarCategoria() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerCategoria#buscarCategoria(long)}.
	 */
	@Test
	public void testBuscarCategoria() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerCategoria#buscarCategoriaUsuario(long)}.
	 */
	@Test
	public void testBuscarCategoriaUsuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerCategoria#buscarTodasCategorias()}.
	 */
	@Test
	public void testBuscarTodasCategorias() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
