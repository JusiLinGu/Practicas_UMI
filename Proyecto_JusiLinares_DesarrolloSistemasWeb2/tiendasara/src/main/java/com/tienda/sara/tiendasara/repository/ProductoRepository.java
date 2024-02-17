package com.tienda.sara.tiendasara.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tienda.sara.tiendasara.model.Producto;

@Repository
public class ProductoRepository implements IProductoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int deleteByID(int ID) {
        String SQL = "DELETE * FROM Productos WHERE ID = ?";
        return jdbcTemplate.update(SQL, new Object[] { ID });
    }

    @Override
    public List<Producto> findAll() {
        String SQL = "SELECT * FROM Productos";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Producto.class));
    }

    @Override
    public int save(Producto producto) {
        String SQL = "INSERT INTO Productos VALUES(?,?,?,?,?,?,?)";
        return jdbcTemplate.update(SQL,
                new Object[] { producto.getID(), producto.getDescripcion(), producto.getPrecio(),
                        producto.getCantidad(), producto.getIdCategorias(), producto.getIdMarcas() });
    }

    @Override
    public int update(Producto producto) {
        String SQL = "UPDATE Productos SET ID =?, Descripcion =?, Precio =?, Cantidad =?, idCategorias =?, idMarcas =?, img =? WHERE ID = ?";
        return jdbcTemplate.update(SQL,
                new Object[] { producto.getID(), producto.getDescripcion(), producto.getPrecio(),
                        producto.getCantidad(), producto.getIdCategorias(), producto.getIdMarcas() });
    }

    @Override
    public String findDescriptionById(int id) {
        String SQL = "SELECT Descripcion FROM Productos WHERE ID = ?";
        return jdbcTemplate.queryForObject(SQL, String.class, id);
    }

    @Override
    public float findPrecioById(int id) {
        String SQL = "SELECT precio FROM Productos WHERE ID = ?";
        return jdbcTemplate.queryForObject(SQL, float.class, id);
    }

    @Override
    public String findImgById(int id) {
        String SQL = "SELECT img FROM Productos WHERE ID = ?";
        return jdbcTemplate.queryForObject(SQL, String.class, id);
    }

    @Override
    public int conteoCategoriasById(int id) {
        String SQL = "SELECT COUNT(idCategorias) FROM productos WHERE idCategorias = ?;";
        return jdbcTemplate.queryForObject(SQL, int.class, id);
    }

    @Override
    public List<Producto> productoByCategorias(int categoriaID) {
        String SQL = "SELECT * FROM Productos WHERE idCategorias = ?";
        return jdbcTemplate.query(SQL, new Object[] { categoriaID }, BeanPropertyRowMapper.newInstance(Producto.class));
    }

    @Override
    public List<Producto> productoById(int id) {
        String SQL = "SELECT * FROM Productos WHERE ID = ?";
        return jdbcTemplate.query(SQL, new Object[] { id }, BeanPropertyRowMapper.newInstance(Producto.class));
    }
}