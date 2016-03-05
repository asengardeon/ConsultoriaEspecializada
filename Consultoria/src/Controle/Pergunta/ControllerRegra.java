package Controle.Pergunta;

import Dominio.Pergunta.Regra;
import Dominio.Pergunta.Tarifa;
import Dominio.Pergunta.TipoValor;

import java.util.List;

/**
 * @author Alex Michelon
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class ControllerRegra {

	public ControllerRegra(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param regra
	 */
	public void alterarRegra(Regra regra){

	}

	/**
	 * 
	 * @param idRegra
	 */
	public Regra buscarRegra(long idRegra){
		return null;
	}

	public List<Regra> buscarTodasRegras(){
		return null;
	}

	/**
	 * 
	 * @param idRegra
	 */
	public void excluirRegra(long idRegra){

	}

	/**
	 * 
	 * @param id
	 * @param condicao1
	 * @param operador
	 * @param condicao2
	 * @param operadorLogico
	 * @param valorPercentual
	 * @param taria
	 */
	public void gerarRegra(long id, TipoValor condicao1, char operador, double condicao2, char operadorLogico, double valorPercentual, Tarifa taria){

	}
}//end ControllerRegra