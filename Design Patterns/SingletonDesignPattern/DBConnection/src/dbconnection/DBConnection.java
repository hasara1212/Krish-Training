/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection{

  private static DBConnection dbconnection;
  private Connection connection;
  private String url = "jdbc:mysql://localhost:3306/jdbc";
  private String username = "root";
  private String password = "root";
 
  private DBConnection() throws SQLException {
    try {
      Class.forName("org.mysql.Driver");
      this.connection = DriverManager.getConnection(url, username, password);
    } catch (ClassNotFoundException e) {
      System.out.println("Something is wrong with the DB connection " + e.getMessage());
    }
  }
  
   public Connection getConnection() {
    return connection;
  }
 
  public static DBConnection getInstance() throws SQLException {
    if (dbconnection == null) 
    {
        synchronized (DBConnection.class)
        {
          if (dbconnection == null)
              dbconnection = new DBConnection();
        }
    }  
    return dbconnection; 
    }
  
  public static void main(String args[]) throws SQLException
  {
      DBConnection dbconnection=DBConnection.getInstance();
      System.out.println(dbconnection);
      
      //For check singleton pattern is work correctly.
      DBConnection dbconnection02=DBConnection.getInstance();
      System.out.println(dbconnection);
  }
  
}
