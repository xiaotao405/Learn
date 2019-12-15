package com.xiaotao.tools.db.jdbc.simpledemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;


public class SimpleJdbcDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://127.0.0.1/world";
		String name = "com.mysql.jdbc.Driver";
		String user = "xiaotao";
		String password = "xiaotao";
		String preparesql = "select * from world.city where CountryCode=?  limit ?;";
		String nativeSQL = "select * from world.city  limit 2";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet ret = null;
		Statement stat = null;

		try {

			Class.forName(name);// 指定连接类型
			conn = DriverManager.getConnection(url, user, password);// 获取连接

			/*---使用prepareStatement方式----------*/
			pst = conn.prepareStatement(preparesql);// 准备执行语句
			// 使用绑定变量方式
			pst.setString(1, "AFG");
			pst.setInt(2, 2);
			ret = pst.executeQuery();// 执行语句，得到结果集
			conn.setAutoCommit(false);

			while (ret.next()) {
				String ID = ret.getString(1);
				String Name = ret.getString(2);
				String CountryCode = ret.getString(3);
				String District = ret.getString(4);
				System.out.println(ID + "\t" + Name + "\t" + CountryCode + "\t" + District);
			} // 显示数据

			/*---使用native方式-----------------------*/
			System.out.println(conn.nativeSQL(nativeSQL));

			/*---statement方式--------------------*/
			System.out.println("---statement方式--------------------");
			stat = (Statement) conn.createStatement();
			ResultSet stateret = ((java.sql.Statement) stat).executeQuery(nativeSQL);
			stateret.next();
			System.out.println(stateret.getString(1));

			conn.commit();
			ret.close();
			pst.close();
			conn.close();// 关闭连接
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
