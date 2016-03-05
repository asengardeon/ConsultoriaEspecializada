package Dominio.Usuario;
import Dominio.Pergunta.Categoria;
import Dominio.Pergunta.Pergunta;
import Dominio.Resposta.Resposta;

import java.util.Date;
import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Usuario {

	private String agencia;
	private int banco;
	private int conta;
	private String cpfcnpj;
	private Date dataNascimento;
	private char digitoContaCorrente;
	private String email;
	private int FeedBack;
	private byte foto;
	private long id;
	private String nome;
	private int numeroResidencia;
	private List<Pergunta> perguntas;
	private List<Resposta> respostas;
	private long telefone;
	private long telefone2;
	/**
	 * 1 - administrador
	 * 2 - usuario do sistema
	 */
	private int tipoUsuario;
	public Categoria m_Categoria;

	public Usuario(){

	}

	public void finalize() throws Throwable {

	}
	public void persist(){

	}
}//end Usuario