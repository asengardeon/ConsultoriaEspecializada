package Controle.Notificacao;

import Dominio.Notificacao.Notificacao;
import Dominio.Pergunta.Pergunta;
import Dominio.Usuario.Usuario;

import java.util.Date;
import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:31
 */
public class ControllerNotificacao {

	public ControllerNotificacao(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param idNotificacao
	 */
	public Notificacao buscarNotificacaoPergunta(long idNotificacao){
		long xidNotificacao =  idNotificacao;
		return null;
	}


	/**
	 * 
	 * @param idPergunta
	 */
	public List<Notificacao> buscarPergunta(long idPergunta){
		return null;
	}

	/**
	 * 
	 * @param remetente
	 * @param descricao
	 * @param destinatarios
	 * @param pergunta
	 */
	public void enviarEmail(Usuario remetente, String descricao, List<Usuario> destinatarios, Pergunta pergunta){

	}

	/**
	 * 
	 * @param id
	 * @param remetente
	 * @param titulo
	 * @param descricao
	 * @param horario
	 * @param destinatario
	 * @param pergunta
	 */
	public void gerarNotificacao(long id, Usuario remetente, String titulo, String descricao, Date horario, List<Usuario> destinatario, Pergunta pergunta){

	}
}//end ControllerNotificacao