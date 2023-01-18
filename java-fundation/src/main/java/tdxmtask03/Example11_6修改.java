package tdxmtask03;

/**
 * @author MaxBrooks chentingxian195467@163.com
 * @version 2022/12/1 18:23
 * @since JDK17
 */

import javax.swing.*;

public class Example11_6修改 {
    public static void main(String args[]) {
        String [] tableHead;
        String [][] content;
        JTable table ;
        JFrame win= new JFrame();
        Query findRecord = new  Query();

        content = findRecord.getRecord();    //返回二维数组，即查询的全部记录
        tableHead=findRecord.getColumnName();  //返回全部字段名称
        table = new JTable(content,tableHead);
        win.add(new JScrollPane(table));
        win.setBounds(12,100,800,200);
        win.setVisible(true);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



