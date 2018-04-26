package domain;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tech.DBFacade;

import java.util.Iterator;


public class AdminInventory extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception {


        Pane mainView = new Pane();

        VBox mainViewBox = new VBox();


        Scene mainScene = new Scene(mainView, 600, 600);

        TableView<Inventory> tv = new TableView();
        tv.setPrefSize(520, 520);


        TableColumn<Inventory, Number> itemIDtc = new TableColumn("ID");
        itemIDtc.setCellValueFactory(param -> param.getValue().itemIDProperty());



        TableColumn<Inventory, Number> itemTotalAmountTc = new TableColumn("Total item Amount");
        itemTotalAmountTc.setCellValueFactory(param -> param.getValue().itemTotalAmountProperty());



        TableColumn<Inventory, Number> itemPrice = new TableColumn("Price");
        itemPrice.setCellValueFactory(param -> param.getValue().itemPriceProperty());


        TableColumn<Inventory, String> itemIDesc = new TableColumn("Description");
        itemIDesc.setCellValueFactory(param -> param.getValue().itemDescriptionProperty());


        TableColumn<Inventory, String> itemType = new TableColumn("Type");
        itemType.setCellValueFactory(param -> param.getValue().itemNameProperty());



        TableColumn<Inventory, Number> itemAmountInUse = new TableColumn("Amount in Use");
        itemAmountInUse.setCellValueFactory(param -> param.getValue().itemAmountInUseProperty());



        TableColumn<Inventory, String> department = new TableColumn("Department");
        department.setCellValueFactory(param -> param.getValue().departmentProperty());





        tv.getColumns().addAll(itemIDtc, itemTotalAmountTc, itemPrice, itemIDesc, itemType, itemAmountInUse, department);
        tv.setItems(Inventory.itemObsList);


        tv.setEditable(true);

        Button add = new Button("Add");

        Button remove = new Button("Remove");






        mainViewBox.getChildren().addAll(tv, add, remove);

        mainView.getChildren().add(mainViewBox);

        Pane pane2 = new Pane();
        TextField txt1 = new TextField("Id");
        TextField txt2 = new TextField("Total amount");
        TextField txt3 = new TextField("Price");
        TextField txt4 = new TextField("Description");
        TextField txt5 = new TextField("Type");
        TextField txt6 = new TextField("Name");
        TextField txt7 = new TextField("Amount in use");
        TextField txt8 = new TextField("Department");

        Button add2 = new Button("Add");

        add2.setOnAction(event -> {



            Inventory item = new Inventory(Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()), Double.parseDouble(txt3.getText()), txt4.getText(), txt5.getText(),txt6.getText()    ,Integer.parseInt(txt7.getText()) ,txt8.getText() );
            Inventory.itemObsList.add(item);


            DBFacade update = new DBFacade();
            try {

                update.addToInventory(Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()) , Double.parseDouble(txt3.getText()), txt4.getText() ,  txt5.getText(),txt6.getText() , Integer.parseInt(txt7.getText()), txt8.getText());
            } catch (Exception e) {
                e.printStackTrace();
            }


            primaryStage.setScene(mainScene);
            primaryStage.show();


            ////Add to database

        });


        VBox vBox2 = new VBox();

        vBox2.getChildren().addAll(txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,add2);

        pane2.getChildren().add(vBox2);

        Scene scene2 = new Scene(pane2,600,600);




        add.setOnAction(event -> {

            primaryStage.setScene(scene2);
            primaryStage.show();

        });

        remove.setOnAction(event -> {

            Pane pane = new Pane();
            VBox vbox = new VBox();
            TextField idtxt = new TextField();
            Button ok = new Button("Ok");

            ok.setOnAction(event1 -> {

                Iterator<Inventory> iterator = Inventory.itemObsList.iterator();

                while(iterator.hasNext()){
                    if(iterator.next().getItemID()==Integer.parseInt(idtxt.getText())){

                        iterator.remove();

                        //remove database

                        primaryStage.setScene(mainScene);
                        primaryStage.show();

                    }


                }

                primaryStage.setScene(mainScene);
                primaryStage.show();
            });

            vbox.getChildren().addAll(idtxt,ok);

            pane.getChildren().add(vbox);

            Scene scene = new Scene(pane,600,600);

            primaryStage.setScene(scene);
            primaryStage.show();


        });


        primaryStage.setScene(mainScene);
        primaryStage.show();

    }









}
