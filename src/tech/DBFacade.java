package tech;
import java.sql.*;

class DBFasade {
    private Connection con;
    private final String username;
    private final String password;
    private final String port;
    private final String databaseName;

    public DBFasade() {
        this.username = "sa";
        this.password = "Horvathadam98";
        this.port = "1433";
        this.databaseName = "DB_FEB";
    }

    public void connect() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
        con = DriverManager.getConnection("jdbc:sqlserver://localhost:" + this.port + ";databaseName=" + this.databaseName, this.username, this.password);
    }

    public void displayMetaData() throws Exception {
        connect();
        DatabaseMetaData dbmd = con.getMetaData();

    }


    public static void main(String[] args) throws Exception {
        DBFasade app = new DBFasade();
        app.displayMetaData();
    }

}
