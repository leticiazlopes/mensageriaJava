//package modelo;
import java.util.ArrayList;
import java.util.List;

public class MensagemOriginal extends Mensagem { 
	public List<MensagemResposta> listaMsgResposta = new ArrayList<>();
    
	public MensagemOriginal (Usuario autor, String texto) {
        super(texto, autor);
        autor.adicionarMensagem(this);
		this.listaMsgResposta = new ArrayList<>();
        //listaMsgResposta.add(new MensagemResposta(autor, texto));
    }

     public void adicionarResposta(MensagemResposta resposta) {
         listaMsgResposta.add(resposta);
    }

    @Override
    public String toString() {
        return "MensagemOriginal: " + texto;
    }

    

}


