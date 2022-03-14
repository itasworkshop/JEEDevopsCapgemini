package ord.postgresdb;

import java.sql.*;

public class TestJdbcPostgres {

    public static void main(String[] args) throws SQLException {

       Connection conn=  DriverManager.getConnection("jdbc:postgresql://localhost:5432/","postgres","data123");

       Statement st = conn.createStatement();

       //int sucess =
               st.executeUpdate("insert into student values(666,'NewStu','NewSub',103)");

        //int sucess = st.executeUpdate("update student set sname= 'john' where st_id= 666");

        //insert,update and delete operation returns row count, so executeUpdate return 1 or more,zero
        //DDL like create table has no row count

        //int sucess = st.executeUpdate("create table demo(id int,name text)");

        int sucess = st.executeUpdate("delete from student");

       System.out.println("Rows changed "+sucess);
       ResultSet result = st.executeQuery("select * from student");

       while(result.next()){
           System.out.println(result.getString("sname"));
       }
    }
}
