package tdxmtask03;

import java.sql.*;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/12/1 18:24
 * @since JDK17
 */

public class Query {
    //String databaseName="storemanagersystem";        //数据库名
    String SQL="SELECT * FROM library";            //SQL语句
    String [] columnName;        //全部字段（列）名
    String [][] record;          //查询到的记录


    public Query() {
        try{  Class.forName("com.mysql.cj.jdbc.Driver");//加载JDBC-MySQL驱动
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public String[] getColumnName() {
        if(columnName ==null ){
            System.out.println("先查询记录");
            return null;
        }
        return columnName;
    }

    public String[][] getRecord() {
        startQuery();
        return record;
    }
    static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    static final String DB_URL= "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "Yuhuangtao111";
    private void startQuery() {
        Connection con;
        Statement sql;
        ResultSet rs;
        String uri = "jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

        try {
            con= DriverManager.getConnection(DB_URL,"root","Yuhuangtao111");
            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);

            rs=sql.executeQuery(SQL);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();//字段数目
            columnName=new String[columnCount];
            for(int i=1;i<=columnCount;i++){
                columnName[i-1]=metaData.getColumnName(i);
            }
            rs.last();
            int recordAmount =rs.getRow();  //结果集中的记录数目
            record = new String[recordAmount][columnCount];
            int i=0;
            rs.beforeFirst();
            while(rs.next()) {
                for(int j=1;j<=columnCount;j++){
                    record[i][j-1]=rs.getString(j); //第i条记录，放入二维数组的第i行
                }
                i++;
            }
            con.close();
        }

        catch(SQLException e) {
            System.out.println("请输入正确的表名"+e);
        }
    }
}