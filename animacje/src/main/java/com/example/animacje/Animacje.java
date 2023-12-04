package com.example.animacje;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class Animacje extends Application{
 @Override
    public void start(Stage stage){
     Polygon hexagon = new Polygon();
     hexagon.getPoints().addAll(new Double[]{
        200.0, 50.0,
        400.0, 50.0,
        450.0, 150.0,
        400.0, 250.0,
        200.0, 250.0,
        150.0, 150.0,
     });
     hexagon.setFill(Color.BLUE);
     RotateTransition rotateTransition = new RotateTransition();
     rotateTransition.setDuration(Duration.millis(1000));
     rotateTransition.setNode(hexagon);
     rotateTransition.setByAngle(360);
     rotateTransition.setCycleCount(50);
     rotateTransition.setAutoReverse(false);
     rotateTransition.play();
     Group root = new Group(hexagon);
     Scene scene = new Scene(root, 600, 300);
     stage.setTitle("animacje");
     stage.setScene(scene);
     stage.show();

 }
 public static void main(String args[]){
     launch(args);
 }
}