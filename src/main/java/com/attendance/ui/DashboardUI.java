package com.attendance.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DashboardUI extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("Attendance Tracker");
        title.setStyle("-fx-font-size: 28px; -fx-font-weight: bold;");

        Label maths = new Label("Maths              82%");
        Label physics = new Label("Physics            71%");
        Label dsa = new Label("DSA                 88%");

        Button markToday = new Button("Mark Today");
        Button viewReport = new Button("View Report");

        markToday.setPrefWidth(200);
        viewReport.setPrefWidth(200);

        VBox root = new VBox(20);
        root.setPadding(new Insets(30));
        root.setAlignment(Pos.CENTER);

        root.getChildren().addAll(
                title,
                maths,
                physics,
                dsa,
                markToday,
                viewReport
        );

        Scene scene = new Scene(root, 800, 500);

        stage.setTitle("Attendance Tracker");
        stage.setScene(scene);
        stage.show();
    }
}
