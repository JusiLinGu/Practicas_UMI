package com.tienda.sara.tiendasara.model;

import lombok.Data;

@Data
public class Producto {
    String Descripcion;
    float Precio;
    int Cantidad;
    int idCategorias;
    int idMarcas;
    String img;
}