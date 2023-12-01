package com.example.aplicacioncomida;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class HelloController
{
    String contraseña;
    Scanner scanner = new Scanner(System.in);
    @FXML
    private JFXButton btIniciarSesion;

    @FXML
    private JFXTextArea contraseñaUsuario;

    @FXML
    private JFXTextArea nombreUsuario;

    @FXML
    void iniciarSesion(ActionEvent event)
    {
        String nombre = nombreUsuario.getText();

        boolean inicioDeSesionExitoso = true;

        if (inicioDeSesionExitoso) {
            try {
                // Cargar la pantalla de bienvenida
                FXMLLoader bienvenidaLoader = new FXMLLoader(getClass().getResource("bienvenida.fxml"));
                Parent bienvenidaRoot = bienvenidaLoader.load();

                // Obtener el controlador de la pantalla de bienvenida
                BienvenidaController bienvenidaController = bienvenidaLoader.getController();

                // Configurar el nombre de usuario en la pantalla de bienvenida
                bienvenidaController.setNombreUsuario(nombre);

                // Crear y mostrar el nuevo Stage para la pantalla de bienvenida
                Stage bienvenidaStage = new Stage();
                bienvenidaStage.setScene(new Scene(bienvenidaRoot));
                bienvenidaStage.show();

                // Esperar un segundo antes de abrir la siguiente pantalla
                Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), e -> abrirPantallaComidas(bienvenidaStage)));
                timeline.play();

                // Cerrar el Stage actual
                ((Stage) btIniciarSesion.getScene().getWindow()).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void abrirPantallaComidas(Stage bienvenidaStage)
    {
        try {
            // Cargar la pantalla de comidas
            FXMLLoader comidasLoader = new FXMLLoader(getClass().getResource("comidas.fxml"));
            Parent comidasRoot = comidasLoader.load();

            // Crear y mostrar el nuevo Stage para la pantalla de comidas
            Stage comidasStage = new Stage();
            comidasStage.setScene(new Scene(comidasRoot));
            comidasStage.show();

            // Cerrar el Stage de bienvenida
            bienvenidaStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}