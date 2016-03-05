package Dominio.Pergunta;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:31
 */
public class Categoria {

	private String descricao;
	private long id;
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tarifa getTarifa() {
		return tarifa;
	}

	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}

	public Tarifa getM_Tarifa() {
		return m_Tarifa;
	}

	public void setM_Tarifa(Tarifa m_Tarifa) {
		this.m_Tarifa = m_Tarifa;
	}
	private String nome;
	private Tarifa tarifa;
	public Tarifa m_Tarifa;

	public Categoria(){

	}

	public void finalize() throws Throwable {

	}
	public void persist(){

	}
}//end Categoria