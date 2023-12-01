package com.example.aplicacioncomida;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class DominosController
{
    @FXML
    private JFXButton btCarrito;
    @FXML
    private JFXButton btAñadir1;

    @FXML
    private JFXButton btAñadir2;

    @FXML
    private JFXButton btAñadir3;

    @FXML
    private JFXButton btAñadir4;

    @FXML
    private JFXButton btAñadir5;

    @FXML
    private JFXButton btAñadir6;

    @FXML
    private Text precio1;

    @FXML
    private Text precio2;

    @FXML
    private Text precio3;

    @FXML
    private Text precio4;

    @FXML
    private Text precio5;

    @FXML
    private Text precio6;

    @FXML
    private Text titulo1;

    @FXML
    private Text titulo2;

    @FXML
    private Text titulo3;

    @FXML
    private Text titulo4;

    @FXML
    private Text titulo5;

    @FXML
    private Text titulo6;
    CarritoController carritoController = new CarritoController();
    private ObservableList<Producto> listaProductos;

    public DominosController()
    {
        listaProductos = FXCollections.observableArrayList();
    }


    public void setCarritoController(CarritoController carritoController) {
        this.carritoController = carritoController;
    }

    @FXML
    void añadir(ActionEvent event)
    {
        JFXButton botonPresionado = (JFXButton) event.getSource();
        String idBoton = botonPresionado.getId();
        String nombreProducto = "";
        String precioProducto = "";
        if ("btAñadir1".equals(idBoton))
        {
            nombreProducto = titulo1.getText();
            precioProducto = precio1.getText();
        } else if ("btAñadir2".equals(idBoton))
        {
            nombreProducto = titulo2.getText();
            precioProducto = precio2.getText();
        } else if ("btAñadir3".equals(idBoton))
        {
            nombreProducto = titulo3.getText();
            precioProducto = precio3.getText();
        } else if ("btAñadir4".equals(idBoton))
        {
            nombreProducto = titulo4.getText();
            precioProducto = precio4.getText();
        } else if ("btAñadir5".equals(idBoton))
        {
            nombreProducto = titulo5.getText();
            precioProducto = precio5.getText();
        } else if ("btAñadir6".equals(idBoton))
        {
            nombreProducto = titulo6.getText();
            precioProducto = precio6.getText();
        }
        Producto producto = new Producto(nombreProducto, precioProducto);
        listaProductos.add(producto);
        carritoController.agregarProductoAlCarrito(listaProductos);
    }
}
