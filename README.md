classDiagram
    class ReprodutorMusical {
        -ArteAlbuns
        -assistenteDeVoz
        -coverFlow
        -------------------
        +ajustarImagemWidescreen(boolean)
        +acharMusica(void)
        +tocarMusica(boolean)
        +tocarAudiobook(boolean)
        +tocarPodcast(boolean)
        +ligarFilme(boolean)
        +alterarVolume(int)
    }

    class AparelhoTelefonico {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class NavegadorInternet {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class iPhone {
        - so : String
        -------------
        + sincronizarItunes()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
