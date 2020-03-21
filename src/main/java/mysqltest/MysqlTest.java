package mysqltest;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class MysqlTest {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
		String driver = "com.mysql.jdbc.Driver";
		String user = "root";
		String password = "root";
		
		Connection conn = null;
		
		PreparedStatement ps = null;
		
		try {
			
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, user, password);
			String sql = "select * from websites";
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String urls = rs.getString("url");
				int alexa = rs.getInt("alexa");
				String country = rs.getString("country");
				
				System.out.println("id" + " ------------- " + id  + " ------------- " + "name" + " ------------- " + name + " ------------- " + "url" + " ------------- " + urls + "alexa" + " ------------- " + alexa + " ------------- " + "country" + " ------------- " + country);
				
			}
			
			rs.close();
			ps.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				
				if(ps != null) ps.close();
				
			}catch (Exception e) {
				
			}
			try {
				
				if(conn != null) conn.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println();
		System.out.println("Goodbye!");
		
	}

}
