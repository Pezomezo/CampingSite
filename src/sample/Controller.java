package sample;

import domain.Inventory;
import javafx.application.Application;
import javafx.stage.Stage;
import tech.DBFacade;
import tech.DBSingleton;

public class Controller extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Inventory inventory;
        DBFacade e = DBSingleton.getInstance();
        e.addItem(new Inventory(0,20,23.4,"Broom for swiping the floor","Customers","Broom",0,null));

        Shop shop = new Shop();
        shop.shopSetUp();



    }
}
