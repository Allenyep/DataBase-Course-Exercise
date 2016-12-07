package Sys.utils.DB;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0ConnentionProvider {

    private static Connection conn;
    private static ComboPooledDataSource ds = new ComboPooledDataSource();

    public static Connection getConnection() {
        try {
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://123.207.83.185:3306/StdManaSys");
            ds.setUser("tanjian");
            ds.setPassword("1IrPhbaiVcEk");
            conn = ds.getConnection();
        } catch (SQLException | PropertyVetoException e) {
            e.printStackTrace();
        }
        return conn;
    }
}