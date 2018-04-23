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


    User(String userName, String password, String forName, String surName, int phoneNO, String email,
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getForName() {
        return forName;
    }

    public void setForName(String forName) {
        this.forName = forName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(int phoneNO) {
        this.phoneNO = phoneNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
