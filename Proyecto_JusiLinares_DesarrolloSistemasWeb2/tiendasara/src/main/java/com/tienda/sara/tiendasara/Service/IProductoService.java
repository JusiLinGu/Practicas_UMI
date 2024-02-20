package com.tienda.sara.tiendasara.Service;

import java.util.List;

import com.tienda.sara.tiendasara.model.Producto;
import com.tienda.sara.tiendasara.model.Producto2;

public interface IProductoService {
    public List<Producto> findAll();
    public int save(Producto producto);
    public int deleteByID(int ID);
    public List<Producto> findByCategoria(int categoriaID);
    public List<Producto> findById(int categoriaID);
    public List<Producto2> findById2(int categoriaID);
    public int update(Producto2 producto2);
}