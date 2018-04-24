package sample;

import domain.Inventory;
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

public class Shop {
    ObservableList<Inventory> items = FXCollections.observableArrayList();
    public void shopSetUp(){
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane,600,600);

        VBox vBox = new VBox();
        pane.getChildren().add(vBox);


        items.add(new Inventory(1, 5, 0, "Staff can use it to clean", "Staff", "Broom", 0, "Cleaning"));
        items.add(new Inventory(2, 50, 10, "fizzy water to drink", "Customers", "Fizzy Water", 0, null));
        items.add(new Inventory(3, 50, 15, "beverage", "Customers", "Fanta", 0, null));
        items.add(new Inventory(4, 50, 15, "beverage", "Customers", "Cola", 0, null));
        items.add(new Inventory(5, 50, 15, "beverage", "Customers", "FaxaCondi", 0, null));

        TableView<Inventory> customerShop = new TableView<>();

        TableColumn name = new TableColumn("name");
        name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Inventory,String>, ObservableValue>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Inventory,String> param) {
                return param.getValue().getItemName();
            }
        });

        TableColumn description = new TableColumn("description");
        name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Inventory,String>, ObservableValue>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Inventory,String> param) {
                return param.getValue().getItemDescription();
            }
        });

        TableColumn price = new TableColumn("price");
        name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Inventory,Integer>, ObservableValue>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Inventory,Integer> param) {
                return param.getValue().getItemPrice();
            }
        });
        customerShop.getColumns().addAll(name,description,price);
        customerShop.setItems(items);

        vBox.getChildren().addAll(customerShop);

        stage.setScene(scene);
        stage.setTitle("Shop");
        stage.show();
    }
}
