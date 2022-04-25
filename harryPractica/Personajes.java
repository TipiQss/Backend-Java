public class Personajes {
    String nombre, patronus, casa, genero, boggart;

    Personajes(String nombre, String patronus, String casa, String genero, String boggart){
        this.nombre = nombre;
        this.patronus = patronus;
        this.casa = casa;
        this.genero = genero;
        this.boggart = boggart;
    }

    public String getNombre (){
        return  nombre;
    }
    public String getPatronus (){
        return  patronus;
    }
    public String getCasa (){
        return  casa;
    }
    public String getGenero (){
        return  genero;
    }
    public String getBoggart (){
        return  boggart;
    }

    public String presentacion(){

        return("Hola mi nombre es "+ getNombre()+ "y soy un "+getGenero()+
                ".\nMi casa, patronus y boggart son: " +
                getCasa()+","+ getPatronus()+
                ","+ getBoggart());
    }


    public static void main(String[] args) {

        Personajes harry = new Personajes("Harry", "Cierbo", "Grifindor", "hombre", "Voldemort");
        Personajes ron = new Personajes("Ron", "Jack Russell Terrie", "Grifindor", "hombre", "Acromantula");
        Personajes neville = new Personajes("Neville", "No corpóreo", "Grifindor", "hombre", "El profesor Severus Snape");
        Personajes hermione = new Personajes("Hermione", "Nutria", "Grifindor", "mujer", "La profesora McGonagall diciéndole que reprobó todo");
        Personajes dumbledore = new Personajes("Dumbledore", "Fenix", "Grifindor", "hombre", "El cuerpo de su hermana Ariana");

        System.out.println(harry.presentacion());
        System.out.println(ron.presentacion());
        System.out.println(neville.presentacion());
        System.out.println(hermione.presentacion());
        System.out.println(dumbledore.presentacion());

    }
}

