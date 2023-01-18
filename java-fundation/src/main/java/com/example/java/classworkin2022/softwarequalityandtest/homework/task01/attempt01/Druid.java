package com.example.java.classworkin2022.softwarequalityandtest.homework.task01.attempt01;

import java.sql.*;

/**
 * 数据库连接池
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/21 11:12
 * @since JDK17
 */

public class Druid {
    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    // 数据库的用户名与密码，需要根据自己的设置
    static final String user = "root";
    static final String password = "Yuhuangtao111";

    public static Connection getDBConnection(){
        Connection connection = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(driver);
            // 建立数据库连接
            connection = DriverManager.getConnection(url,user,password);
        }catch (ClassNotFoundException e){
            System.out.println("驱动器加载失败");
            e.printStackTrace();
        }catch (SQLException e){
            System.out.println("驱动器加载失败");
            e.printStackTrace();
        }
        return connection;
    }



    //释放连接资源
    public static void release(Connection conn, Statement st, ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }




    public static final String sql = "SELECT user_id,name,age FROM testuser";


    public static String[][] getData() throws SQLException{
        Connection connection = getDBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        int sum = 0;
        int row = 3;

        while (resultSet.next()){
            sum ++ ;
        }

        String[][] all = new String[sum + 1][row];
        int i = 0;
        // 展开结果集数据库
        while(resultSet.next()){
            // 通过字段检索
            int id = resultSet.getInt("user_id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");


            all[i][0] = String.valueOf(id);
            all[i][1] = name;
            all[i][2] = String.valueOf(age);

                    // 输出数据
            System.out.println("0user_id: " + all[i][0] + " 0姓名: " + all[i][1] + " 0年龄: " + all[i][2]);
//            System.out.println("user_id: " + id + " 姓名: " + name + " 年龄: " + age);
            i++;
        }
        release(connection,statement,resultSet);
        return all;
    }





}
