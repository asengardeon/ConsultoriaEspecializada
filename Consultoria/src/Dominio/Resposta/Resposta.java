package Dominio.Resposta;
import Dominio.Anexo.Anexo;
import Dominio.Pergunta.Pergunta;
import Dominio.Usuario.Usuario;

import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Resposta {

	private List<Anexo> anexo;
	private Usuario autor;
	private String descricao;
	private boolean escolhida = false;
	private long id;
	private double numeroHoras;
	private Pergunta pergunta;
	private double valor;
	public Anexo m_Anexo;
	public Usuario m_Usuario;

	public Resposta(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param documento
	 */
	public void anexarDocumento(Anexo documento){

	}

	public void persist(){

	}
}//end Resposta