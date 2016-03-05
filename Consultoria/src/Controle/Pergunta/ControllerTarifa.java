package Controle.Pergunta;

import Dominio.Pergunta.Tarifa;

import java.util.List;

/**
 * @author Alex Michelon
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class ControllerTarifa {

	public ControllerCategoria m_ControllerCategoria;
	public ControllerRegra m_ControllerRegra;

	public ControllerTarifa(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param tarifa
	 */
	public void alterarTarifa(Tarifa tarifa){

	}

	/**
	 * 
	 * @param idTarifa
	 */
	public Tarifa buscarTarifa(long idTarifa){
		return null;
	}

	public List<Tarifa> buscarTodasTarifas(){
		return null;
	}

	/**
	 * 
	 * @param idTarifa
	 */
	public void excluirTarifa(long idTarifa){

	}

	/**
	 * 
	 * @param id
	 * @param descricao
	 */
	public void gerarTarifa(long id, String descricao){

	}
}//end ControllerTarifa