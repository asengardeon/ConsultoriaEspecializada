package Controle.Feedback;
import Controle.Notificacao.ControllerNotificacao;
import Dominio.*;
import Dominio.Pergunta.Pergunta;
import Dominio.Usuario.Usuario;

import java.util.Date;
import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:31
 */
public class ControllerFeedback {

	public ControllerNotificacao m_ControllerNotificacao;

	public ControllerFeedback(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param id
	 * @param remetente
	 * @param descricao
	 * @param horario
	 * @param destinatarios
	 * @param pergunta
	 */
	public void gerarFeedback(long id, Usuario remetente, String descricao, Date horario, List<Usuario> destinatarios, Pergunta pergunta){

	}
}//end ControllerFeedback