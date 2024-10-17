package firstTest;

import org.junit.Test;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class Query02 {

    @Test
    public void testName() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."
        );

        Statement statement = connection.createStatement();

        ResultSet resultSet=statement.executeQuery("select * from personel");

        while(resultSet.next()){
            System.out.println( + resultSet.getInt(1)+" "
                    + resultSet.getString(2)+" "
                    + resultSet.getString(3)+" "
                    + resultSet.getString(4)+" "
                    + resultSet.getString(5)+" "
                    + resultSet.getString(6)+" "
                    + resultSet.getString(7)+" "
                    + resultSet.getString(8)+" "
                    + resultSet.getString(9)+" "
                    + resultSet.getString(10)+" "
                    + resultSet.getString(11)+" "
                    + resultSet.getInt(12)+" "
                    + resultSet.getInt(13)+" "
                    + resultSet.getInt(14));
        }

        System.out.println("-------------------------------");

        //2.Sorgu

        ResultSet resultSet1=statement.executeQuery("SELECT*FROM personel WHERE cinsiyet='E'");

        while(resultSet1.next()){
            System.out.println( + resultSet1.getInt(1)+" "
                    + resultSet1.getString(2)+" "
                    + resultSet1.getString(3)+" "
                    + resultSet1.getString(4)+" "
                    + resultSet1.getString(5)+" "
                    + resultSet1.getString(6)+" "
                    + resultSet1.getString(7)+" "
                    + resultSet1.getString(8)+" "
                    + resultSet1.getString(9)+" "
                    + resultSet1.getString(10)+" "
                    + resultSet1.getString(11)+" "
                    + resultSet1.getInt(12)+" "
                    + resultSet1.getInt(13)+" "
                    + resultSet1.getInt(14));
        }


        connection.close();
        statement.close();
        resultSet.close();
        resultSet1.close();





    }


    }

