import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;


public class koneksi {
    private static Connection con;
    public  static Connection getConnection()throws SQLException{
        if(con == null){
            new Driver();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gajikaryawan","root","");

        }
        return con;
    }
}
