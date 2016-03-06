package Dominio.Usuario;
import Dominio.Pergunta.Categoria;
import Dominio.Pergunta.Pergunta;
import Dominio.Resposta.Resposta;

import java.util.Date;
import java.util.List;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public class Usuario {

	private String agencia;
	private int banco;
	private int conta;
	private String cpfcnpj;
	private Date dataNascimento;
	private char digitoContaCorrente;
	private String email;
	private int FeedBack;
	private byte foto;
	private long id;
	private String nome;
	private int numeroResidencia;
	private List<Pergunta> perguntas;
	private List<Resposta> respostas;
	private long telefone;
	private long telefone2;
	/**
	 * 1 - administrador
	 * 2 - usuario do sistema
	 */
	private int tipoUsuario;
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getBanco() {
		return banco;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getDigitoContaCorrente() {
		return digitoContaCorrente;
	}

	public void setDigitoContaCorrente(char digitoContaCorrente) {
		this.digitoContaCorrente = digitoContaCorrente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFeedBack() {
		return FeedBack;
	}

	public void setFeedBack(int feedBack) {
		FeedBack = feedBack;
	}

	public byte getFoto() {
		return foto;
	}

	public void setFoto(byte foto) {
		this.foto = foto;
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

	public int getNumeroResidencia() {
		return numeroResidencia;
	}

	public void setNumeroResidencia(int numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}

	public List<Pergunta> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<Pergunta> perguntas) {
		this.perguntas = perguntas;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public long getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(long telefone2) {
		this.telefone2 = telefone2;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Categoria getM_Categoria() {
		return m_Categoria;
	}

	public void setM_Categoria(Categoria m_Categoria) {
		this.m_Categoria = m_Categoria;
	}
	public Categoria m_Categoria;

	public Usuario(){

	}

	public void finalize() throws Throwable {

	}
	public void persist(){

	}
}//end Usuario