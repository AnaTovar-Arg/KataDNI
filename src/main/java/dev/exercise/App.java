package dev.exercise;

import Controller.DniController;
import Model.DniCalculator;
import View.DniView;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        DniCalculator model = new DniCalculator();
        DniView view = new DniView();
        DniController controller = new DniController(model, view);
        controller.run();
    }
}
