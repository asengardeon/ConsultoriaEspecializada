package Dominio.Pergunta;

/**
 * @author Alex Michelon
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Regra {

	/**
	 * 1 - valor total do serviço
	 * 2 - número de horas trabalhadas do serviço
	 */
	private TipoValor condicao1;
	private double condicao2;
	private long id;
	/**
	 * Podem ser dos tipos:
	 * > (maior)
	 * <(menor)
	 * = (igual)
	 * >= (maior ou igual)
	 * <= (menor ou igual)
	 */
	private char operador;
	/**
	 * Podem ser dos tipos:
	 * E
	 * OU
	 * X (sem operador lógico)
	 */
	private char operadorLogico;
	private Tarifa tarifa;
	/**
	 * Valor a ser cobrado de acordo com a regra
	 */
	private double valorPercentual;
	public Tarifa m_Tarifa;

	public Regra(){

	}

	public void finalize() throws Throwable {

	}
}//end Regra