/**
 * 
 */
package testes.Dominio.Feedback;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import Dominio.Feedback.Feedback;
import Dominio.Notificacao.Notificacao;
import Dominio.Pergunta.Pergunta;
import Dominio.Usuario.Usuario;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class FeedbackTest {
	@Mock
	private String descricao;

	@Mock
	private List<Usuario> destinatarios;

	@Mock
	private Date horario;

	@Mock
	private long id;

	@Mock
	private Notificacao m_Notificacao;

	@Mock
	private Usuario m_Usuario;

	@Mock
	private Pergunta pergunta;

	@Mock
	private Usuario remetente;
	@InjectMocks
	private Feedback feedback;

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getDescricao()}.
	 */
	@Test
	public void testGetDescricao() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#setDescricao(java.lang.String)}.
	 */
	@Test
	public void testSetDescricao() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getDestinatarios()}.
	 */
	@Test
	public void testGetDestinatarios() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#setDestinatarios(java.util.List)}.
	 */
	@Test
	public void testSetDestinatarios() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getHorario()}.
	 */
	@Test
	public void testGetHorario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#setHorario(java.util.Date)}.
	 */
	@Test
	public void testSetHorario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getId()}.
	 */
	@Test
	public void testGetId() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#setId(long)}.
	 */
	@Test
	public void testSetId() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getPergunta()}.
	 */
	@Test
	public void testGetPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#setPergunta(Dominio.Pergunta.Pergunta)}.
	 */
	@Test
	public void testSetPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getRemetente()}.
	 */
	@Test
	public void testGetRemetente() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#setRemetente(Dominio.Usuario.Usuario)}.
	 */
	@Test
	public void testSetRemetente() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getM_Usuario()}.
	 */
	@Test
	public void testGetM_Usuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#setM_Usuario(Dominio.Usuario.Usuario)}.
	 */
	@Test
	public void testSetM_Usuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getM_Notificacao()}.
	 */
	@Test
	public void testGetM_Notificacao() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#setM_Notificacao(Dominio.Notificacao.Notificacao)}.
	 */
	@Test
	public void testSetM_Notificacao() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#Feedback()}.
	 */
	@Test
	public void testFeedback() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
