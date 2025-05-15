
import javax.swing.event.ListDataEvent;

public class Teste {
    public static void main(String[] args) {
        Usuario rafael = new Usuario("Rafinha123", "1234");
        Usuario lele = new Usuario("lelezinha", "1234");

        MensagemOriginal msg1 = new MensagemOriginal(rafael, "Oi, tudo bem?");
        MensagemResposta msg2 = new MensagemResposta(lele, "Oi, tudo bem. E você?");
        MensagemResposta msg3 = new MensagemResposta(rafael, "Estou bem!");

        System.out.println(rafael.getInfo());
        System.out.println(lele.getInfo());

        // System.out.println(msg1);
        System.out.println(msg1.listaMsgResposta);
        //System.out.println(msg2.listaMsgOriginal);



    }
}