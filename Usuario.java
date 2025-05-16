import java.util.ArrayList;
import java.util.List;

public class Usuario {
	public String autor;
	public String telefone;
	public List<Mensagem> listaMsgUsuario = new ArrayList<>();
	
	public Usuario (String autor, String telefone) {
		this.autor = autor;
		this.telefone = telefone;
		this.listaMsgUsuario = new ArrayList<>();
	}

	public void adicionarMensagem(Mensagem m) {
		this.listaMsgUsuario.add(m);
    }

	public String getInfo() {
		return "Autor: " + this.autor + "\nTelefone: " + this.telefone + "\nMensagens enviadas pelo usuário: " + this.listaMsgUsuario;
	}
	

	
	
}