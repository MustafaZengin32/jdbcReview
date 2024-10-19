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


        //burada tablo olusturacagiz sorgu yapmayacagiz bu sebeple executequery kullanmayacagiz


        String sql="CREATE TABLE biskuvi (biskuvi_adi varchar (50), biskuvi_turu varchar (50))";

        //NOT
        // statement.execute => bu metot DDL komutlarında kullanır
        // statement.executeQuery => sorgu yaparken kullanılır

        statement.execute(sql);




    }

    @Test
    public void testName1() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

//2.Adım: Database'e Bağlan
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."
        );

//3. Adım: Statement Oluştur
        Statement statement = connection.createStatement();

//4.Adım: SQL sorgusunu çalıştır
        String sql = "ALTER TABLE biskuvi ADD biskuvi_agirligi REAL";

        statement.execute(sql);

    }

    @Test
    public void testName2() throws ClassNotFoundException,SQLException  {

        Class.forName("org.postgresql.Driver");

        Connection connection =DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."

        );

        Statement statement = connection.createStatement();

        String sql ="insert into biskuvi values ('sutlu_biskuvi', 'sutlu',100)";

        statement.execute(sql);




        connection.close();
        statement.close();


    }

    @Test
    public void testName3() throws ClassNotFoundException,SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection =DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."

        );

        Statement statement = connection.createStatement();

        String sql = "drop table biskuvi ";

        statement.execute(sql);

        connection.close();
        statement.close();




    }



    }


