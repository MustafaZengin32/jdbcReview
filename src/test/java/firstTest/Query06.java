package firstTest;

import org.junit.Test;

import java.sql.*;

public class Query06 {

    @Test
    public void test1() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(

                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."

        );

        Statement statement =connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from ogrenci_bilgiler");

        ResultSetMetaData metaData = resultSet.getMetaData();

        System.out.println("metaData.getTableName().toUpperCase() = " + metaData.getTableName(1).toUpperCase());

        System.out.println("metaData.getColumnName(2).toLowerCase() = " + metaData.getColumnName(2).toLowerCase());


    }
}
