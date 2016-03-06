/**
 * 
 */
package testes.Controle.Usuario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import Controle.Feedback.ControllerFeedback;
import Controle.Pergunta.ControllerCategoria;
import Controle.Usuario.ControllerUsuario;
import Dominio.Usuario.Usuario;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ControllerUsuarioTest {
	@Mock
	private ControllerCategoria m_ControllerCategoria;

	@Mock
	private ControllerFeedback m_ControllerFeedback;

	@Mock
	private Usuario m_Usuario;
	@InjectMocks
	private ControllerUsuario controllerUsuario;

	/**
	 * Test method for {@link Controle.Usuario.ControllerUsuario#ControllerUsuario()}.
	 */
	@Test
	public void testControllerUsuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Usuario.ControllerUsuario#alterarUsuario(long)}.
	 */
	@Test
	public void testAlterarUsuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Usuario.ControllerUsuario#buscarUsuario(long)}.
	 */
	@Test
	public void testBuscarUsuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Usuario.ControllerUsuario#excluirUsuario(long)}.
	 */
	@Test
	public void testExcluirUsuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Usuario.ControllerUsuario#gerarUsuario(long, java.lang.String, java.lang.String, java.lang.String, int, long, long, java.lang.String, int, int, java.lang.String, int, byte, java.util.List)}.
	 */
	@Test
	public void testGerarUsuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Usuario.ControllerUsuario#promoverUsuario(long)}.
	 */
	@Test
	public void testPromoverUsuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
