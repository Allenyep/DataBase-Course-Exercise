package Sys.utils.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanjian on 16/9/14.
 * 功能：提供统一的查询、修改和插入方法
 */

public class SQLHelper<E> {
    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    /**
     * 数据查询
     *
     * @param sql
     * @return 返回结果集List<Object>
     */
    public List<E> query(String sql) {
        if (sql.equals("") || sql == null) {
            return null;
        }
        List<E> list = new ArrayList<>();
        try {
            conn = C3P0ConnentionProvider.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            // 可以得到有多少列
            int columnNum = rsmd.getColumnCount();
            // 将数据封装到list中
            while (rs.next()) {
                E[] objects = (E[]) new Object[columnNum];
                for (int i = 0; i < objects.length; i++) {
                    objects[i] = (E) rs.getObject(i + 1);
                }
                list.add((E) objects);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 插入、修改数据操作
     *
     * @param sql
     * @return boolean 成功返回true，失败返回false
     */
    public boolean update(String sql) {
        boolean b = false;
        if (sql.equals("") || sql == null) {
            return b;
        }
        try {
            conn = C3P0ConnentionProvider.getConnection();
            ps = conn.prepareStatement(sql);
            int i = ps.executeUpdate();
            if (i == 1) {
                b = true;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return b;
    }
}