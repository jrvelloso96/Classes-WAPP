public class Whatsapp extends Mensagem {

    public Whatsapp(){

    }

 public void listarContatos(){
     Whatsapp whatsapp = new Whatsapp();
     whatsapp.nome = "Joao";
    System.out.println("Contato: " + whatsapp.nome);

}
public void listarMensagens(){
    Whatsapp whatsapp = new Whatsapp();
    whatsapp.conteudo = "Uma mensagem";
    whatsapp.horaEnvio = "10:00";
    System.out.println(whatsapp.conteudo);
    System.out.println(whatsapp.horaEnvio);



}
}
