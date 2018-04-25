package sample;

import domain.Inventory;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Basket {
    ObservableList<Inventory> addedItems = FXCollections.observableArrayList();
    public void basketView(Inventory item){
        Stage stage = new Stage();
        Pane pane = new Pane();
        VBox vbox = new VBox();
        pane.getChildren().add(vbox);
        Scene scene = new Scene(pane,600,600);

        TableView<Inventory> basket = new TableView<>();
        basket.setItems(addedItems);

        TableColumn name = new TableColumn();
        name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Inventory,String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Inventory,String> param) {
                return param.getValue().getItemName();
            }
        });
        TableColumn description = new TableColumn();
        description.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Inventory,String>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Inventory,String> param) {
                return param.getValue().getItemDescription();
            }
        });
        TableColumn price = new TableColumn();
        price.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Inventory,Double>, ObservableValue<String>>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Inventory,Double> param) {
                return param.getValue().getItemPrice();
            }
        });

        Button checkOut = new Button("CheckOut");
        checkOut.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                basket.getItems();
            }
        });

        stage.setScene(scene);
        stage.setTitle("basket");
        stage.show();
    }
}
