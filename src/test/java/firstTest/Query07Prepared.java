package firstTest;

import org.junit.Test;

import java.sql.*;

public class Query07Prepared {

    @Test
    public void test1() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."
        );

       //Statement statement=connection.createStatement();

        //statement.executeUpdate("INSERT INTO giderler VALUES(4,1669,'Yemek')");

        PreparedStatement prepared=connection.prepareStatement("INSERT INTO giderler VALUES(?,?,?)");

        prepared.setInt(1,5);
        prepared.setInt(2,1553);
        prepared.setString(3,"History");
        prepared.executeUpdate();

        connection.close();
        //statement.close();
        prepared.close();



    }
}
