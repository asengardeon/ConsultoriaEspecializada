package Dominio.Pergunta;
import Dominio.Anexo.Anexo;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Pergunta {

	private List<Anexo> anexo;
	private Usuario autor;
	private String descricao;
	private long id;
	private List<Resposta> respostas;
	private Status status;
	private String titulo;
	private double valor;
	public Categoria m_Categoria;
	public Anexo m_Anexo;
	public Resposta m_Resposta;
	public Usuario m_Usuario;

	public Pergunta(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param status
	 */
	public void alterarStatus(Status status){

	}

	/**
	 * 
	 * @param documento
	 */
	public void anexarDocumento(Anexo documento){

	}

	public void persist(){

	}
}//end Pergunta