package cz.spsmb.ctvrtak.f_pop.f_card_game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;




public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        int cnt = 0;
        for (Cards card: Cards.values()) {
            Pane crd = card.getCard();
            crd.setLayoutX(cnt*Cards.width);
            root.getChildren().add(crd);
            cnt++;
        }
        Scene scena = new Scene(root);
        stage.setScene(scena);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
