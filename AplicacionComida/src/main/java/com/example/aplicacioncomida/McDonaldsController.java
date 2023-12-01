package com.example.aplicacioncomida;

import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.w3c.dom.Text;

public class McDonaldsController
{
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

    private ObservableList<Producto> listaProductos;

    public McDonaldsController()
    {
        listaProductos = FXCollections.observableArrayList();
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
            nombreProducto = titulo1.getTextContent();
            precioProducto = precio1.getTextContent();
        } else if ("btAñadir2".equals(idBoton))
        {
            nombreProducto = titulo2.getTextContent();
            precioProducto = precio2.getTextContent();
        } else if ("btAñadir3".equals(idBoton))
        {
            nombreProducto = titulo3.getTextContent();
            precioProducto = precio3.getTextContent();
        } else if ("btAñadir4".equals(idBoton))
        {
            nombreProducto = titulo4.getTextContent();
            precioProducto = precio4.getTextContent();
        } else if ("btAñadir5".equals(idBoton))
        {
            nombreProducto = titulo5.getTextContent();
            precioProducto = precio5.getTextContent();
        } else if ("btAñadir6".equals(idBoton))
        {
            nombreProducto = titulo6.getTextContent();
            precioProducto = precio6.getTextContent();
        }

        Producto producto = new Producto(nombreProducto, precioProducto);
        listaProductos.add(producto);
    }
}
