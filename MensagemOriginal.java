import java.util.ArrayList;
import java.util.List;

public class MensagemOriginal extends Mensagem { 
	public List<MensagemResposta> listaMsgResposta = new ArrayList<>();
    
	public MensagemOriginal (Usuario autor, String texto) {
        super(texto, autor);
        autor.adicionarMensagem(this);
        //listaMsgResposta.add(new MensagemResposta(autor, texto));
    }

    public void adicionarResposta(MensagemResposta msg) {
         listaMsgResposta.add(msg);
     }


    @Override
	public String toString() {
		return "MensagemOriginal [datahora=" + datahora + ", texto=" + texto + ", autor=" + autor
				+ ",\n listaMsgResposta=" + listaMsgResposta + "]";
	}
    
    

    

}


