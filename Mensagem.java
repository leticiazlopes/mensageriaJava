import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Mensagem {
	protected String datetime;
	public String texto;
	public Usuario autor;
	
	public Mensagem (String texto, Usuario autor) {
		this.datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		this.autor = autor;
		this.texto = texto;
	}

	public Usuario getAutor() {
        return autor;
    }

	public String getTexto() {
		return texto;
	}

	public String getDatetime() {
    	return datetime;
}

@Override
	public String toString() {
    return "MensagemOriginal [data=" + getDatetime() + "] : " + texto;
}




	
	
}