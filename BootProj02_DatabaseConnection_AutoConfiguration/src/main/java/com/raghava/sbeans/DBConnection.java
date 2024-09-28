package com.raghava.sbeans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dbc")
public class DBConnection {

    private static final String GET_COUNT_STUDENTS = "SELECT COUNT(*) FROM STUDENTGPA_DETAILS";

    @Autowired
    private DataSource ds;

    public int getCount() throws Exception {
    	
    	System.out.println(ds.getClass());
        int result = 0;

        // Try-with-resources for automatic resource management
        try (
            Connection con = ds.getConnection(); // Get the connection
            PreparedStatement ps = con.prepareStatement(GET_COUNT_STUDENTS); // Prepare the statement
            ResultSet rs = ps.executeQuery() // Execute the query and get the result set
        ) {
            if (rs.next()) {
                result = rs.getInt(1); // Get the count from the result set
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle any exceptions
            throw e;
        }

        return result; // Return the count
    }
}