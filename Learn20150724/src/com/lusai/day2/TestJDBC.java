package com.lusai.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:oral";
		String user = "lusai" ;
		String password = "123" ;
		String sql = "Select * from student" ;
		Connection ct = null;
		Statement sm = null;
		ResultSet rs = null;
		try {
			//1.��������
			Class.forName("Oracle.jdbc.driver.oracleDriver");
			//2.�õ�����
			ct = DriverManager.getConnection(url, user, password);
			//3.ȡ������
			sm = ct.createStatement();
			rs = sm.executeQuery(sql);
			while(rs.next()){
				String sname = rs.getString(2);
				System.out.println(sname);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				if(ct != null){
					ct.close();
				}if(sm != null){
					sm.close();
				}if(rs != null){
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
