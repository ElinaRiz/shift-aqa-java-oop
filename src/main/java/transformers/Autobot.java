package transformers;

public class Autobot extends Transformer implements Action {
    private String teamName;
    private final String eyeColor = "Синий";
    private boolean kindness = true;

    public Autobot(String name, String teamName) {
        super(name);
        this.teamName = teamName;
    }

    @Override
    public void run() {
        System.out.println(getName()  + " бежит");
    }

    @Override
    public void fire() {
        System.out.println(getName()  + " стреляет");
    }

    @Override
    public void charge() {
        System.out.println(getName()  + " заряжается");
    }

    @Override
    public void transform() {
        System.out.println(getName() + " трансформировался в транспортное средство");
    }

    @Override
    public void printInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Имя команды: " + teamName);
        System.out.println("Цвет глаз: " + eyeColor);
        System.out.println("Добрый?: " + kindness);
    }
}