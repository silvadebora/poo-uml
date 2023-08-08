class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void selecionarMusica(String musica) {
    }

    public void pausar() {
    }

    public void tocar() {
    }

    public void ligar(String numero) {
    }

    public void atender(String numero) {
    }

    public void desligar() {
    }

    public void iniciarCorreioVoz(){

    }

    public void exibirPagina(String url) {
    }

    public void adicionarNovaAba() {
    }

    public void atualizarPagina() {
    }
}

interface ReprodutorMusical {
    void selecionarMusica(String musica);

    void pausar();

    void tocar();
}

interface AparelhoTelefonico {
    void ligar(String numero);

    void atender(String numero);

    void desligar();

    void iniciarCorreioVoz();
}

interface NavegadorInternet {
    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();
}








