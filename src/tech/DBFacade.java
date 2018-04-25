package tech;
import domain.*;

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



        public void addItem(Inventory item) throws Exception {
        DB.insertSQL("INSERT INTO tblInventory VALUES ("+item.getItemID()+","+item.getTotalAmount()+","+item.getTotalAmount()+","+item.getPrice()+","+item.getDescription()+","+item.getAvailability()+","+item.getName()+","+item.getAmountInUse()+","+item.getDepartment()+")"  );

            Inventory.itemObsList.add(item);
    }

    public void addFacilities(Facilities facilitie) throws Exception {
        DB.insertSQL("INSERT INTO tblFacilities VALUES(");
        PreparedStatement ps = con.prepareCall("INSERT INTO tblFacilities VALUES (?,?,?,?)");
        ps.setInt(1,facilitie.getFacilID());
    }

    public void updateItemAmount(Inventory selectedItem,int amount) throws Exception {
        int newAmount = selectedItem.getTotalAmount()-amount;
        PreparedStatement ps = con.prepareCall("UPDATE tblInventory SET fld_ItemTotalAmount = ? WHERE fld_ItemID = ? ");
        ps.setInt(1,newAmount);
        ps.setInt(2,selectedItem.getItemID());
        ResultSet rs = ps.executeQuery();
        rs.close();
    }

    public void addCustomer(Customer customer) throws Exception {
        DB.insertSQL("INSERT INTO tblUser VALUES ("+customer.getUserName()+","+customer.getPassword()+","+customer.getForName()+","+customer.getSurName()+","+customer.getPhoneNO()+","+customer.getEmail()+","+customer.getSalary()+","+customer.getZipCode()+","+customer.getStreetName()+","+customer.getHouseNo()+","+customer.getDepartment());
    }


    public void addStaffMember(Staff staff) throws Exception {

        PreparedStatement staffPs = con.prepareCall("INSERT INTO tblUser VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
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


        PreparedStatement pss = con.prepareCall("INSERT INTO tblUser VALUES (?,?,?,?,?,?,?,?,?,?,?,NULL )");
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


    public static void main(String[] args) throws Exception {
        DBFacade app = new DBFacade();

    }

}
