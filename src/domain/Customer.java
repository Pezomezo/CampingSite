package domain;

public class Customer extends User {
    public Customer(String userName, String password, String forName, String surName, int phoneNO, String email, String role, int zipCode, String streetName, int houseNo, double salary, String department) {
        super(userName, password, forName, surName, phoneNO, email, "Customer", zipCode, streetName, houseNo, 0, null);
    }
}
