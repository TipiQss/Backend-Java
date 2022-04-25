class SpiderMan{
    String nombre, genero, trage;
    int tierra;

    SpiderMan(String nombre, String genero, String trage, int tierra){
        this.nombre= nombre;
        this.genero = genero;
        this.trage = trage;
        this.tierra = tierra;
    }

    public int getTierra() {
        return tierra;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTrage() {
        return trage;
    }

    void toPalabras(){
        System.out.println("Soy " + getNombre()+ " de la tierra "+ getTierra()+
                " Soy un " + getGenero() + " y mitrage es " +  getTrage());

    }
}


public class SpiderVerse {
    public static void main(String[] args) {
        CosmicSpiderMan cosmicSpiderMan = new CosmicSpiderMan("CosmicSpiderMan", "hombre", "Cosmico", 13);
        SpiderWolf spiderWolf = new SpiderWolf("SpiderWolf", "Hombre", "Lobo", 13989);
        SpiderMan2099 spiderMan2099 = new SpiderMan2099("SpiderMan2099", "Hombre", "Treje negro con rojo", 928);


        cosmicSpiderMan.toPalabras();
        cosmicSpiderMan.presentar();
        System.out.println("============================================");
        spiderWolf.toPalabras();
        spiderWolf.presentar();
        System.out.println("============================================");
        spiderMan2099.toPalabras();
        spiderMan2099.presentar();
    }

}
