package sample;

import domain.Inventory;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tech.DBFacade;
import tech.DBSingleton;

import javax.swing.*;


public class PaymentView {

    public void payment(Inventory selectedItem)throws Exception{
        DBFacade e = DBSingleton.getInstance();
        Stage stage = new Stage();
        Pane pane = new Pane();
        VBox vBox = new VBox();
        pane.getChildren().add(vBox);
        Scene scene = new Scene(pane,600,600);

        Label name = new Label();
        name.setText(selectedItem.getName());
        Label description = new Label();
        description.setText(selectedItem.getDescription());
        Label price = new Label();
        price.setText(selectedItem.getItemPrice().toString());

        TextField amount = new TextField("amount");
        int count = Integer.parseInt(amount.getText());

        Button cancel = new Button("Cancel Payment");
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
            }
        });

        Button pay = new Button("Pay");
        pay.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               try {
           //        for (int i = 0; i < selectedItem.size(); i++) {
           //            e.updateItemAmount(selectedItem.get(i),count);
            //    }

                    int cost = Integer.parseInt(price.getText());
                    int finalPrice = count*cost;
                    JOptionPane invoice = new JOptionPane();
                    invoice.createDialog("Your payment is: "+finalPrice +" for " + amount+ " " +name);
                    stage.close();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });

        vBox.getChildren().addAll(name,description,price,amount,pay);
        stage.setScene(scene);
        stage.setTitle("payment");
        stage.show();
    }
}
