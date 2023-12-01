package com.example.aplicacioncomida;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BienvenidaController
{
    private String nombreUsuario  ;
    @FXML
    private Label labelBienvenida;

    public void setNombreUsuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
        labelBienvenida.setText(nombreUsuario + ", bienvenido"+" ha ComidaExpress!");
    }
}
