/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafxcalculator.fxml.CalculatorController;

/**
 *
 * @author tybobobo
 */
public class JavaFXCalculator extends Application
{
    String appName = "Calculator";
    String version = "v1.0.0";
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/calculator.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle(appName + " - " + version);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
