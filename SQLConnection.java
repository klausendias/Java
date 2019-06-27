import java.sql.*;
public class SQLConnection{
  public static void main(String [] args){
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/nationwide","root","P27084");
      stmt = conn.createStatement();
      stmt.executeUpdate("insert into school values(001,'Klaus', 97)");
      rs.close();
      stmt.close();
      conn.close();
    }catch(Exception se){
      System.out.println(se.toString());
    }
  }
}