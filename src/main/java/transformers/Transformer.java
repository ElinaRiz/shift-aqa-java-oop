package transformers;

public abstract class Transformer {
    private String name;

    public Transformer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void transform();

    public void printInfo() {
        System.out.println("Имя: " + name);
    }
}