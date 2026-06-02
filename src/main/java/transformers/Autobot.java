package transformers;

public class Autobot extends Transformer {
    private String teamName;
    private final String eyeColor = "Синий";
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(getName() + " трансформировался в транспортное средство");
    }
}