package sample;

import domain.Inventory;
import javafx.beans.value.ObservableValue;
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

public class Shop {
    public void shopSetUp(){
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene scene = new Scene(pane,600,600);

        VBox vBox = new VBox();
        pane.getChildren().add(vBox);

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
        name.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Inventory,Double>, ObservableValue>() {
            @Override
            public ObservableValue call(TableColumn.CellDataFeatures<Inventory,Double> param) {
                return param.getValue().getItemPrice();
            }
        });

        Button addToBasket = new Button("Basket");
        addToBasket.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Basket basket = new Basket();
                basket.basketView(customerShop.getSelectionModel().getSelectedItem());
            }
        });

        Button buy = new Button("Buy");
        buy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){

                try {
                    Inventory toBeEdited = customerShop.getSelectionModel().getSelectedItem();
                    PaymentView paymentView = new PaymentView();
                    paymentView.payment(toBeEdited);
                } catch (Exception e) {
                    e.getCause();
                }
            }
        });

        customerShop.getColumns().addAll(name,description,price);
        customerShop.setItems(Inventory.itemObsList);

        vBox.getChildren().addAll(customerShop,buy,addToBasket);

        stage.setScene(scene);
        stage.setTitle("Shop");
        stage.show();
    }
}
