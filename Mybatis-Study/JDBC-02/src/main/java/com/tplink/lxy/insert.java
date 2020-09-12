package com.tplink.lxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert {
    public static void main(String[] args) throws SQLException {
        String JDBC_URL = "jdbc:mysql://localhost:3306/demo?serverTimezone=GMT";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "3487544";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO students (grade, name, gender, score) VALUES (?,?,?,?)")) {
                ps.setObject(1, 1); // grade
                ps.setObject(2, "Bob"); // name
                ps.setObject(3, 0); // gender
                ps.setObject(4, 90); // scores
                int n = ps.executeUpdate(); // 1
            }
        }
    }
}
