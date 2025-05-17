
/*
package aplicacao;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.config.EmbeddedConfiguration;

import modelo.Mensagem;
import modelo.MensagemOriginal;
import modelo.MensagemResposta;
import modelo.Usuario;

public class Util {
	private static ObjectContainer manager;

	public static ObjectContainer conectarBanco(){
		if (manager != null)
			return manager;		

		
		EmbeddedConfiguration config =  Db4oEmbedded.newConfiguration(); 
		config.common().messageLevel(0); 
		
		config.common().objectClass(Mensagem.class).cascadeOnDelete(false);;
		config.common().objectClass(Mensagem.class).cascadeOnUpdate(true);;
		config.common().objectClass(Mensagem.class).cascadeOnActivate(true);
		config.common().objectClass(MensagemOriginal.class).cascadeOnDelete(true);; //apaga tudo referenciado. se n existe msg original n precisa de resposta
		config.common().objectClass(MensagemOriginal.class).cascadeOnUpdate(true);;
		config.common().objectClass(MensagemOriginal.class).cascadeOnActivate(true);
		config.common().objectClass(MensagemResposta.class).cascadeOnDelete(false);; //msg resposta pode ser apagada, mas original continua (ex fórum
		config.common().objectClass(MensagemResposta.class).cascadeOnUpdate(true);;
		config.common().objectClass(MensagemResposta.class).cascadeOnActivate(true);;
		config.common().objectClass(Usuario.class).cascadeOnDelete(true);;
		config.common().objectClass(Usuario.class).cascadeOnUpdate(true);;
		config.common().objectClass(Usuario.class).cascadeOnActivate(true);;
		
		
		//conexao local
		manager = Db4oEmbedded.openFile(config, "banco.db4o");
		return manager;
	}

	public static void desconectar() {
		if(manager!=null) {
			manager.close();
			manager=null;
		}
	}
	
	
}
*/
