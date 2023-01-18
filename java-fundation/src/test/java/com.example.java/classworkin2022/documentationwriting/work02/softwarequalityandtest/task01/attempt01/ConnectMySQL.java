package com.example.java.classworkin2022.documentationwriting.work02.softwarequalityandtest.task01.attempt01;

import org.junit.jupiter.api.Test;

import java.sql.*;

/**
 * 从数据库中读取测试用例
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/20 23:20
 * @since JDK17
 */

public class ConnectMySQL {
    private Connection con= null;// 创建一个数据库连接;
    private ResultSet result = null;// 创建一个结果集对象
    private Statement stmt = null;
    // private String user = "sys as sysdba";
    private final String user = "root";
    private final String password = "Yuhuangtao111";
    private final String className = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    @Test
    public ResultSet ConnectMySQL(String BeachID) {
        try{
            Class.forName(className);// 加载Oracle驱动程序
            System.out.println("开始尝试连接数据库！");
            result=getCon(BeachID);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 创建数据库连接
     */
    public ResultSet getCon(String userId) {
        ResultSet rs=null;
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("创建数据库连接成功！");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql = "select * from testuser where user_id="+userId;
            rs= stmt.executeQuery(sql);
        } catch (SQLException e) {
            // System.out.print(con);
            // System.out.println("创建数据库连接失败！");
            con = null;
            e.printStackTrace();
        }
        return rs;
    }
    public void closed() {
        try {
            // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
            // 注意关闭的顺序，最后使用的最先关闭
            if (result != null)
                result.close();
            if(stmt!=null)
                stmt.close();
            if (con != null) {
                con.close();
                System.out.println("数据库连接已关闭！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
