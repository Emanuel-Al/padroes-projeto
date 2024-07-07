package padroes.projeto.adapter;

public class AdaptadorTomadaTresPinos implements Tomada {
    private TomadaTresPinos tomadaTresPinos;

    public AdaptadorTomadaTresPinos(TomadaTresPinos tomadaTresPinos) {
        this.tomadaTresPinos = tomadaTresPinos;
    }
    public void ligarNaTomada() {
        tomadaTresPinos.ligarNaTomada();
    }
}
