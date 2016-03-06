package Dominio.Resposta;
import Dominio.Anexo.Anexo;
import Dominio.Pergunta.Pergunta;
import Dominio.Usuario.Usuario;

import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Resposta {

	private List<Anexo> anexo;
	private Usuario autor;
	private String descricao;
	private boolean escolhida = false;
	private long id;
	private double numeroHoras;
	private Pergunta pergunta;
	public List<Anexo> getAnexo() {
		return anexo;
	}

	public void setAnexo(List<Anexo> anexo) {
		this.anexo = anexo;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isEscolhida() {
		return escolhida;
	}

	public void setEscolhida(boolean escolhida) {
		this.escolhida = escolhida;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(double numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Anexo getM_Anexo() {
		return m_Anexo;
	}

	public void setM_Anexo(Anexo m_Anexo) {
		this.m_Anexo = m_Anexo;
	}

	public Usuario getM_Usuario() {
		return m_Usuario;
	}

	public void setM_Usuario(Usuario m_Usuario) {
		this.m_Usuario = m_Usuario;
	}

	private double valor;
	public Anexo m_Anexo;
	public Usuario m_Usuario;

	public Resposta(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param documento
	 */
	public void anexarDocumento(Anexo documento){

	}

	public void persist(){

	}
}//end Resposta