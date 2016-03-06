package Dominio.Feedback;
import Dominio.Pergunta.Pergunta;
import Dominio.Usuario.Usuario;
import Dominio.Notificacao.Notificacao;

import java.util.Date;
import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Feedback {

	private String descricao;
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Usuario> getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(List<Usuario> destinatarios) {
		this.destinatarios = destinatarios;
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

	public Usuario getM_Usuario() {
		return m_Usuario;
	}

	public void setM_Usuario(Usuario m_Usuario) {
		this.m_Usuario = m_Usuario;
	}

	public Notificacao getM_Notificacao() {
		return m_Notificacao;
	}

	public void setM_Notificacao(Notificacao m_Notificacao) {
		this.m_Notificacao = m_Notificacao;
	}

	private List<Usuario> destinatarios;
	private Date horario;
	private long id;
	private Pergunta pergunta;
	private Usuario remetente;
	public Usuario m_Usuario;
	public Notificacao m_Notificacao;

	public Feedback(){

	}

	public void finalize() throws Throwable {

	}
}//end Feedback