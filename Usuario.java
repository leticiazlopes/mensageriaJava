import java.util.ArrayList;
import java.util.List;

public class Usuario {
	public String apelido;
	public String telefone;
	public List<Mensagem> listaMsgUsuario = new ArrayList<>();
	
	public Usuario (String apelido, String telefone) {
		this.apelido = apelido;
		this.telefone = telefone;
		this.listaMsgUsuario = new ArrayList<>();
	}

	public void adicionarMensagem(Mensagem m) {
		this.listaMsgUsuario.add(m);
    }

	
    public String toString() {
        return apelido; // ou algo mais descritivo se preferir
    }

	public String getInfo() {
		return "Apelido: " + this.apelido;
	}
	

	
	
}