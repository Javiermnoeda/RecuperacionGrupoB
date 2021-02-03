package sample;

import com.sun.prism.paint.Color;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    public Button botAzul, botRojo, botAmarillo;

    @FXML
    public Label labAzul, labRojo, labAmarillo;

    @FXML
    private void Click (MouseEvent event){
        System.out.println("Abriendo Ventana");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            Stage primaryStage = new Stage();
            Scene scene = new Scene(root, 300, 275);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void encimaAzul (MouseEvent event){
        labAzul.setText("Azul");
    }

    @FXML
    private void encimaRojo (MouseEvent event){
        labRojo.setText("Rojo");
    }

    @FXML
    private void encimaAmarillo (MouseEvent event){
        labAmarillo.setText("Amarillo");
    }

    @FXML
    private void fueraAzul (MouseEvent event){
        labAzul.setText("label");
    }

    @FXML
    private void fueraRojo (MouseEvent event){
        labRojo.setText("label");
    }

    @FXML
    private void fueraAmarillo (MouseEvent event){
        labAmarillo.setText("label");
    }

}