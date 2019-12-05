package me.jwotoole9141.jardemo;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.sql.*;

public class Controller {

    @FXML
    private ListView<String> lstData;

    public void initialize() throws SQLException {

        if (Main.class.getClassLoader().getResourceAsStream("./db/data") == null) {

        }

        String DB_URL = "jdbc:h2:./db/data";

        Connection conn = DriverManager.getConnection(DB_URL);

        try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM names");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                String first = rs.getString("first");
                String last = rs.getString("last");

                lstData.getItems().add(String.join(" ", first, last));
            }
        }
    }
}
