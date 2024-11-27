package Controller;

import Model.DniCalculator;
import View.DniView;

public class DniController {   

    private final DniCalculator model;
    private final DniView view;
    public DniController(DniCalculator model, DniView view) {
        this.model = model;
        this.view = view;
    }
    public void run() {
        while (true) {
            try {
                int dniNumber = view.getDniInput();
                char letter = model.calculateDniLetter(dniNumber);
                view.displayDniLetter(letter);
                break;
            } catch (IllegalArgumentException e) {
                view.displayError(e.getMessage());
            }
        }
        view.close();
    }
}
    

