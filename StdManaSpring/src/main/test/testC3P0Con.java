import Sys.utils.DB.C3P0ConnentionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by tanjian on 16/12/6.
 */
public class testC3P0Con {
    public static void main(String [] args){
        try {
            Connection conn = C3P0ConnentionProvider.getConnection();
            PreparedStatement pst = conn.prepareStatement("select * from xsxx");
            ResultSet rs = pst.executeQuery();
            rs.next();
            System.out.println(Thread.currentThread().getName()+":"+rs.getString(1));
            try {
                Thread.sleep(10*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
