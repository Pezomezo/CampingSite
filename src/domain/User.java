package domain;

public class User {
    private String userName;
    private String password;
    private String forName;
    private String surName;
    private int phoneNO;
    private String email;
    private String role;
    private int zipCode;
    private String streetName;
    private int houseNo;
    private double salary;
    private String Department;


    public User(String userName, String password, String forName, String surName, int phoneNO, String email,
                String role, int zipCode, String streetName, int houseNo, double salary, String department) {
        this.userName = userName;
        this.password = password;
        this.forName = forName;
        this.surName = surName;
        this.phoneNO = phoneNO;
        this.email = email;
        this.role = role;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.houseNo = houseNo;
        this.salary = salary;
        Department = department;
    }

}
