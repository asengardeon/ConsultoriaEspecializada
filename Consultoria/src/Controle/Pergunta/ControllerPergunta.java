package Controle.Pergunta;
import Controle.Anexo.ControllerAnexo;
import Controle.Notificacao.ControllerNotificacao;
import Dominio.Anexo.Anexo;
import Dominio.Pergunta.Categoria;
import Dominio.Pergunta.Pergunta;
import Dominio.Pergunta.Status;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

import java.util.List;

/**
 * @author Alex Michelon
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class ControllerPergunta {

	public ControllerAnexo m_ControllerAnexo;
	public ControllerCategoria m_ControllerCategoria;
	public ControllerNotificacao m_ControllerNotificacao;

	public ControllerPergunta(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param pergunta
	 */
	public void alterarPergunta(Pergunta pergunta){

	}

	/**
	 * 
	 * @param idPergunta
	 */
	public void buscarPergunta(long idPergunta){

	}

	/**
	 * 
	 * @param idUsuario
	 */
	public List<Pergunta> buscarPerguntaUsuario(long idUsuario){
		return null;
	}

	public List<Pergunta> buscarTodasPerguntas(){
		return null;
	}

	/**
	 * 
	 * @param idPergunta
	 */
	public void excluirPergunta(long idPergunta){

	}

	/**
	 * 
	 * @param idPergunta
	 */
	public void finalizarPergunta(long idPergunta){

	}

	/**
	 * 
	 * @param id
	 * @param titulo
	 * @param descricao
	 * @param categoria
	 * @param autor
	 * @param status
	 * @param respostas
	 * @param anexos
	 * @param valor
	 */
	public void gerarPergunta(long id, String titulo, String descricao, Categoria categoria, Usuario autor, Status status, List<Resposta> respostas, List<Anexo> anexos, double valor){

	}
}//end ControllerPergunta