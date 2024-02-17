package com.tienda.sara.tiendasara.Service;

import java.util.List;

import com.tienda.sara.tiendasara.model.Producto;

public interface IProductoService {
    public List<Producto> findAll();
    public int save(Producto producto);
    public int update(Producto producto);
    public int deleteByID(int ID);
    public List<Producto> findByCategoria(int categoriaID);
    public List<Producto> findById(int categoriaID);
}