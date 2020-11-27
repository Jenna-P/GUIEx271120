package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Pane pane = new Pane();
        Button bt = new Button("Hej!");
        Button bt2 = new Button("Nu");
        Button bt3 = new Button("Terning");
        TextArea text = new TextArea();

        pane.setStyle("-fx-background-color : #8c478f");


        bt.setId("HejBt");
        bt.setLayoutX(60);
        bt.setLayoutY(125);
        bt2.setLayoutX(175);
        bt2.setLayoutY(125);
        bt3.setLayoutX(293);
        bt3.setLayoutY(125);
        text.setLayoutX(10);
        text.setLayoutY(175);

        bt.setPrefWidth(44.5);
        bt.setPrefHeight(27);
        bt2.setPrefWidth(44.5);
        bt2.setPrefHeight(27);
        bt2.setPrefWidth(57);
        bt2.setPrefHeight(27);
        text.setPrefWidth(380);
        text.setPrefHeight(302);

        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.appendText("HEJ!\n "); //appentText ; Hej가 버튼 누를때 마다 출

            }
        });
        bt2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Date date = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                String today= formatter.format(date);
                text.setText("Today : " + today); //setText ; 버튼 누르면 한번만 출력

            }
        });

        bt3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int die1;
                die1 = (int)(Math.random()*6) + 1;
                text.setText("Random dice number: " + die1);
            }
        });

        pane.getChildren().addAll(bt, bt2, bt3, text);

        primaryStage.setTitle("GUI");
        primaryStage.setScene(new Scene(pane, 400, 550));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
