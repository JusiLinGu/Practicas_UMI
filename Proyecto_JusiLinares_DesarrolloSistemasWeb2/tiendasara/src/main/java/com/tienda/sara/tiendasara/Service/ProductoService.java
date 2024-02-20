package com.tienda.sara.tiendasara.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.sara.tiendasara.model.Producto;
import com.tienda.sara.tiendasara.model.Producto2;
import com.tienda.sara.tiendasara.repository.IProductoRepository;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository iProductoRepository;

    @Override
    public int deleteByID(int ID) {
        int row;
        try {
            row = iProductoRepository.deleteByID(ID);
        } catch (Exception e) {
            throw e;
        }
        return row;
    }

    @Override
    public List<Producto> findAll() {
        List<Producto> list;
        try {
            list = iProductoRepository.findAll();
        } catch (Exception e) {
            throw e;
        }
        return list;
    }

    @Override
    public int save(Producto producto) {
        int row;
        try {
            row = iProductoRepository.save(producto);
        } catch (Exception e) {
            throw e;
        }
        return row;
    }


    @Override
    public List<Producto> findByCategoria(int categoriaID) {
        List<Producto> list;
        try {
            list = iProductoRepository.productoByCategorias(categoriaID);
        } catch (Exception e) {
            throw e;
        }
        return list;
    }

    @Override
    public List<Producto> findById(int id) {
        List<Producto> list;
        try {
            list = iProductoRepository.productoById(id);
        } catch (Exception e) {
            throw e;
        }
        return list;
    }

    @Override
    public List<Producto2> findById2(int id) {
        List<Producto2> list;
        try {
            list = iProductoRepository.productoById2(id);
        } catch (Exception e) {
            throw e;
        }
        return list;
    }

    @Override
    public int update(Producto2 producto2) {
        int row;
        try {
            row = iProductoRepository.update(producto2);
        } catch (Exception e) {
            throw e;
        }
        return row;
    }
}