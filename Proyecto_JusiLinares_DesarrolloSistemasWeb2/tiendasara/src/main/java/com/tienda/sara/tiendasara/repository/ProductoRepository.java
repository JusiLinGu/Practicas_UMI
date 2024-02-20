package com.tienda.sara.tiendasara.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tienda.sara.tiendasara.model.Producto;
import com.tienda.sara.tiendasara.model.Producto2;

import jakarta.annotation.PostConstruct;

@Repository
public class ProductoRepository implements IProductoRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        System.out.println("JdbcTemplate initialized successfully.");
    }

    @Override
    public int deleteByID(int ID) {
        String SQL = "DELETE FROM Productos WHERE ID = ?";
        return jdbcTemplate.update(SQL, ID);
    }

    @Override
    public List<Producto> findAll() {
        String SQL = "SELECT * FROM Productos";
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(Producto.class));
    }

    @Override
    public int save(Producto producto) {
        String SQL = "INSERT INTO Productos (Descripcion, Precio, Cantidad, idCategorias, idMarcas, img) VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(SQL,
                new Object[] { producto.getDescripcion(), producto.getPrecio(),
                        producto.getCantidad(), producto.getIdCategorias(), producto.getIdMarcas(),
                        producto.getImg() });
    }

    @Override
    public String findDescriptionById(int id) {
        String SQL = "SELECT Descripcion FROM Productos WHERE ID = ?";
        return jdbcTemplate.queryForObject(SQL, String.class, id);
    }

    @Override
    public float findPrecioById(int id) {
        String SQL = "SELECT Precio FROM Productos WHERE ID = ?";
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

    @Override
    public List<Producto2> productoById2(int id) {
        String SQL = "SELECT * FROM Productos WHERE ID = ?";
        return jdbcTemplate.query(SQL, new Object[] { id }, BeanPropertyRowMapper.newInstance(Producto2.class));
    }

    @Override
    public int update(Producto2 producto2) {
        String SQL = "UPDATE Productos SET Descripcion = ?, Precio = ?, Cantidad = ?, idCategorias = ?, idMarcas = ?, img = ? WHERE ID = ?";
        return jdbcTemplate.update(SQL, new Object[] { producto2.getDescripcion(), producto2.getPrecio(),
                producto2.getCantidad(), producto2.getIdCategorias(), producto2.getIdMarcas(), producto2.getImg(),
                producto2.getID() });
    }
}