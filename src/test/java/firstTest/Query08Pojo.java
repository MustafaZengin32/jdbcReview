package firstTest;

import org.junit.Test;
import pojo.Angaralilar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query08Pojo {

    @Test
    public void test1() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."
        );

        Statement statement=connection.createStatement();
        statement.execute("create table angaralilar (isim varchar(50), soyisim varchar (50))");


        List<Angaralilar> angaralilar=new ArrayList<>();

        angaralilar.add(new Angaralilar("Hakan", "Tanrıverdi"));
        angaralilar.add(new Angaralilar("Azra", "Can"));
        angaralilar.add(new Angaralilar("Yaşar", "Yılmaz"));
        angaralilar.add(new Angaralilar("Mert", "Şenses"));

        PreparedStatement prepared=connection.prepareStatement("INSERT INTO angaralilar VALUES (?,?)");

        for (Angaralilar w:angaralilar) {

            prepared.setString(1, w.getAd());
            prepared.setString(2, w.getSoyad());

            prepared.addBatch();
        }

        prepared.executeBatch();



        connection.close();
        statement.close();
        prepared.close();






    }
}
