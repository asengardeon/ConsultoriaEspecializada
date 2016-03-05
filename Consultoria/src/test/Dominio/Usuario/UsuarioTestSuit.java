package test.Dominio.Usuario;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Dominio.Usuario.TipoUsuario;

@RunWith(Suite.class)
@SuiteClasses({
	UsuarioTest.class, 
	SexoTest.class,
	TipoUsuarioTest.class	
})
public class UsuarioTestSuit {

}
