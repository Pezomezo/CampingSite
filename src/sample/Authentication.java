package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Authentication extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane,600,600);

        VBox vBox = new VBox();

        TextField username = new TextField();
        PasswordField password = new PasswordField();



       vBox.getChildren().addAll(username,password);
        pane.getChildren().add(vBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }
    public void checkUsername(){

    }
}
