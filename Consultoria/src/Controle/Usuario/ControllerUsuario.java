package Controle.Usuario;
import Dominio.Pergunta.Categoria;
import Dominio.Usuario.Usuario;
import Controle.Pergunta.ControllerCategoria;
import Controle.Feedback.ControllerFeedback;

import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class ControllerUsuario {

	public Usuario m_Usuario;
	public ControllerCategoria m_ControllerCategoria;
	public ControllerFeedback m_ControllerFeedback;

	public ControllerUsuario(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param idUsuario
	 */
	public void alterarUsuario(long idUsuario){

	}

	/**
	 * 
	 * @param idUsuario
	 */
	public Usuario buscarUsuario(long idUsuario){
		return null;
	}

	/**
	 * 
	 * @param idUsuario
	 */
	public void excluirUsuario(long idUsuario){

	}

	/**
	 * 
	 * @param id
	 * @param nome
	 * @param cpfcnpj
	 * @param endereco
	 * @param numeroResidencia
	 * @param telefone
	 * @param telefone2
	 * @param email
	 * @param banco
	 * @param agencia
	 * @param contacorrente
	 * @param tipoUsuario
	 * @param foto
	 * @param categorias
	 */
	public void gerarUsuario(long id, String nome, String cpfcnpj, String endereco, int numeroResidencia, long telefone, long telefone2, String email, int banco, int agencia, String contacorrente, int tipoUsuario, byte foto, List<Categoria
                > categorias){

	}

	/**
	 * 
	 * @param idUsuario
	 */
	public void promoverUsuario(long idUsuario){

	}
}//end ControllerUsuario