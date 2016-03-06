/**
 * 
 */
package testes.Controle.Resposta;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import Controle.Anexo.ControllerAnexo;
import Controle.Feedback.ControllerFeedback;
import Controle.Notificacao.ControllerNotificacao;
import Controle.Resposta.ControllerResposta;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ControllerRespostaTest {
	@Mock
	private ControllerAnexo m_ControllerAnexo;

	@Mock
	private ControllerFeedback m_ControllerFeedback;

	@Mock
	private ControllerNotificacao m_ControllerNotificacao;
	@InjectMocks
	private ControllerResposta controllerResposta;

	/**
	 * Test method for {@link Controle.Resposta.ControllerResposta#ControllerResposta()}.
	 */
	@Test
	public void testControllerResposta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Resposta.ControllerResposta#alterarResposta(Dominio.Resposta.Resposta)}.
	 */
	@Test
	public void testAlterarResposta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Resposta.ControllerResposta#buscarResposta(long)}.
	 */
	@Test
	public void testBuscarResposta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Resposta.ControllerResposta#buscarRespostaPergunta(long)}.
	 */
	@Test
	public void testBuscarRespostaPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Resposta.ControllerResposta#buscarRespostaUsuario(long)}.
	 */
	@Test
	public void testBuscarRespostaUsuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Resposta.ControllerResposta#buscarTodasRespostas()}.
	 */
	@Test
	public void testBuscarTodasRespostas() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Resposta.ControllerResposta#excluirResposta(long)}.
	 */
	@Test
	public void testExcluirResposta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Resposta.ControllerResposta#gerarResposta(long, Dominio.Usuario.Usuario, java.lang.String, Dominio.Pergunta.Pergunta, double, double, java.util.List, boolean)}.
	 */
	@Test
	public void testGerarResposta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
