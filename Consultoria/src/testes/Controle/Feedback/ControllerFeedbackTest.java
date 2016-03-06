/**
 * 
 */
package testes.Controle.Feedback;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import Controle.Feedback.ControllerFeedback;
import Controle.Notificacao.ControllerNotificacao;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ControllerFeedbackTest {
	@Mock
	private ControllerNotificacao m_ControllerNotificacao;
	@InjectMocks
	private ControllerFeedback controllerFeedback;

	/**
	 * Test method for {@link Controle.Feedback.ControllerFeedback#ControllerFeedback()}.
	 */
	@Test
	public void testControllerFeedback() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Controle.Feedback.ControllerFeedback#gerarFeedback(long, Dominio.Usuario.Usuario, java.lang.String, java.util.Date, java.util.List, Dominio.Pergunta.Pergunta)}.
	 */
	@Test
	public void testGerarFeedback() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
