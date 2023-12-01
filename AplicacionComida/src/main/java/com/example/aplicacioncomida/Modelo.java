package com.example.aplicacioncomida;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Modelo
{
    private ObservableList<Producto> listaProductos;
    private ObservableList<Producto> carrito = FXCollections.observableArrayList();
}
