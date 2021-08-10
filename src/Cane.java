
public class Cane extends Animale {
    
    private String razza;

    public Cane() {
        super("cane");
    }

    public Cane(String razza) {
        super("cane");
        this.razza = razza;
    }

    public String verso() {
        return "abbaia";
    }
    
    public String siMuove() {
    	return "corre";
    }
}
