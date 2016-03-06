/**
 * 
 */
package testes.Dominio.Pergunta;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import Dominio.Anexo.Anexo;
import Dominio.Pergunta.Categoria;
import Dominio.Pergunta.Pergunta;
import Dominio.Pergunta.Status;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

/**
 * @author Leandro
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class PerguntaTest {
	@Mock
	private List<Anexo> anexo;

	@Mock
	private Usuario autor;

	@Mock
	private String descricao;

	@Mock
	private long id;

	@Mock
	private Anexo m_Anexo;

	@Mock
	private Categoria m_Categoria;

	@Mock
	private Resposta m_Resposta;

	@Mock
	private Usuario m_Usuario;

	@Mock
	private List<Resposta> respostas;

	@Mock
	private Status status;

	@Mock
	private String titulo;

	@Mock
	private double valor;
	@InjectMocks
	private Pergunta pergunta;

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getAnexo()}.
	 */
	@Test
	public void testGetAnexo() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setAnexo(java.util.List)}.
	 */
	@Test
	public void testSetAnexo() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getAutor()}.
	 */
	@Test
	public void testGetAutor() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setAutor(Dominio.Usuario.Usuario)}.
	 */
	@Test
	public void testSetAutor() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getDescricao()}.
	 */
	@Test
	public void testGetDescricao() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setDescricao(java.lang.String)}.
	 */
	@Test
	public void testSetDescricao() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getId()}.
	 */
	@Test
	public void testGetId() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setId(long)}.
	 */
	@Test
	public void testSetId() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getRespostas()}.
	 */
	@Test
	public void testGetRespostas() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setRespostas(java.util.List)}.
	 */
	@Test
	public void testSetRespostas() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getStatus()}.
	 */
	@Test
	public void testGetStatus() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setStatus(Dominio.Pergunta.Status)}.
	 */
	@Test
	public void testSetStatus() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getTitulo()}.
	 */
	@Test
	public void testGetTitulo() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setTitulo(java.lang.String)}.
	 */
	@Test
	public void testSetTitulo() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getValor()}.
	 */
	@Test
	public void testGetValor() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setValor(double)}.
	 */
	@Test
	public void testSetValor() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getM_Categoria()}.
	 */
	@Test
	public void testGetM_Categoria() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setM_Categoria(Dominio.Pergunta.Categoria)}.
	 */
	@Test
	public void testSetM_Categoria() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getM_Anexo()}.
	 */
	@Test
	public void testGetM_Anexo() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setM_Anexo(Dominio.Anexo.Anexo)}.
	 */
	@Test
	public void testSetM_Anexo() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getM_Resposta()}.
	 */
	@Test
	public void testGetM_Resposta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setM_Resposta(Dominio.Resposta.Resposta)}.
	 */
	@Test
	public void testSetM_Resposta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#getM_Usuario()}.
	 */
	@Test
	public void testGetM_Usuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#setM_Usuario(Dominio.Usuario.Usuario)}.
	 */
	@Test
	public void testSetM_Usuario() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#Pergunta()}.
	 */
	@Test
	public void testPergunta() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#alterarStatus(Dominio.Pergunta.Status)}.
	 */
	@Test
	public void testAlterarStatus() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	/**
	 * Test method for {@link Dominio.Pergunta.Pergunta#anexarDocumento(Dominio.Anexo.Anexo)}.
	 */
	@Test
	public void testAnexarDocumento() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

}
