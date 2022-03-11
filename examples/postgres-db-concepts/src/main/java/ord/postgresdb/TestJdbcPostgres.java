package ord.postgresdb;

import java.sql.*;

public class TestJdbcPostgres {

    public static void main(String[] args) throws SQLException {

       Connection conn=  DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","data123");

       Statement st = conn.createStatement();

       ResultSet result = st.executeQuery("select * from student");

       while(result.next()){
           System.out.println(result.getString("sname"));
       }
    }
}
