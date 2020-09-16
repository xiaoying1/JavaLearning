package com.tplink.lxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
    public static void main(String[] args) throws SQLException {
        String JDBC_URL = "jdbc:mysql://localhost:3306/demo?serverTimezone=GMT";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "3487544";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement("UPDATE students SET score=? WHERE name=?")) {
                ps.setObject(1, 100); // 注意：索引从1开始
                ps.setObject(2, "Bob");
                int n = ps.executeUpdate(); // 返回更新的行数
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
