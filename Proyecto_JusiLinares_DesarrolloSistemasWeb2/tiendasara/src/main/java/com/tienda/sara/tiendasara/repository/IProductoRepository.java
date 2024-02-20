package com.tienda.sara.tiendasara.repository;

import java.util.List;

import com.tienda.sara.tiendasara.model.Producto;
import com.tienda.sara.tiendasara.model.Producto2;

public interface IProductoRepository {
    public List<Producto> findAll();
    public int save(Producto producto);
    public int deleteByID(int ID);
    String findDescriptionById(int id);
    float findPrecioById(int id);
    String findImgById(int id);
    int conteoCategoriasById(int id);
    List<Producto> productoByCategorias(int categoriaID);
    List<Producto> productoById(int id);
    List<Producto2> productoById2(int id);
    public int update(Producto2 producto2);
}