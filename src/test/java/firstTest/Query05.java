package firstTest;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {

    @Test
    public void test() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(

                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."

        );

        Statement statement =connection.createStatement();

        // ingilizce_notu INT not null,not_ortalamasi REAL not null,
        // kulup_calismasi VARCHAR(50 ) not null,cinsiyet VARCHAR(5) not null,,bolum VARCHAR(50 ) not null

        String sql = "INSERT INTO ogrenci_bilgiler VALUES(34,58,'Gitar','Kadın','Matematik')";

        statement.execute(sql);

        connection.close();
        statement.close();
    }

    @Test
    public void test1() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(

                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."

        );

        Statement statement =connection.createStatement();


        String [] sql ={

                "insert into ogrenci_bilgiler values(40,79,'Yazılım','Erkek','Coğrafta Öğretmeneliği')",
                "insert into ogrenci_bilgiler values(34,58,'Yazılım','Kadın','Tarih Öğretmeneliği')",
                "insert into ogrenci_bilgiler values(34,58,'Yazılım','Erkek','Yaşlı Bakım')"

        };

        for (int i = 0; i <sql.length; i++) {

            statement.executeUpdate(sql[i]);

        }

        connection.close();
        statement.close();
    }

    @Test
    public void test2() throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection= DriverManager.getConnection(

                "jdbc:postgresql://localhost:5432/jdbcReview",
                "postgres",
                "Abc1299t."

        );

        Statement statement =connection.createStatement();


        String [] sql ={

                "insert into ogrenci_bilgiler values(19,91,'Satranç','Kadın','Kimya')",
                "insert into ogrenci_bilgiler values(50,47,'Satranç','Erkek','Rehberlik')",
                "insert into ogrenci_bilgiler values(33,40,'Satranç','Kadın','Turizm')"

        };

        for (String w:sql) {

            statement.addBatch(w);

        }

        statement.executeBatch();



        connection.close();
        statement.close();
    }




}
