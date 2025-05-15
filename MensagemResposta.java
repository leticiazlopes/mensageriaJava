import java.util.ArrayList;
import java.util.List;

public class MensagemResposta extends Mensagem { 
	public List<MensagemOriginal> listaMsgOriginal = new ArrayList<>();
	public MensagemResposta (Usuario autor, String texto) {
        super(texto, autor);
        autor.adicionarMensagem(this);
		this.listaMsgOriginal = new ArrayList<>();
		//listaMsgOriginal.add(new MensagemOriginal(autor, texto));
    }

    public void addMensagemResposta(MensagemOriginal msg) {
        this.listaMsgOriginal.add(msg);
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
        return "MensagemResposta: " + texto;
    }

}
