package bank.management.system;

import java.sql.*;


public class conn {

     Connection connection;
     Statement statement;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","sayan@bit4517");
            statement=connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
