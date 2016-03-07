package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testes.Controle.Anexo.ControllerAnexoTest;
import testes.Controle.Feedback.ControllerFeedbackTest;
import testes.Controle.Notificacao.ControllerNotificacaoTest;
import testes.Controle.Pergunta.ControllerCategoriaTest;
import testes.Controle.Pergunta.ControllerPerguntaTest;
import testes.Controle.Pergunta.ControllerRegraTest;
import testes.Controle.Pergunta.ControllerTarifaTest;
import testes.Controle.Resposta.ControllerRespostaTest;
import testes.Controle.Usuario.ControllerUsuarioTest;
import testes.Dominio.Anexo.AnexoTest;
import testes.Dominio.Feedback.FeedbackTest;
import testes.Dominio.Notificacao.NotificacaoTest;
import testes.Dominio.Pergunta.CategoriaTest;
import testes.Dominio.Pergunta.PerguntaTest;
import testes.Dominio.Pergunta.RegraTest;
import testes.Dominio.Pergunta.TarifaTest;
import testes.Dominio.Resposta.RespostaTest;
import testes.Dominio.Usuario.UsuarioTest;

@RunWith(Suite.class)
@SuiteClasses({
	ControllerAnexoTest.class,
	ControllerFeedbackTest.class,
	ControllerNotificacaoTest.class, 
	ControllerCategoriaTest.class,
	ControllerPerguntaTest.class,
	ControllerPerguntaTest.class,
	ControllerRegraTest.class,
	ControllerTarifaTest.class,
	ControllerRespostaTest.class,
	ControllerUsuarioTest.class,
	AnexoTest.class,
	FeedbackTest.class,
	NotificacaoTest.class,
	CategoriaTest.class,
	PerguntaTest.class,
	RegraTest.class,
	TarifaTest.class,
	RespostaTest.class,
	UsuarioTest.class
	
})
public class AllTestsSuite {
	

}
