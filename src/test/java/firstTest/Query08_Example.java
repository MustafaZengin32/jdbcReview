package firstTest;

import org.junit.Test;
import pojo.Havacilar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Query08_Example {

    @Test
    public void test1() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(

                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."
        );

        Statement statement= connection.createStatement();

        statement.execute("CREATE TABLE havaciva (id integer,isim varchar(50),soyisim varchar(50),sinif varchar(50))");

        List<Havacilar> havacim=new ArrayList<>();

        havacim.add(new Havacilar(1,"ali","can","levazim"));
        havacim.add(new Havacilar(1,"veli","yildirim","pilot"));
        havacim.add(new Havacilar(1,"ziya","cerit","savunma"));
        havacim.add(new Havacilar(1,"nasuh","cakin","ikmal"));

        PreparedStatement prepared=connection.prepareStatement("INSERT INTO havaciva VALUES(?,?,?,?)");

        for (Havacilar w:havacim) {

            prepared.setInt(1,w.getId());
            prepared.setString(2,w.getIsim());
            prepared.setString(3,w.getSoyisim());
            prepared.setString(4,w.getSinif());

            prepared.addBatch();

        }

        prepared.executeBatch();

        connection.close();
        statement.close();
        prepared.close();








    }
}
