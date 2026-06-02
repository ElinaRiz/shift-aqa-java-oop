import transformers.Autobot;
import transformers.Decepticon;

public class Main {
    public static void main(String[] args) {
        Autobot autobot = new Autobot("Бамблби", "Автоботы");
        autobot.run();
        autobot.fire();
        autobot.charge();
        autobot.transform();

        System.out.println();

        Decepticon decepticon = new Decepticon("Старскрим", "Десептиконы");
        decepticon.run();
        decepticon.fire();
        decepticon.charge();
        decepticon.transform();
    }
}