package padroes.projeto.adapter;

public class AdaptadorTomadaDoisPinos implements Tomada {
    private TomadaDoisPinos tomadaDoisPinos;

    public AdaptadorTomadaDoisPinos(TomadaDoisPinos tomadaDoisPinos) {
        this.tomadaDoisPinos = tomadaDoisPinos;
    }
    public void ligarNaTomada() {
        tomadaDoisPinos.ligarNaTomada();
    }
}
