package transformers;

public interface Action {
    default void run() {
        System.out.println("Трансформер бежит");
    }

    void fire();

    void charge();
}