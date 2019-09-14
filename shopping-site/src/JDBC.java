import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","guptalost123");
		if(conn != null) {
			System.out.println("Connected");
		}else {
			System.out.println("Not Connected");
		}
		conn.close();
	}

}
