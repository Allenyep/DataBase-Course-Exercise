package Sys.data.db;

import Sys.data.domain.jxjh;
import Sys.utils.DB.C3P0ConnentionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanjian on 16/12/10.
 */
public class jxjhRepository implements Repository<jxjh> {
    private static Connection connection = C3P0ConnentionProvider.getConnection();

    @Override
    public int insert(jxjh jxjh) {
        return 0;
    }

    @Override
    public int update(jxjh jxjh) {
        return 0;
    }

    @Override
    public int delete(jxjh jxjh) {
        return 0;
    }

    @Override
    public List<jxjh> findAll() {
        String sql = "SELECT jxjh_id,xy_id,zy_id,jxjh_mc,jxjh_date,jxjh_ms FROM jxjh";
        List<jxjh> lists = new ArrayList<>();
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
            //String jxjh_id, String xy_id,String zy_id, String jxjh_mc,String jxjh_date, String jxjh_ms
            lists.add(new jxjh(rs.getString(1), rs.getString(2),
                    rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lists;
    }

    @Override
    public String fondOneById(String id) {
        return null;
    }
}
