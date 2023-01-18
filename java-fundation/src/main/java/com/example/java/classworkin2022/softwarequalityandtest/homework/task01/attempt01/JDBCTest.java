package com.example.java.classworkin2022.softwarequalityandtest.homework.task01.attempt01;

import java.sql.*;

/**
 * 使用连接池读取数据库数据
 *
 * @author MaxBrooks chentingxian1954677@163.com
 * @version 2022/10/21 11:13
 * @since JDK17
 */

public class JDBCTest {

    public static final String sql = "SELECT user_id,name,age FROM testuser";


    public void getData() throws SQLException{
        Connection connection = Druid.getDBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        // 展开结果集数据库
        while(resultSet.next()){
            // 通过字段检索
            int id = resultSet.getInt("user_id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            // 输出数据
            System.out.println("user_id: " + id + " 姓名: " + name + " 年龄: " + age);
        }
        Druid.release(connection,statement,resultSet);
    }


    public void getData02() throws SQLException{
        Connection connection = Druid.getDBConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        // 展开结果集数据库
        while(resultSet.next()){
            // 通过字段检索
            int id = resultSet.getInt("user_id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            // 输出数据
            System.out.println("user_id: " + id + " 姓名: " + name + " 年龄: " + age);
        }
        Druid.release(connection,statement,resultSet);
    }


    public static void main(String[] args) {
        try {
            JDBCTest jdbcTest = new JDBCTest();
//            jdbcTest.getData();
            String[][] all = Druid.getData();
            int i = 0;
            while (i < 5){
                System.out.println("user_id: " + all[i][0] + " 姓名: " + all[i][1] + " 年龄: " + all[i][2]);
                i ++;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }




    }





}
