package com.tienda.sara.tiendasara.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.sara.tiendasara.Service.IProductoService;
import com.tienda.sara.tiendasara.model.Producto;
import com.tienda.sara.tiendasara.model.Producto2;
import com.tienda.sara.tiendasara.model.ServiceResponse;
import com.tienda.sara.tiendasara.repository.IProductoRepository;

@RestController
@RequestMapping("api/v1/producto")
@CrossOrigin("*")
public class ProductoController {
    @Autowired
    private IProductoRepository ProductoRepository;

    @Autowired
    private IProductoService iProductoService;

    @GetMapping("/list")
    public ResponseEntity<List<Producto>> list() {
        var result = iProductoService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceResponse> save(
            @RequestParam("Descripcion") String descripcion,
            @RequestParam("Precio") float precio,
            @RequestParam("Cantidad") int cantidad,
            @RequestParam("idCategorias") int idCategorias,
            @RequestParam("idMarcas") int idMarcas,
            @RequestParam("img") String img) {

        Producto producto = new Producto();
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);
        producto.setIdCategorias(idCategorias);
        producto.setIdMarcas(idMarcas);
        producto.setImg(img);

        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iProductoService.save(producto);
        if (result == 1) {
            serviceResponse.setMessage("Item Saved with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<ServiceResponse> update(@PathVariable int id) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iProductoService.deleteByID(id);
        if (result == 1) {
            serviceResponse.setMessage("Item removed with success");
        }
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @GetMapping("/description/{id}")
    public ResponseEntity<String> getDescriptionById(@PathVariable int id) {
        String description = ProductoRepository.findDescriptionById(id);
        if (description != null) {
            return new ResponseEntity<>(description, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Producto no encontrado", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/precio/{id}")
    public ResponseEntity<Float> getPrecioById(@PathVariable int id) {
        float precio = ProductoRepository.findPrecioById(id);
        if (precio > 0) {
            return new ResponseEntity<>(precio, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/img/{id}")
    public ResponseEntity<String> getImgById(@PathVariable int id) {
        String img = ProductoRepository.findImgById(id);
        if (img != null) {
            return new ResponseEntity<>(img, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Imagen no encontrada", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/countCategorias/{id}")
    public ResponseEntity<Integer> getCountCategoriasById(@PathVariable int id) {
        int countCategorias = ProductoRepository.conteoCategoriasById(id);
        if (countCategorias >= 0) {
            return new ResponseEntity<>(countCategorias, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/productoByCategorias/{categoriaID}")
    public ResponseEntity<List<Producto>> getProductosByCategoria(@PathVariable int categoriaID) {
        List<Producto> productos = ProductoRepository.productoByCategorias(categoriaID);
        if (!productos.isEmpty()) {
            return new ResponseEntity<>(productos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/productoById/{id}")
    public ResponseEntity<List<Producto>> getProductosById(@PathVariable int id) {
        List<Producto> productos = ProductoRepository.productoById(id);
        if (!productos.isEmpty()) {
            return new ResponseEntity<>(productos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/productoById2/{id}")
    public ResponseEntity<List<Producto2>> getProductosById2(@PathVariable int id) {
        List<Producto2> productos = ProductoRepository.productoById2(id);
        if (!productos.isEmpty()) {
            return new ResponseEntity<>(productos, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<ServiceResponse> updateProduct(@RequestBody Producto2 producto2) {
        ServiceResponse serviceResponse = new ServiceResponse();
        int result = iProductoService.update(producto2);
        if (result == 1) {
            serviceResponse.setMessage("Item updated with success");
            return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
        } else {
            serviceResponse.setMessage("Failed to update item");
            return new ResponseEntity<>(serviceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        
    }
}