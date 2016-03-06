package Dominio.Notificacao;
import Dominio.Pergunta.Pergunta;
import Dominio.Resposta.Resposta;
import Dominio.Usuario.Usuario;

import java.util.Date;
import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Notificacao {

	private String descricao;
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(List destinatario) {
		this.destinatario = destinatario;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public Usuario getRemetente() {
		return remetente;
	}

	public void setRemetente(Usuario remetente) {
		this.remetente = remetente;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Pergunta getM_Pergunta() {
		return m_Pergunta;
	}

	public void setM_Pergunta(Pergunta m_Pergunta) {
		this.m_Pergunta = m_Pergunta;
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

	private List destinatario;
	private Date horario;
	private long id;
	private Pergunta pergunta;
	private Usuario remetente;
	private String titulo;
	public Pergunta m_Pergunta;
	public Resposta m_Resposta;
	public Usuario m_Usuario;

	public Notificacao(){

	}

	public void finalize() throws Throwable {

	}
}//end Notificacao