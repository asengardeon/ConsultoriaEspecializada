package testes.Dominio.Usuario;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Dominio.Pergunta.Pergunta;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.TipoUsuario;
import Dominio.Usuario.Usuario;


public class UsuarioTest {


	private static final int NUMERO_RESIDENCIA = 121;
	private static final int ID = 1;
	private static final int BANCO = 1;
	private static final int CONTA = 123;
	@SuppressWarnings("deprecation")
	private static final Date DATA_NASCIMENTO = new Date(1986, 05, 18);
	private static final int TELEFONE = 1236985;
	private static final int TELEFONE2 = 123654987;
	private static final byte FOTO = (byte) 2;
	private static final int FEEDBACK = 1;
	private static final char DIGITO_CONTA_CORRENTE = '1';
	private static final int TIPO_USUARIO = TipoUsuario.administrador.ordinal();
	private static final String USUÁRIO_1 = "usuário_1";
	private static final String EMAIL_DOMINIO_COM = "email@dominio.com";
	private static final String CPF = "11111111111";
	private static final String AGENCIA1 = "Agencia1";
	Usuario u;
	Pergunta perguntas;
	Resposta resposta;
	
	@SuppressWarnings("deprecation")
	@Before
	public void setup() {
		u = new Usuario();
		u.setAgencia(AGENCIA1);
		u.setBanco(BANCO);
		u.setConta(CONTA);
		u.setCpfcnpj(CPF);
		u.setDataNascimento(DATA_NASCIMENTO);
		u.setDigitoContaCorrente(DIGITO_CONTA_CORRENTE);
		u.setEmail(EMAIL_DOMINIO_COM);
		u.setFeedBack(FEEDBACK);
		u.setFoto(FOTO);
		u.setId(ID);
		u.setNome(USUÁRIO_1);
		u.setTelefone(TELEFONE);
		u.setTelefone2(TELEFONE2);
		u.setTipoUsuario(TIPO_USUARIO);
		u.setNumeroResidencia(NUMERO_RESIDENCIA);
	
		Pergunta perguntas = new Pergunta();
		Resposta resposta = new Resposta();
				
		perguntas.setAutor(u);
		perguntas.setDescricao("descrição pergunta");
		
		resposta.setDescricao("descrição resposta");
		ArrayList<Pergunta> per = new ArrayList<Pergunta>();
		ArrayList<Resposta> resp = new ArrayList<Resposta>();
		per.add(perguntas);
		resp.add(resposta);
		u.setPerguntas(per);
		u.setRespostas(resp);		
	}
	
	@After
	public void tearDown(){
		u = null;
	}
	
	@Test
	public void testGetAgencia() throws Exception {
		assertEquals(u.getAgencia(), AGENCIA1);
	}

	@Test
	public void testSetAgencia() throws Exception {
		u.setAgencia("OP1");
		assertEquals(u.getAgencia(), "OP1");
		
	}

	@Test
	public void testGetBanco() throws Exception {
		assertEquals(u.getBanco(), BANCO);
	}

	@Test
	public void testSetBanco() throws Exception {
		u.setBanco(3);
		assertEquals(u.getBanco(), 3);
		
	}

	@Test
	public void testGetConta() throws Exception {
		assertEquals(u.getConta(), CONTA);
	}

	@Test
	public void testSetConta() throws Exception {
		u.setConta(456);
		assertEquals(u.getConta(), 456);
	}

	@Test
	public void testGetCpfcnpj() throws Exception {
		assertEquals(u.getCpfcnpj(), CPF);
	}

	@Test
	public void testSetCpfcnpj() throws Exception {
		u.setCpfcnpj("12345678912");
		assertEquals(u.getCpfcnpj(), "12345678912");	
	}

	@Test
	public void testGetDataNascimento() throws Exception {
		assertEquals(u.getDataNascimento(), DATA_NASCIMENTO);
	}

	@Test
	public void testSetDataNascimento() throws Exception {
		@SuppressWarnings("deprecation")
		Date d = new Date(2013, 01, 30);
		u.setDataNascimento(d);
		assertEquals(u.getDataNascimento(), d);
		
	}

	@Test
	public void testGetDigitoContaCorrente() throws Exception {
		assertEquals(u.getDigitoContaCorrente(), DIGITO_CONTA_CORRENTE);
	}

	@Test
	public void testSetDigitoContaCorrente() throws Exception {
		u.setDigitoContaCorrente('c');
		assertEquals(u.getDigitoContaCorrente(), 'c');
		
	}

	@Test
	public void testGetEmail() throws Exception {
		assertEquals(u.getEmail(), EMAIL_DOMINIO_COM);
	}

	@Test
	public void testSetEmail() throws Exception {
		u.setEmail("novo@porai.com");
		assertEquals(u.getEmail(), "novo@porai.com");
	}

	@Test
	public void testGetFeedBack() throws Exception {
		assertEquals(u.getFeedBack(), FEEDBACK);
		
	}

	@Test
	public void testSetFeedBack() throws Exception {
		u.setFeedBack(23);
		assertEquals(u.getFeedBack(), 23);
		
	}

	@Test
	public void testGetFoto() throws Exception {
		assertEquals(u.getFoto(), FOTO);
	}

	@Test
	public void testSetFoto() throws Exception {
		u.setFoto((byte)7);
		assertEquals(u.getFoto(), (byte)7);
		
	}

	@Test
	public void testGetId() throws Exception {
		assertEquals(u.getId(), ID);
	}

	@Test
	public void testSetId() throws Exception {
		u.setId(10);
		assertEquals(u.getId(), 10);
		
	}

	@Test
	public void testGetNome() throws Exception {
		assertEquals(u.getNome(), USUÁRIO_1);
	}

	@Test
	public void testSetNome() throws Exception {
		u.setNome("João");
		assertEquals(u.getNome(), "João");
		
	}

	@Test
	public void testGetNumeroResidencia() throws Exception {
		assertEquals(u.getNumeroResidencia(), NUMERO_RESIDENCIA);
	}

	@Test
	public void testSetNumeroResidencia() throws Exception {
		
		u.setNumeroResidencia(874);
		assertEquals(u.getNumeroResidencia(), 874);
		
	}

	@Test
	public void testGetPerguntas() throws Exception {
		
	}

	@Test
	public void testGetTelefone() throws Exception {
		assertEquals(u.getTelefone(), TELEFONE);
	}

	@Test
	public void testSetTelefone() throws Exception {
		u.setTelefone(1123);
		assertEquals(u.getTelefone(), 1123);
		
	}

	@Test
	public void testGetTelefone2() throws Exception {
		assertEquals(u.getTelefone2(), TELEFONE2);
	}

	@Test
	public void testSetTelefone2() throws Exception {
		u.setTelefone2(88552);
		assertEquals(u.getTelefone2(), 88552);
		
	}

	@Test
	public void testGetTipoUsuario() throws Exception {
		assertEquals(u.getTipoUsuario(), TIPO_USUARIO);
	}

	@Test
	public void testSetTipoUsuario() throws Exception {
		u.setTipoUsuario(TipoUsuario.usuario.ordinal());
		assertEquals(u.getTipoUsuario(), TipoUsuario.usuario.ordinal());
	}

	
	@Test
	public void testUsuario() throws Exception {
		
	}

}
