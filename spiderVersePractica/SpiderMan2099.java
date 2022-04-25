public class SpiderMan2099 extends SpiderMan implements Poderes{
    SpiderMan2099(String nombre, String genero, String trage, int tierra){
        super(nombre, genero, trage, tierra);
    }

    public void telaraña() {
        System.out.println("Telaraña:" +
                "Telaraña Organica");
    }

    public void poderes() {
        System.out.println("Poderes" +
                "Además de las habilidades ya conocidas de su antepasado, posee teleraña orgánica " +
                "(producida por su cuerpo), colmillos venenosos, la capacidad de moverse tan rápido que puede " +
                "dejar tras de sí un señuelo, telepatía y... la tecnología futura que él puede desarrollar " +
                "con su traje, lo que incluye el dispositivo para viajar en el espacio-tiempo que lo incluyó" +
                " en el Spider-Verse");
    }
    void presentar(){
        poderes();
        telaraña();
    }


}
