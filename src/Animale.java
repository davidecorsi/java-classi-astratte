public abstract class Animale {
    String regno;
    String classe;
    String specie;
    
    public Animale() {
        regno = "animale";
    }

    public Animale(String c) {
        regno = "animale";
        classe = c;
    }
    
    public Animale(String c, String s) {
        regno = "animale";
        classe = c;
        specie = s;
    }
    
    public void stampaDati(){
        System.out.print("regno " + regno);
        System.out.print(", " + "classe " + classe);
        System.out.println(", specie " + specie);
    }

    public abstract String siMuove();

    public abstract String verso();
}
