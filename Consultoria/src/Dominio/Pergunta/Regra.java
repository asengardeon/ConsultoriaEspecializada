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
	public TipoValor getCondicao1() {
		return condicao1;
	}

	public void setCondicao1(TipoValor condicao1) {
		this.condicao1 = condicao1;
	}

	public double getCondicao2() {
		return condicao2;
	}

	public void setCondicao2(double condicao2) {
		this.condicao2 = condicao2;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public char getOperador() {
		return operador;
	}

	public void setOperador(char operador) {
		this.operador = operador;
	}

	public char getOperadorLogico() {
		return operadorLogico;
	}

	public void setOperadorLogico(char operadorLogico) {
		this.operadorLogico = operadorLogico;
	}

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	public double getValorPercentual() {
		return valorPercentual;
	}

	public void setValorPercentual(double valorPercentual) {
		this.valorPercentual = valorPercentual;
	}

	public Tarifa getM_Tarifa() {
		return m_Tarifa;
	}

	public void setM_Tarifa(Tarifa m_Tarifa) {
		this.m_Tarifa = m_Tarifa;
	}

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