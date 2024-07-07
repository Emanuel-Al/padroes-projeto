package padroes.projeto.adapter;

public class Main {
    public static void main(String[] args) {
        TomadaDoisPinos tomadaDoisPinos = new TomadaDoisPinos();
        TomadaTresPinos tomadaTresPinos = new TomadaTresPinos();

        BenjaminUniversal benjamin = new BenjaminUniversal();

        Tomada tomadaDoisPinosAdaptada = new AdaptadorTomadaDoisPinos(tomadaDoisPinos);
        Tomada tomadaTresPinosAdaptada = new AdaptadorTomadaTresPinos(tomadaTresPinos);

        benjamin.inicializar(tomadaDoisPinosAdaptada);
        benjamin.inicializar(tomadaTresPinosAdaptada);
    }
}
