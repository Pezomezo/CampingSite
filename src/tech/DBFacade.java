package tech;
import domain.Administrator;
import domain.Customer;
import domain.Staff;

import java.sql.*;

public class DBFacade {
    private Connection con;
    private final String username;
    private final String password;
    private final String port;
    private final String databaseName;

    DBFacade() {
        this.username = "CampingLog";
        this.password = "pezomezo";
        this.port = "1433";
        this.databaseName = "DBCAMPINGSITE";
    }
    private void connect() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        con = DriverManager.getConnection("jdbc:sqlserver://localhost:" + this.port + ";databaseName=" + this.databaseName, this.username, this.password);
    }

    public void addCustomer(Customer customer) throws Exception {
        connect();
        PreparedStatement ps = con.prepareCall("INSERT INTO tbl_User VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, customer.getUserName() );
        ps.setString(2, customer.getPassword() );
        ps.setString(3,customer.getForName());
        ps.setString(4,customer.getSurName());
        ps.setInt(5, customer.getPhoneNO());
        ps.setString(6,customer.getEmail());
        ps.setInt(7,(int)customer.getSalary());
        ps.setInt(8,customer.getZipCode());
        ps.setString(9,customer.getStreetName());
        ps.setInt(10,customer.getHouseNo());
        ps.setString(11,customer.getDepartment());

        ResultSet rs = ps.executeQuery();
        rs.close();
    }


    public void addStaffMember(Staff staff) throws Exception {
        connect();
        PreparedStatement staffPs = con.prepareCall("INSERT INTO tbl_User VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        staffPs.setString(1, staff.getUserName() );
        staffPs.setString(2, staff.getPassword() );
        staffPs.setString(3,staff.getForName());
        staffPs.setString(4,staff.getSurName());
        staffPs.setInt(5, staff.getPhoneNO());
        staffPs.setString(6,staff.getEmail());
        staffPs.setDouble(7,staff.getSalary());
        staffPs.setInt(8,staff.getZipCode());
        staffPs.setString(9,staff.getStreetName());
        staffPs.setInt(10,staff.getHouseNo());
        staffPs.setString(11,staff.getDepartment());

        ResultSet rs = staffPs.executeQuery();
        rs.close();
    }



    public void addAdministrator(Administrator administrator) throws Exception {
        connect();

        PreparedStatement pss = con.prepareCall("INSERT INTO tbl_User VALUES (?,?,?,?,?,?,?,?,?,?,?,NULL )");
        pss.setString(1, administrator.getUserName() );
        pss.setString(2, administrator.getPassword() );
        pss.setString(3,administrator.getForName());
        pss.setString(4,administrator.getSurName());
        pss.setInt(5, administrator.getPhoneNO());
        pss.setString(6,administrator.getEmail());
        pss.setDouble(7,administrator.getSalary());
        pss.setInt(8,administrator.getZipCode());
        pss.setString(9,administrator.getStreetName());
        pss.setInt(10,administrator.getHouseNo());
        pss.setString(11,administrator.getDepartment());

        ResultSet rs = pss.executeQuery();
        rs.close();
    }


    private void displayMetaData() throws Exception {
        connect();
        DatabaseMetaData dbmd = con.getMetaData();

    }


    public static void main(String[] args) throws Exception {
        DBFacade app = new DBFacade();
        app.displayMetaData();
    }

}
