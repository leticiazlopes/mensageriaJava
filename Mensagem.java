import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Mensagem {
	public String datahora;
	public String texto;
	public Usuario autor;
	
	public Mensagem (String texto, Usuario autor) {
		this.datahora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		this.texto = texto;
		this.autor = autor;
		autor.adicionarMensagem(this);
	}

	public Usuario getAutor() {
        return this.autor;
    }


	public String getTexto() {
		return texto;
	}

<<<<<<< HEAD
	public String getDataHora() {
    	return datahora;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String infotoString() {
    	return getDataHora() + " " + autor + ": " + texto;
	}
=======
	public String getDatetime() {
    	return datetime;
	}

	public void editarTexto(String novoTexto ) {
		this.texto=novoTexto;
	}



@Override
	public String toString() {
    return "MensagemOriginal [data=" + getDatetime() + "] : " + texto;
}
	
>>>>>>> fc6bcb0 (feat:subindo arquivo Util)
	
}