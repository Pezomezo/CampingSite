package domain;

public class Staff extends User {
    public Staff(String userName, String password, String forName, String surName, int phoneNO, String email, String role, int zipCode, String streetName, int houseNo, double salary, String department) {
        super(userName, password, forName, surName, phoneNO, email, role, zipCode, streetName, houseNo, salary, department);
    }
}
