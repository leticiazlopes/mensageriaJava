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

	public String getDataHora() {
    	return datahora;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String infotoString() {
    	return getDataHora() + " " + autor + ": " + texto;
	}
	
}