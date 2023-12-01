package com.example.aplicacioncomida;

import com.jfoenix.controls.JFXButton;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CarritoController
{
    @FXML
    private JFXButton btCompra;

    @FXML
    private TableColumn<Producto, String> tablaNombreProducto;

    @FXML
    private TableColumn<Producto, String> tablaPrecioProducto;

    @FXML
    private TableView<Producto> tablaProductos;

    private ObservableList<Producto> carrito = FXCollections.observableArrayList();

    public void initialize()
    {
        tablaNombreProducto.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        tablaPrecioProducto.setCellValueFactory(new PropertyValueFactory<>("precio"));
        tablaProductos.setItems(carrito);
        System.out.println(tablaProductos);
    }
   // public void recibirListaProductos(ObservableList<Producto> listaProductos)
   // {
     //   if (listaProductos != null) {
    //        System.out.println("Recibiendo lista de productos: " + listaProductos);
    //        carrito.clear();
    //        carrito.addAll(listaProductos);
    //    }
   // }

    @FXML
    void comprar(ActionEvent event)
    {

    }

    public void agregarProductoAlCarrito(ObservableList<Producto> listaProductos)
    {
        carrito.clear();
        carrito.addAll(listaProductos);
        System.out.println(carrito);
    }
}
