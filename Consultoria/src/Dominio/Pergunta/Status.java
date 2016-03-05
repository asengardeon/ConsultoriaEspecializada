package Dominio.Pergunta;

/**
 * @author Leandro
 * @version 1.0
 * @created 04-mar-2016 21:59:32
 */
public enum Status {
	/**
	 * Significado dos tipos de status:
	 * - gerada: pergunta gerada mas sem nenhuma resposta cadastrada.
	 * - respondida: pergunta gerada e com resposta(s) efetuada(s).
	 * - a validar: pergunta gerada, resposta aceita, aguardando o retorno do usu�rio
	 * que respondeu a pergunta.
	 * - a finalizar: resposta confirmada pelo usu�rio que n�o gerou a pergunta mas
	 * n�o confirmada pelo usuario que n�o fez a pergunta.
	 * - finalizada: pergunta gerada, resposta aceita e confirma��o de ambos os
	 * usu�rios de que a resposta foi efetuada.
	 * - cancelada: pergunta gerada e, por algum motivo, processo cancelado.
	 */
	gerada,
	/**
	 * Significado dos tipos de status:
	 * - gerada: pergunta gerada mas sem nenhuma resposta cadastrada.
	 * - respondida: pergunta gerada e com resposta(s) efetuada(s).
	 * - a validar: pergunta gerada, resposta aceita, aguardando o retorno do usu�rio
	 * que respondeu a pergunta.
	 * - a finalizar: resposta confirmada pelo usu�rio que n�o gerou a pergunta mas
	 * n�o confirmada pelo usuario que n�o fez a pergunta.
	 * - finalizada: pergunta gerada, resposta aceita e confirma��o de ambos os
	 * usu�rios de que a resposta foi efetuada.
	 * - cancelada: pergunta gerada e, por algum motivo, processo cancelado.
	 */
	respondida,
	/**
	 * Significado dos tipos de status:
	 * - gerada: pergunta gerada mas sem nenhuma resposta cadastrada.
	 * - respondida: pergunta gerada e com resposta(s) efetuada(s).
	 * - a validar: pergunta gerada, resposta aceita, aguardando o retorno do usu�rio
	 * que respondeu a pergunta.
	 * - a finalizar: resposta confirmada pelo usu�rio que n�o gerou a pergunta mas
	 * n�o confirmada pelo usuario que n�o fez a pergunta.
	 * - finalizada: pergunta gerada, resposta aceita e confirma��o de ambos os
	 * usu�rios de que a resposta foi efetuada.
	 * - cancelada: pergunta gerada e, por algum motivo, processo cancelado.
	 */
	aValidar,
	/**
	 * Significado dos tipos de status:
	 * - gerada: pergunta gerada mas sem nenhuma resposta cadastrada.
	 * - respondida: pergunta gerada e com resposta(s) efetuada(s).
	 * - a validar: pergunta gerada, resposta aceita, aguardando o retorno do usu�rio
	 * que respondeu a pergunta.
	 * - a finalizar: resposta confirmada pelo usu�rio que n�o gerou a pergunta mas
	 * n�o confirmada pelo usuario que n�o fez a pergunta.
	 * - finalizada: pergunta gerada, resposta aceita e confirma��o de ambos os
	 * usu�rios de que a resposta foi efetuada.
	 * - cancelada: pergunta gerada e, por algum motivo, processo cancelado.
	 */
	aFinalizar,
	/**
	 * Significado dos tipos de status:
	 * - gerada: pergunta gerada mas sem nenhuma resposta cadastrada.
	 * - respondida: pergunta gerada e com resposta(s) efetuada(s).
	 * - a validar: pergunta gerada, resposta aceita, aguardando o retorno do usu�rio
	 * que respondeu a pergunta.
	 * - a finalizar: resposta confirmada pelo usu�rio que n�o gerou a pergunta mas
	 * n�o confirmada pelo usuario que n�o fez a pergunta.
	 * - finalizada: pergunta gerada, resposta aceita e confirma��o de ambos os
	 * usu�rios de que a resposta foi efetuada.
	 * - cancelada: pergunta gerada e, por algum motivo, processo cancelado.
	 */
	finalizada,
	/**
	 * Significado dos tipos de status:
	 * - gerada: pergunta gerada mas sem nenhuma resposta cadastrada.
	 * - respondida: pergunta gerada e com resposta(s) efetuada(s).
	 * - a validar: pergunta gerada, resposta aceita, aguardando o retorno do usu�rio
	 * que respondeu a pergunta.
	 * - a finalizar: resposta confirmada pelo usu�rio que n�o gerou a pergunta mas
	 * n�o confirmada pelo usuario que n�o fez a pergunta.
	 * - finalizada: pergunta gerada, resposta aceita e confirma��o de ambos os
	 * usu�rios de que a resposta foi efetuada.
	 * - cancelada: pergunta gerada e, por algum motivo, processo cancelado.
	 */
	cancelada
}