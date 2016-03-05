package Dominio.Notificacao;
import Dominio.Pergunta.Pergunta;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

import java.util.Date;
import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Notificacao {

	private String descricao;
	private List destinatario;
	private Date horario;
	private long id;
	private Pergunta pergunta;
	private Usuario remetente;
	private String titulo;
	public Pergunta m_Pergunta;
	public Resposta m_Resposta;
	public Usuario m_Usuario;

	public Notificacao(){

	}

	public void finalize() throws Throwable {

	}
}//end Notificacao