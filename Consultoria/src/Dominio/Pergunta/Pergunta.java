package Dominio.Pergunta;
import Dominio.Anexo.Anexo;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Pergunta {

	private List<Anexo> anexo;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Categoria getM_Categoria() {
		return m_Categoria;
	}

	public void setM_Categoria(Categoria m_Categoria) {
		this.m_Categoria = m_Categoria;
	}

	public Anexo getM_Anexo() {
		return m_Anexo;
	}

	public void setM_Anexo(Anexo m_Anexo) {
		this.m_Anexo = m_Anexo;
	}

	public Resposta getM_Resposta() {
		return m_Resposta;
	}

	public void setM_Resposta(Resposta m_Resposta) {
		this.m_Resposta = m_Resposta;
	}

	public Usuario getM_Usuario() {
		return m_Usuario;
	}

	public void setM_Usuario(Usuario m_Usuario) {
		this.m_Usuario = m_Usuario;
	}

	private Usuario autor;
	private String descricao;
	private long id;
	private List<Resposta> respostas;
	private Status status;
	private String titulo;
	private double valor;
	public Categoria m_Categoria;
	public Anexo m_Anexo;
	public Resposta m_Resposta;
	public Usuario m_Usuario;

	public Pergunta(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param status
	 */
	public void alterarStatus(Status status){

	}

	/**
	 * 
	 * @param documento
	 */
	public void anexarDocumento(Anexo documento){

	}

	public void persist(){

	}
}//end Pergunta