package com.xiaotao.tools.db.pool.druid;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class demo2_DruidConfigConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 建立工厂
		DruidDataSourceFactory factory = new DruidDataSourceFactory();
		Properties p = new Properties();
		InputStream in = demo2_DruidConfigConnect.class.getClassLoader().getResourceAsStream("druid.properties");
		try {
			// 读取配置文件中的信息
			p.load(in);
			DataSource dataSource = factory.createDataSource(p);
			Connection conn = dataSource.getConnection();
			PreparedStatement statement = conn.prepareStatement("select * from student");
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				System.out.println(result.getInt(1) + "," + result.getString(2) + "," + result.getString(3) + ","
						+ result.getInt(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
