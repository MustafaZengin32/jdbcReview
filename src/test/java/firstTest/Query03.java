package firstTest;

import org.junit.Test;

import java.sql.*;

public class Query03 {

    @Test
    public void testName() throws SQLException, ClassNotFoundException {


        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."
        );

        Statement statement = connection.createStatement();

        ResultSet resultSet=statement.executeQuery("select ogrenci_adi,ogrenci_soyadi from ogrenciler WHERE ogrenci_soyadi='Kara'");

        while (resultSet.next()){

            System.out.println(resultSet.getString(1)+" "
                               +resultSet.getString(2));
        }


        connection.close();
        statement.close();
        resultSet.close();










    }
}
