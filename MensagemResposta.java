public class MensagemResposta extends Mensagem { 
<<<<<<< HEAD
	public MensagemOriginal MsgOriginal;
	
	public MensagemResposta (Usuario autor, String texto, MensagemOriginal original) {
=======
	public List<MensagemOriginal> listaMsgOriginal = new ArrayList<>();
	
	public MensagemResposta (Usuario autor, String texto) {
>>>>>>> fc6bcb0 (feat:subindo arquivo Util)
        super(texto, autor);
		this.MsgOriginal = original;
		original.adicionarResposta(this);
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
		return "[datahora=" + datahora + ", texto=" + texto + ", autor=" + autor + ", MsgOriginal="
				+ MsgOriginal.datahora + "]";
	}

	

}
