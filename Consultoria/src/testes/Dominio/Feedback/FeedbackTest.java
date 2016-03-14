/**
 * 
 */
package testes.Dominio.Feedback;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Feedback.Feedback;
import Dominio.Pergunta.Pergunta;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

/**
 * @author Leandro
 *
 */
public class FeedbackTest {
		
	private Feedback f;


	@Before
	public void setup() {
		f = new Feedback();
		
	}
	
	@After
	public void tearDown(){
		f = null;
	}
	
	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getDescricao()}.
	 */
	@Test
	public void testSetGetDescricao() throws Exception {
       f.setDescricao("Qualquer descrição");
       assertEquals(f.getDescricao(), "Qualquer descrição");
	}

	
	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getDestinatarios()}.
	 */
	@Test
	public void testSetGetDestinatarios() throws Exception {
		Usuario u = new Usuario();
		u.setNome("nome do teste");
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		lista.add(u);
		f.setDestinatarios(lista);
		
		List list = f.getDestinatarios();
		assertEquals(lista.size(), 1);
		
		u = (Usuario) list.get(0);
		assertEquals(u.getNome(), "nome do teste");
	}
   /**
	 * Test method for {@link Dominio.Feedback.Feedback#getHorario()}.
	 */
	@Test
	public void testSetGetHorario() throws Exception {
		@SuppressWarnings("deprecation")
		Date d = new Date(2016, 03, 9);
		f.setHorario(d);
		assertEquals(f.getHorario(), d);
	}

	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getId()}.
	 */
	@Test
	public void testSetGetId() throws Exception {
		f.setId(10);
		assertEquals(f.getId(), 10);
	}

	
	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getPergunta()}.
	 */
	@Test
	public void testSetGetPergunta() throws Exception {
		Pergunta p = new Pergunta();
		p.setDescricao("nova descrição");
		f.setPergunta(p);
		Pergunta p2 = f.getPergunta();
		assertEquals(p2.getDescricao(), "nova descrição");
	}

	
	/**
	 * Test method for {@link Dominio.Feedback.Feedback#getRemetente()}.
	 */
	@Test
	public void testSetGetRemetente() throws Exception {
		Usuario u = new Usuario();
		u.setNome("nome do remetente");
		f.setRemetente(u);
		assertEquals(f.getRemetente().getNome(), "nome do remetente");
	}

}
