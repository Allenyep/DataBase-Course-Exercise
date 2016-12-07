package Sys.data.db;

import Sys.data.domain.zg;
import Sys.utils.DB.C3P0ConnentionProvider;
import Sys.utils.DB.SQLHelper;
import Sys.utils.Security.EnDecryption;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by tanjian on 16/12/7.
 * 职工实体持久层
 */
public class zgRepository extends SQLHelper<zg> implements Repository<zg> {
    private static Connection connection= C3P0ConnentionProvider.getConnection();

    @Override
    public int insert(zg zg) {
        return 0;
    }

    @Override
    public int update(zg zg) {
        return 0;
    }

    @Override
    public int delete(zg zg) {
        return 0;
    }

    @Override
    public List<zg> findAll() {
        String sql="SELECT xy_xy_id, zg_code, xy_id, zg_name,\n" +
                "                zg_xb, zg_ms, zg_csrq, zg_xl,\n" +
                "                zg_zc, zg_zzmm FROM zg";
        List<zg> lists=query(sql);
        return lists;
    }

    @Override
    public String fondOneById(String id) {
        String sql = "select * from zg where zg_code="+id;
        StringBuffer stringBuffer=new StringBuffer();
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <col; i++) {
                    stringBuffer.append(rs.getString(i)+",");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }

    public boolean loginValidate(String name,String pwd){
        String sql="SELECT zg_pwd_salt FROM zg WHERE zg_code="+name;
        String sqlstring;
        PreparedStatement pstmt;
        boolean state=false;
        StringBuffer pwdsalt=new StringBuffer();
        try {
            pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                pwdsalt.append(rs.getString(1));
            }

            String pwd_string= EnDecryption.Encryption(pwd+pwdsalt.toString());
            sqlstring="SELECT zg_code FROM zg WHERE zg_code='"+name+"'and zg_pwd='"+pwd_string+"'";
            pstmt = connection.prepareStatement(sqlstring);
            ResultSet resultSet = pstmt.executeQuery();
            if(resultSet.next()){
                state=true;
            }
        } catch (SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            state= false;
        } finally {
            return state;
        }
    }
}
