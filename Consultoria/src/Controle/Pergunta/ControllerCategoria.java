package Controle.Pergunta;

import Dominio.Pergunta.Categoria;
import Dominio.Pergunta.Tarifa;

import java.util.List;

/**
 * @author Alex Michelon
 * @version 1.0
 * @created 04-mar-2016 21:59:31
 */
public class ControllerCategoria {

	public ControllerTarifa m_ControllerTarifa;

	public ControllerCategoria(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param categoria
	 */
	public void alterarCategoria(Categoria categoria){

	}

	/**
	 * 
	 * @param idCategoria
	 */
	public Categoria buscarCategoria(long idCategoria){
		return null;
	}

	/**
	 * 
	 * @param idUsuario
	 */
	public List<Categoria> buscarCategoriaUsuario(long idUsuario){
		return null;
	}

	public List<Categoria> buscarTodasCategorias(){
		return null;
	}

	/**
	 * 
	 * @param idCategoria
	 */
	public void excluirCategoria(long idCategoria){

	}

	/**
	 * 
	 * @param id
	 * @param nome
	 * @param descricao
	 * @param tarifa
	 */
	public void gerarCategoria(long id, String nome, String descricao, Tarifa tarifa){

	}
}//end ControllerCategoria