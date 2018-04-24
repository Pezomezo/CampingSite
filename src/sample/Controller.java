package sample;

import domain.Inventory;
import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import tech.DBFacade;
import tech.DBSingleton;

import java.util.ArrayList;

public class Controller extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        DBFacade e = DBSingleton.getInstance();



    }
}
