package Dominio.Feedback;
import Dominio.Pergunta.Pergunta;
import Dominio.Usuario.Usuario;
import Dominio.Notificacao.Notificacao;

import java.util.Date;
import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Feedback {

	private String descricao;
	private List<Usuario> destinatarios;
	private Date horario;
	private long id;
	private Pergunta pergunta;
	private Usuario remetente;
	public Usuario m_Usuario;
	public Notificacao m_Notificacao;

	public Feedback(){

	}

	public void finalize() throws Throwable {

	}
}//end Feedback