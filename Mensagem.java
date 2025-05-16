import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Mensagem {
	protected String datahora;
	public String texto;
	public Usuario autor;
	
	public Mensagem (String texto, Usuario autor) {
		this.datahora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		this.autor = autor;
		this.texto = texto;
	}

	public Usuario getAutor() {
        return autor;
    }

	public String getTexto() {
		return texto;
	}

	public String getDataHora() {
    	return datahora;
}

	public String infotoString() {
    return "MensagemOriginal [data=" + getDataHora() + "] : " + texto;
}




	
	
}