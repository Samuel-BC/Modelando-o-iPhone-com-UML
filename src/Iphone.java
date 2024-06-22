public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void ligar(String numero) {
        System.out.println("Ligar");
    }

    public void atender(String numero) {
        System.out.println("Atender Ligação");
    }

    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        System.out.println("Deixar uma mensagem de voz");
    }

    public void exibirPagina() {
        System.out.println("www.google.com/search");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova página");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void tocar() {
        System.out.println("Tocando");
    }

    public void pausar() {
        System.out.println("Pausando");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando");
    }
}
