import transformers.Autobot;
import transformers.Decepticon;
import transformers.Transformer;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println();
        List<Transformer> transformers = new ArrayList<>();
        transformers.add(autobot);
        transformers.add(decepticon);
        for (Transformer transformer : transformers) {
            transformer.printInfo();
            System.out.println();
        }
    }
}