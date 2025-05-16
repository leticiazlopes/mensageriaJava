import java.util.ArrayList;
import java.util.List;

public class MensagemResposta extends Mensagem { 
	public List<Mensagem> listaMsgOriginal = new ArrayList<>();
	
	public MensagemResposta (Usuario autor, String texto, Mensagem listamsgOriginal) {
        super(texto, autor);
        autor.adicionarMensagem(this);
		listaMsgOriginal.add(listamsgOriginal);
    }



	@Override
	public String getTexto() {
		return texto;
	}

	@Override
	public Usuario getAutor() {
		return autor;
	}

	@Override
    public String toString() {
        return infotoString();
    }

}
