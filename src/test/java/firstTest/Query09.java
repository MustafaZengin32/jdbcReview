package firstTest;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import static utilities.DatabaseUtilty.*;

public class Query09 {

    @Test
    public void test1() { //db e  baglan -getcolumn data

        createConnection();//db utility den

        String sql="SELECT * FROM ogrenci_bilgiler";

        String column="kulup_calismasi";

        //getColumnData(sql, column);-->icinde zaten executeQuery de var

        List<Object> columnDataKulupCalismasi = getColumnData(sql, column);//public static List<Object> getColumnData(String query, String column)

        System.out.println("columnDataKulupCalismasi = "+columnDataKulupCalismasi);

        Assert.assertTrue(columnDataKulupCalismasi.contains("Havacılık"));


        closeConnection();

    }
}
