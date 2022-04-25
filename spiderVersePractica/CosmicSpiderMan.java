public class CosmicSpiderMan extends SpiderMan implements Poderes{
    CosmicSpiderMan(String nombre, String genero, String trage, int tierra){
        super(nombre, genero, trage, tierra);
    }


    public void telaraña() {
        System.out.println("Telaraña:" +
                "puede modificar la estructura de su telaraña para que sea mucho mas peligrosa");
    }
    public void poderes() {

        System.out.println("Poderes" +
                "Posee los mismos poderes y habilidades del Spider-Man original (Tierra-616).\n" +
                "Aumento de fuerza considerable, teniendo la fuerza como para ganarle a un Galactus contenido hasta cierto punto.\n" +
                "También posee la habilidad de Volar.\n" +
                "Puede curar a los enfermos y heridos (incluso a los que están al borde de la muerte).\n" +
                "Puede darle poderes cósmicos limitados a otros seres vivos.\n" +
                "Puede respirar en el espacio todo el tiempo que desee estar por este.\n" +
                "Puede soporta la explosión de una supernova y salir sin ningún daño.\n" +
                "Disparar poderosos Rayos Cósmicos que destruyen planetoides, satélites y estrellas.\n" +
                "Posee el poder de la alteración molecular capaz de alterar todo tipo de cosas");

    }
    void presentar(){
        poderes();
        telaraña();
    }


}
