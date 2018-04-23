package domain;

public class Administrator extends User {
    public Administrator(String userName, String password, String forName, String surName, int phoneNO, String email, String role, int zipCode, String streetName, int houseNo, double salary, String department) {
        super(userName, password, forName, surName, phoneNO, email,  role, zipCode, streetName, houseNo, salary, department);
    }
}
