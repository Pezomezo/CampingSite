package domain;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Inventory {
    private int itemID;
    private IntegerProperty itemTotalAmount;
    private DoubleProperty itemPrice;
    private StringProperty itemDescription;
    private StringProperty availableFor;
    private StringProperty itemName;
    private IntegerProperty ItemAmountInUse;
    private StringProperty department;
    public static ObservableList<Inventory> itemObsList;

    public Inventory(int itemID, int itemTotalAmount, double itemPrice, String itemDescription, String availableFor, String itemName, int itemAmountInUse, String department) {
        this.itemTotalAmount = new SimpleIntegerProperty(itemID);
        this.itemPrice = new SimpleDoubleProperty(itemPrice) ;
        this.itemDescription = new SimpleStringProperty(itemDescription);
        this.availableFor = new SimpleStringProperty(availableFor);
        this.itemName = new SimpleStringProperty(itemName);
        ItemAmountInUse = new SimpleIntegerProperty(itemAmountInUse);
        this.department = new SimpleStringProperty( department);
        itemObsList = FXCollections.observableArrayList();
    }

    public static ArrayList<Inventory> itemArrayList = new ArrayList<>();

    public IntegerProperty getItemTotalAmount() {
        return itemTotalAmount;
    }
    public int getTotalAmount(){
        return itemTotalAmount.get();
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setItemTotalAmount(int itemTotalAmount) {
        this.itemTotalAmount.set( itemTotalAmount);
    }

    public DoubleProperty getItemPrice() {
        return itemPrice;
    }

    public double getPrice(){
        return itemPrice.get();
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice.setValue(itemPrice);
    }

    public String getDescription(){
        return this.itemDescription.get();
    }

    public StringProperty getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription.set(itemDescription);
    }

    public StringProperty getAvailableFor() {
        return availableFor;
    }

    public String getAvailability(){
        return availableFor.get();
    }

    public void setAvailableFor(String availableFor) {
        this.availableFor.set(availableFor);
    }

    public String getName(){
        return this.itemName.get();
    }

    public StringProperty getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName.set(itemName);
    }

    public void setItemAmountInUse(int itemAmountInUse) {
        ItemAmountInUse.set(itemAmountInUse);
    }

    public int getAmountInUse(){
        return ItemAmountInUse.get();
    }

    public StringProperty getItemDepartment() {
        return department;
    }

    public String getDepartment(){
        return department.get();
    }

    public void setDepartment(String department) {
        this.department.set(department);
    }

    public IntegerProperty getItemAmountInUse() {
        return ItemAmountInUse;
    }
}
