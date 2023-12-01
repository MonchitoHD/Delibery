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
import org.controlsfx.control.PropertySheet;

import java.io.IOException;
import java.util.List;

public class ComidasController
{

    @FXML
    private JFXButton btAñadir1;

    @FXML
    private JFXButton btAñadir2;

    @FXML
    private JFXButton btAñadir3;

    @FXML
    private JFXButton btCarrito;

    @FXML
    private Text precio1;

    @FXML
    private Text precio2;

    @FXML
    private Text precio3;

    @FXML
    private Text titulo1;

    @FXML
    private Text titulo2;

    @FXML
    private Text titulo3;
    CarritoController carritoController = new CarritoController();
    //private ObservableList<Producto> listaProductos;
    //private CarritoController carritoController = new CarritoController();
   // public CarritoController getCarritoController() {
   //     return carritoController;
   // }

    //public ComidasController()
    //{
    //    listaProductos = FXCollections.observableArrayList();
   // }

    @FXML
    void abrirCarrito(ActionEvent event)
    {
        try {
            // Cargar el archivo FXML del carrito
            FXMLLoader loader = new FXMLLoader(getClass().getResource("carrito.fxml"));
            Parent root = loader.load();

            // Crear el controlador del carrito
            CarritoController carritoController = loader.getController();
           // carritoController.recibirListaProductos(listaProductos);
            // Configurar la escena
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Carrito de Compras");

            // Mostrar la nueva ventana
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente
        }
    }

   // @FXML
    //void añadir(ActionEvent event)
    //{
    //    JFXButton botonPresionado = (JFXButton) event.getSource();
     //   String idBoton = botonPresionado.getId();
     //   String nombreProducto = "";
     //   String precioProducto = "";
     //   if ("btAñadir1".equals(idBoton))
     //   {
      //      nombreProducto = titulo1.getText();
      //      precioProducto = precio1.getText();
      //  } else if ("btAñadir2".equals(idBoton))
       // {
       //     nombreProducto = titulo2.getText();
       //     precioProducto = precio2.getText();
        //} else if ("btAñadir3".equals(idBoton))
       // {
         //   nombreProducto = titulo3.getText();
        //    precioProducto = precio3.getText();
        //}

        //Producto producto = new Producto(nombreProducto, precioProducto);
        //listaProductos.add(producto);
    //}
    @FXML
    void entrarDominos(ActionEvent event)
    {
        try {
            // Cargar el archivo FXML del carrito
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dominos.fxml"));
            Parent root = loader.load();

            DominosController dominosController = loader.getController();

            dominosController.setCarritoController(carritoController);
            // Configurar la escena
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Carta de Dominos");

            // Mostrar la nueva ventana
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Manejar la excepción apropiadamente
        }
    }
}
