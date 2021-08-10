
public class Gatto extends Animale{

    private String razza;

    public Gatto() {
        super("gatto");
    }

    public Gatto(String razza) {
        super("gatto");
        this.razza = razza;
    }

    public String verso() {
        return "miagola";
    }
    
    public String siMuove() {
    	return "corre";
    }
}
