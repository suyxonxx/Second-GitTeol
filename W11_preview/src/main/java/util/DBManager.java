package util;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

public class DBManager {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext= (Context) initContext.lookup("java:/comp/env");
//			DataSource가 객체를 찾아서 jdbc/myoracle이란 이름을 받는다.
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
//			ds가 생성되었으므로 Connection을 구한다.
			conn = ds.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	} //end of getConnection
	
//	select문 수행 후 리소스 해제
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			conn.close();
			stmt.close();
			rs.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
//	DML(insert, update, delete) 수행 후 리소스 해제
	public static void close(Connection conn, Statement stmt) {
		try {
			conn.close();
			stmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
} //end of class DBManager
