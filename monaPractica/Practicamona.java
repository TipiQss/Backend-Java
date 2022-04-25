 class Mona{
    String nombren, accerorios;
    int numero;
    Mona(String nombre , int numero, String accerorios){}
    void actividad(){};
 }


public class Practicamona {

    public static void main(String[] args) {

        Mona bombero = new MonaBombero("Gato centinela", 141, "Manguera");
        Mona dino = new MonaDinosaurio("Dinotogato", 128, "Traje dinosaurio");
        Mona hulato = new MonaHulato("Hulatogato",137,"Guitarra, Falda hula, Flor" );
        Mona aventurero= new MonaAventurero("Aventurero", 68, "Gorro blanco, Mochila, Espada");
        Mona espectro = new MonaEspectro("Espectro", 44, "Tranlucido");
        Mona ironMona = new MonaHierro("Gato de Hierro", 24, "Traje de acero con propulsores");


        bombero.actividad();
        dino.actividad();
        hulato.actividad();
        aventurero.actividad();
        espectro.actividad();
        ironMona.actividad();

    }
}
