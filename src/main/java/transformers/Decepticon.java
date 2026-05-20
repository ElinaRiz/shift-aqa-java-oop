package transformers;

public class Decepticon extends Transformer {
    private String teamName;
    private final String eyeColor = "Красный";
    private boolean kindness = false;

    public Decepticon(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    public void transform() {
        System.out.println(getName() + " трансформировался в наземный или воздушный транспорт, оружие, технику");
    }
}