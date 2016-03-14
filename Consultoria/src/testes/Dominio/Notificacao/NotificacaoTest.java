/**
 * 
 */
package testes.Dominio.Notificacao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
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
public class NotificacaoTest {
	

	private Notificacao n;

	
	@Before
	public void setup() {
		n = new Notificacao();
		
	}
	
	@After
	public void tearDown(){
		n = null;
	}
	

	/**
	 * Test method for {@link Dominio.Notificacao.Notificacao#getDescricao()}.
	 */
	@Test
	public void testSetGetDescricao() throws Exception {
		n.setDescricao("Qualquer descrição");
	    assertEquals(n.getDescricao(), "Qualquer descrição");
	}

	
	/**
	 * Test method for {@link Dominio.Notificacao.Notificacao#getDestinatario()}.
	 */
	@Test
	public void testSetGetDestinatario() throws Exception {
		Usuario u = new Usuario();
		u.setNome("nome do teste");
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		lista.add(u);
		n.setDestinatario(lista);
		
		List list = n.getDestinatario();
		assertEquals(lista.size(), 1);
		
		u = (Usuario) list.get(0);
		assertEquals(u.getNome(), "nome do teste");
	}

	/**
	 * Test method for {@link Dominio.Notificacao.Notificacao#getHorario()}.
	 */
	@Test
	public void testSetGetHorario() throws Exception {
		@SuppressWarnings("deprecation")
		Date d = new Date(2016, 03, 9);
		n.setHorario(d);
		assertEquals(n.getHorario(), d);
	}

	
	/**
	 * Test method for {@link Dominio.Notificacao.Notificacao#getId()}.
	 */
	@Test
	public void testsetGetId() throws Exception {
		n.setId(10);
		assertEquals(n.getId(), 10);
	}

	/**
	 * Test method for {@link Dominio.Notificacao.Notificacao#getPergunta()}.
	 */
	@Test
	public void testSetGetPergunta() throws Exception {
		Pergunta p = new Pergunta();
		p.setDescricao("nova descrição");
		n.setPergunta(p);
		Pergunta p2 = n.getPergunta();
		assertEquals(p2.getDescricao(), "nova descrição");
	}

	/**
	 * Test method for {@link Dominio.Notificacao.Notificacao#getRemetente()}.
	 */
	@Test
	public void testSetGetRemetente() throws Exception {
		Usuario u = new Usuario();
		u.setNome("nome do remetente");
		n.setRemetente(u);
		assertEquals(n.getRemetente().getNome(), "nome do remetente");
	}

	
	/**
	 * Test method for {@link Dominio.Notificacao.Notificacao#getTitulo()}.
	 */
	@Test
	public void testSetGetTitulo() throws Exception {
		String texto = "Texto de teste";
		n.setTitulo(texto);
		assertEquals(n.getTitulo(), texto);
	}

	
	

}
