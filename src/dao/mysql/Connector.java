package dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

	private static String DRIVER = "";
    private static String URL = "";
    private static String USER = "";
    private static String PASSWORD = "";
	
    public static void init(String driver, String url, String user, String password ) throws ClassNotFoundException {
        DRIVER = driver;
        URL = url;
        USER = user;
        PASSWORD = password;
    	Class.forName(DRIVER);
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
	
}
