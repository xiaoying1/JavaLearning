package com.tplink.lxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
    public static void main(String[] args) throws SQLException {
        String JDBC_URL = "jdbc:mysql://localhost:3306/demo?serverTimezone=GMT";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "3487544";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement("DELETE FROM students WHERE name=?")) {
                ps.setObject(1, "Bob"); // 注意：索引从1开始
                int n = ps.executeUpdate(); // 删除的行数
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
