package com.xiaotao.tools.db.pool.druid;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

public class demo1_DruidDirectConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DruidDataSource dataSource = new DruidDataSource();
		// 获取驱动
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		// 建立连接
		dataSource.setUrl("jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC");
		dataSource.setUsername("xiaotao");
		dataSource.setPassword("xiaotao");
		try {
			// 获取连接
			DruidPooledConnection conn = dataSource.getConnection();
			PreparedStatement statement = conn.prepareStatement("select * from mysql.user where user=? ;");
			statement.setString(1, "xiaotao");
			ResultSet ret = statement.executeQuery();
			while (ret.next()) {
				String ID = ret.getString(1);
				System.out.println( ID);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			dataSource.close();
		}

	}

}
