package tech.washmore.blog.config;

import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Washmore
 * @version 1.0
 * @since 2015-01-01
 */
@Configuration
public class DataSourceConfig_ {

//    public static void main(String[] args) {
//        try {
//            // The SQLite (3.3.8) Database File
//            // This database has one table (pmp_countries) with 3 columns (country_id, country_code, country_name)
//            // It has like 237 records of all the countries I could think of.
//            String fileName = "G:\\GitRep\\blog\\src\\main\\resources\\config\\discuz.db";
//            // Driver to Use
//            // http://www.zentus.com/sqlitejdbc/index.html
//            Class.forName("org.sqlite.JDBC");
//            // Create Connection Object to SQLite Database
//            // If you want to only create a database in memory, exclude the +fileName
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + fileName);
//            // Create a Statement object for the database connection, dunno what this stuff does though.
//            Statement stmt = conn.createStatement();
//            // Create a result set object for the statement
//            ResultSet rs = stmt.executeQuery("SELECT * FROM demo ORDER BY id ASC");
//            // Iterate the result set, printing each column
//            // if the column was an int, we could do rs.getInt(column name here) as well, etc.
//            while (rs.next()) {
//                String id = rs.getString("id");   // Column 1
//                String name = rs.getString("name"); // Column 2
//                String title = rs.getString("title"); // Column 3
//                System.out.println("id: " + id + " name: " + name + " title: " + title);
//
//            }
//            // Close the connection
//            conn.close();
//        } catch (Exception e) {
//            // Print some generic debug info
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//        }
//    }
}
