/**
 * 
 */
package testes.Dominio.Resposta;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Anexo.Anexo;
import Dominio.Pergunta.Pergunta;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

/**
 * @author Leandro
 *
 */
public class RespostaTest {

	private Resposta r;

	@Before
	public void setup() {
		r = new Resposta();
	}

	@After
	public void tearDown() {
		r = null;
	}

	/**
	 * Test method for {@link Dominio.Resposta.Resposta#getAnexo()}.
	 */
	@Test
	public void testGetSetAnexo() throws Exception {
		Anexo a = new Anexo();
		a.setAnexo("nome do Anexo");
		ArrayList<Anexo> lista = new ArrayList<Anexo>();
		lista.add(a);
		r.setAnexo(lista);
		
		List list = r.getAnexo();
		assertEquals(lista.size(), 1);
		
		a = (Anexo) list.get(0);
		assertEquals(a.getAnexo(), "nome do Anexo");
	}

	/**
	 * Test method for {@link Dominio.Resposta.Resposta#getAutor()}.
	 */
	@Test
	public void testGetSetAutor() throws Exception {
		Usuario u = new Usuario();
		u.setNome("nome do autor");
		r.setAutor(u);
		assertEquals(r.getAutor().getNome(), "nome do autor");
	}


	/**
	 * Test method for {@link Dominio.Resposta.Resposta#getDescricao()}.
	 */
	@Test
	public void testGetSetDescricao() throws Exception {
		r.setDescricao("Qualquer descrição");
		assertEquals(r.getDescricao(), "Qualquer descrição");
	}

	/**
	 * Test method for {@link Dominio.Resposta.Resposta#isEscolhida()}.
	 */
	@Test
	public void testIsEscolhida() throws Exception {
		r.setEscolhida(true);
		assertEquals(r.isEscolhida(), true);
	}

	/**
	 * Test method for {@link Dominio.Resposta.Resposta#setEscolhida(boolean)}.
	 */
	@Test
	public void testSetEscolhida() throws Exception {
		r.setEscolhida(true);
		assertEquals(r.isEscolhida(), true);
	}

	/**
	 * Test method for {@link Dominio.Resposta.Resposta#getId()}.
	 */
	@Test
	public void testGetSetId() throws Exception {
		r.setId(10);
		assertEquals(r.getId(), 10);
	}

	/**
	 * Test method for {@link Dominio.Resposta.Resposta#setNumeroHoras(double)}.
	 */
	@Test
	public void testGetSetNumeroHoras() throws Exception {
		r.setNumeroHoras(71.8);
		assertEquals(r.getNumeroHoras(), 71.8, 0);
	}

	/**
	 * Test method for
	 * {@link Dominio.Resposta.Resposta#setPergunta(Dominio.Pergunta.Pergunta)}.
	 */
	@Test
	public void testGetSetPergunta() throws Exception {
		Pergunta p = new Pergunta();
		p.setDescricao("nova descrição");
		r.setPergunta(p);
		Pergunta p2 = r.getPergunta();
		assertEquals(p2.getDescricao(), "nova descrição");
	}

	/**
	 * Test method for {@link Dominio.Resposta.Resposta#getValor()}.
	 */
	@Test
	public void testGetSetValor() throws Exception {
		 r.setValor(9545.554);
	     assertEquals(r.getDescricao(), 9545.554);
	}

	/**
	 * Test method for
	 * {@link Dominio.Resposta.Resposta#anexarDocumento(Dominio.Anexo.Anexo)}.
	 */
	@Test
	public void testAnexarDocumento() throws Exception {
		Anexo a = new Anexo();
		a.setAnexo("nome do Anexo");
		r.anexarDocumento(a);
		assertEquals(r.getAnexo().size(), 1);
		a = r.getAnexo().get(0);
		assertEquals(a.getAnexo(), "nome do Anexo");
	}
	
}
