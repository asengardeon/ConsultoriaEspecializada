/**
 * 
 */
package testes.Controle.Pergunta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import Controle.Anexo.ControllerAnexo;
import Controle.Notificacao.ControllerNotificacao;
import Controle.Pergunta.ControllerCategoria;
import Controle.Pergunta.ControllerPergunta;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ControllerPerguntaTest {
	@Mock
	private ControllerAnexo m_ControllerAnexo;

	@Mock
	private ControllerCategoria m_ControllerCategoria;

	@Mock
	private ControllerNotificacao m_ControllerNotificacao;
	@InjectMocks
	private ControllerPergunta controllerPergunta;

	/**
	 * Test method for {@link Controle.Pergunta.ControllerPergunta#ControllerPergunta()}.
	 */
	@Test
	public void testControllerPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerPergunta#alterarPergunta(Dominio.Pergunta.Pergunta)}.
	 */
	@Test
	public void testAlterarPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerPergunta#buscarPergunta(long)}.
	 */
	@Test
	public void testBuscarPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerPergunta#buscarPerguntaUsuario(long)}.
	 */
	@Test
	public void testBuscarPerguntaUsuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerPergunta#buscarTodasPerguntas()}.
	 */
	@Test
	public void testBuscarTodasPerguntas() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerPergunta#excluirPergunta(long)}.
	 */
	@Test
	public void testExcluirPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerPergunta#finalizarPergunta(long)}.
	 */
	@Test
	public void testFinalizarPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Pergunta.ControllerPergunta#gerarPergunta(long, java.lang.String, java.lang.String, Dominio.Pergunta.Categoria, Dominio.Usuario.Usuario, Dominio.Pergunta.Status, java.util.List, java.util.List, double)}.
	 */
	@Test
	public void testGerarPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
