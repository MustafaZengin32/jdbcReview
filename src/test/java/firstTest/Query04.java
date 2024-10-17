package firstTest;

import org.junit.Test;

import java.sql.*;

public class Query04 {

    @Test
    public void testName() throws SQLException, ClassNotFoundException {

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."
        );

        Statement statement = connection.createStatement();

        ResultSet resultSet=statement.executeQuery("");





    }
}
