public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Headstrong");

        
        meuIphone.ligar("21 970039589");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet com meu proprio site
        meuIphone.exibirPagina("https://tiendaexito.shop");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
