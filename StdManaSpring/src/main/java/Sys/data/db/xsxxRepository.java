package Sys.data.db;

import Sys.data.domain.xsxx;
import Sys.utils.DB.C3P0ConnentionProvider;
import Sys.utils.Security.EnDecryption;

import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanjian on 16/12/6.
 * xsxx学生信息持久层
 */
public class xsxxRepository implements Repository<xsxx>{
    private static Connection connection= C3P0ConnentionProvider.getConnection();

    @Override
    public int insert(xsxx xsxx) {
        String sql = "insert into xsxx (xs__xy_id, xs__zy_id, bj_code, xs_xh,\n" +
                "                  xy_id, zy_id, xs_xm, xs_xb, xs_csrq,\n" +
                "                  xs_jl, xs_pwd, xs_pwd_salt) " +
                "values(?,?,?,?,?,?,?,?,?,?,?,?)";
        int i=0;
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, xsxx.getXs_xy_id());
            pstmt.setString(2, xsxx.getXs_zy_id());
            pstmt.setString(3, xsxx.getBj_code());
            pstmt.setString(4, xsxx.getXs_xh());
            pstmt.setString(5, xsxx.getXy_id());
            pstmt.setString(6, xsxx.getZy_id());
            pstmt.setString(7, xsxx.getXs_xm());
            pstmt.setString(8, xsxx.getXs_xb());
            pstmt.setDate(9, (Date) xsxx.getXs_csrq());
            pstmt.setString(10, xsxx.getXs_jl());
            pstmt.setString(11, xsxx.getXs_pwd());
            pstmt.setString(12, xsxx.getXs_pwd_salt());
            i = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int update(xsxx xsxx) {
        return 0;
    }

    @Override
    public int delete(xsxx xsxx) {
        return 0;
    }

    @Override
    public List<xsxx> findAll() {
        String sql="SELECT xs__xy_id, xs__zy_id, bj_code, xs_xh,xy_id, zy_id, xs_xm, xs_xb, xs_csrq, xs_jl FROM xsxx";
        List<xsxx> lists=new ArrayList<>();
        PreparedStatement pstmt;
        try {
            pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
           // int col = rs.getMetaData().getColumnCount();
            while (rs.next()) {
               // int i=0;
              /*  for (int i = 1; i <col; i++) {
                 //   stringBuffer.append(rs.getString(i)+",");
                }*/
                lists.add(new xsxx(rs.getString(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5),rs.getString(6),
                        rs.getString(7),rs.getString(8),rs.getDate(9),
                        rs.getString(10),null,null));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lists;
    }

    @Override
    public String fondOneById(String id) {
        String sql = "select * from xsxx where xs_xh="+id;
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
        String sql="SELECT xs_pwd_salt FROM xsxx WHERE xs_xh="+name;
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

            String pwd_string=EnDecryption.Encryption(pwd+pwdsalt.toString());
            sqlstring="SELECT xs_xh FROM xsxx WHERE xs_xh='"+name+"'and xs_pwd='"+pwd_string+"'";
            pstmt = connection.prepareStatement(sqlstring);
            ResultSet resultSet = pstmt.executeQuery();
            if(resultSet.next()){
                state=true;
                //TODO:将当前用户写入Session
            }
        } catch (SQLException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            state= false;
        } finally {
            return state;
        }
    }
}
