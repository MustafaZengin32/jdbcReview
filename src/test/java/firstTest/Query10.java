package firstTest;

import org.junit.Assert;
import org.junit.Test;
import utilities.DatabaseUtilty;
import utilities.JdbcUtils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DatabaseUtilty.*;
import static utilities.JdbcUtils.*;

public class Query10 {

    @Test
    public void  positiveTest1() {

        //connection kur,  create Statement, executeQuery kullanicagiz

        String hostName ="localhost";
        String databaseName ="jdbcReview";
        String userName ="postgres";
        String password ="Abc1299t.";


        connectToDataBase(hostName, databaseName, userName, password);

        createStatement();

        String query="SELECT * FROM ogrenci_bilgiler";

        ResultSet resultSet = JdbcUtils.executeQuery(query);
        int counter=0;

        try{
            while (resultSet.next()) {

                if (resultSet.getInt(1) == 15){
                    counter++;
                }
            }
        }catch (Exception exception){

        }

        assertTrue("Deneme databesinde aranan değer bulunamadı",counter>0);

        closeConnectionAndStatement();





    }

    @Test
    public void negativeTest1() {

        //connection-executeQuery

        createConnection();

        String query = "SELECT * FROM ogrenci_bilgiler";

        String column="kulup_calismasi";

        List<Object> columnData = getColumnData(query, column);

        System.out.println("columnData.get(0) = " + columnData.get(0));

        Assert.assertFalse(columnData.get(0) =="Maket");

        closeConnection();


    }

    @Test
    public void negativeTest2()  {

        String hostName ="localhost";
        String databaseName ="jdbcReview";
        String userName ="postgres";
        String password ="Abc1299t.";

        connectToDataBase(hostName, databaseName, userName, password);

        createStatement();

        String sql="SELECT * FROM ogrenci_bilgiler";

        String query="Binicilik";

        ResultSet resultSet=JdbcUtils.executeQuery(sql);

        int counter=0;
        try {
            while (resultSet.next()){
                System.out.println("Kulup Çalışmaları sütunundaki veriler = " + resultSet.getString(3));

                if (resultSet.getString(3).contains(query)){
                    counter++;
                }
            }

        }catch (Exception exception){

        }

        Assert.assertFalse(counter>0);



        closeConnectionAndStatement();




    }


}
