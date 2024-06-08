Exemplo de Diagrama UML (Mermaid)

classDiagram
    class ReprodutorMusical {
        +void tocar()
        +void pausar()
        +void selecionarMusica(String musica)
    }
    
    class AparelhoTelefonico {
        +void ligar(String numero)
        +void atender()
        +void iniciarCorreioVoz()
    }
    
    class NavegadorNaInternet {
        +void exibirPagina(String url)
        +void adicionarNovaAba()
        +void atualizarPagina()
    }

    class iPhone {
        ReprodutorMusical reprodutorMusical
        AparelhoTelefonico aparelhoTelefonico
        NavegadorNaInternet navegadorNaInternet
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorNaInternet

