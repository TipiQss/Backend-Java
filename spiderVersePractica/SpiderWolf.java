public class SpiderWolf extends SpiderMan implements Poderes{
    SpiderWolf(String nombre, String genero, String trage, int tierra){
        super(nombre, genero, trage, tierra);
    }

    public void telaraña() {
        System.out.println("Telaraña:" +
                "No se conoce las estrutura de su telaraña o si tiene");

    }

    public void poderes() {
        System.out.println("Poderes:" +
                "Podría intuirse que la fuerza de la araña se mezcló con la de la" +
                " maldición de ser un hombre lobo, pero lo único que pudimos ver de él fue" +
                " cómo cayó ante la lanza del cazador de los Inheritors, Karn");

    }

    void presentar(){
        poderes();
        telaraña();
    }


}
