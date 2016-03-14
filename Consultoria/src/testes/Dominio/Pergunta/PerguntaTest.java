/**
 * 
 */
package testes.Dominio.Pergunta;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Anexo.Anexo;
import Dominio.Feedback.Feedback;
import Dominio.Pergunta.Pergunta;
import Dominio.Pergunta.Status;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

/**
 * @author Leandro
 *
 */
public class PerguntaTest {

	private Pergunta p;
	
	
	@Before
	public void setup() {
		p = new Pergunta();
		
	}
	
	@After
	public void tearDown(){
		p = null;
	}
	

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getAnexo()}.
	 */
	@Test
	public void testSetGetAnexo() throws Exception {
		Anexo a = new Anexo();
		a.setAnexo("nome do Anexo");
		ArrayList<Anexo> lista = new ArrayList<Anexo>();
		lista.add(a);
		p.setAnexo(lista);
		
		List list = p.getAnexo();
		assertEquals(lista.size(), 1);
		
		a = (Anexo) list.get(0);
		assertEquals(a.getAnexo(), "nome do Anexo");
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getAutor()}.
	 */
	@Test
	public void testSetGetAutor() throws Exception {
		Usuario u = new Usuario();
		u.setNome("nome do autor");
		p.setAutor(u);
		assertEquals(p.getAutor().getNome(), "nome do autor");
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getDescricao()}.
	 */
	@Test
	public void testSetGetDescricao() throws Exception {
		p.setDescricao("Qualquer descrição");
	    assertEquals(p.getDescricao(), "Qualquer descrição");
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getId()}.
	 */
	@Test
	public void testSetGetId() throws Exception {
		p.setId(10);
		assertEquals(p.getId(), 10);
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getRespostas()}.
	 */
	@Test
	public void testSetGetRespostas() throws Exception {
		Resposta a = new Resposta();
		a.setDescricao("Texto da resposta");
		ArrayList<Resposta> lista = new ArrayList<Resposta>();
		lista.add(a);
		p.setRespostas(lista);
		
		List list = p.getRespostas();
		assertEquals(lista.size(), 1);
		
		a = (Resposta) list.get(0);
		assertEquals(a.getDescricao(), "Texto da resposta");
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getStatus()}.
	 */
	@Test
	public void testSetGetStatus() throws Exception {
		Status st = Status.gerada;
		p.setStatus(st);
		assertEquals(p.getStatus(), Status.gerada);
	}

	
	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getTitulo()}.
	 */
	@Test
	public void testSetGetTitulo() throws Exception {
		String texto = "Texto de teste";
		p.setTitulo(texto);
		assertEquals(p.getTitulo(), texto);
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getValor()}.
	 */
	@Test
	public void testSetGetValor() throws Exception {
		p.setValor(10.7);
		assertEquals(p.getValor(), 10.7, 0);
	}


	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#alterarStatus(Dominio.Pergunta.Status)}.
	 */
	@Test
	public void testAlterarStatus() throws Exception {
		Status st = Status.gerada;
		p.setStatus(st);
		assertEquals(p.getStatus(), Status.gerada);
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#anexarDocumento(Dominio.Anexo.Anexo)}.
	 */
	@Test
	public void testAnexarDocumento() throws Exception {
		Anexo a = new Anexo();
		a.setAnexo("nome do Anexo");
		p.anexarDocumento(a);
		assertEquals(p.getAnexo().size(), 1);
		a = p.getAnexo().get(0);
		assertEquals(a.getAnexo(), "nome do Anexo");
	}

}
