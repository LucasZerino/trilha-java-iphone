public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando funções de telefone
        meuIphone.ligar("11995381234");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando reprodutor musical
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando navegador
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        // Exibindo listas armazenadas
        meuIphone.listarContatos();
        meuIphone.listarMusicas();
        meuIphone.listarPaginas();
    }
}