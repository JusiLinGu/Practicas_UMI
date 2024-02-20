package com.tienda.sara.tiendasara.model;

import lombok.Data;

@Data
public class Producto2 {
    int ID;
    String Descripcion;
    float Precio;
    int Cantidad;
    int idCategorias;
    int idMarcas;
    String img;
}