public class Teste {
    public static void main(String[] args) {
        Usuario rafael = new Usuario("Rafinha123", "1234");
        Usuario lele = new Usuario("lelezinha", "1234");

        //Exemplo de fórum
        MensagemOriginal msg1 = new MensagemOriginal(rafael, "Oi, tudo bem?");
        MensagemResposta msg2 = new MensagemResposta(lele, "Oi, tudo bem. E você?", msg1);

        
        MensagemOriginal msg3 = new MensagemOriginal(rafael, "Estou bem!");

        System.out.print("Infos do Autor:");
        //System.out.println(lele);
        //System.out.print(" ");


        //System.out.print("Mensagem Original");
        //msg2.setTexto("N to bem");

        System.out.println(msg1);
        System.out.println(msg2);

        //System.out.print(" ");

        //System.out.println(msg2.listaMsgResposta);

        System.out.print("Infos do Autor atualizadas:");
        System.out.println(lele);





    }
}