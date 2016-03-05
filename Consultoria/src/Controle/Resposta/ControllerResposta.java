package Controle.Resposta;
import Controle.Anexo.ControllerAnexo;
import Controle.Feedback.ControllerFeedback;
import Controle.Notificacao.ControllerNotificacao;
import Dominio.Anexo.Anexo;
import Dominio.Pergunta.Pergunta;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

import java.util.List;

/**
 * @author Alex Michelon
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class ControllerResposta {

	public ControllerAnexo m_ControllerAnexo;
	public ControllerFeedback m_ControllerFeedback;
	public ControllerNotificacao m_ControllerNotificacao;

	public ControllerResposta(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param resposta
	 */
	public void alterarResposta(Resposta resposta){

	}

	/**
	 * 
	 * @param idResposta
	 */
	public Resposta buscarResposta(long idResposta){
		return null;
	}

	/**
	 * 
	 * @param idPergunta
	 */
	public List<Resposta> buscarRespostaPergunta(long idPergunta){
		return null;
	}

	/**
	 * 
	 * @param idUsuario
	 */
	public List<Resposta> buscarRespostaUsuario(long idUsuario){
		return null;
	}

	public List<Resposta> buscarTodasRespostas(){
		return null;
	}

	/**
	 * 
	 * @param idResposta
	 */
	public void excluirResposta(long idResposta){

	}

	/**
	 * 
	 * @param id
	 * @param autor
	 * @param descricao
	 * @param pergunta
	 * @param valor
	 * @param numeroHoras
	 * @param anexos
	 * @param escolhida
	 */
	public void gerarResposta(long id, Usuario autor, String descricao, Pergunta pergunta, double valor, double numeroHoras, List<Anexo> anexos, boolean escolhida){

	}
}//end ControllerResposta