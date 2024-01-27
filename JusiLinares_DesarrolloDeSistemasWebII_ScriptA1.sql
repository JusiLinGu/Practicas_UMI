create database TiendaSara;
use TiendaSara;

CREATE TABLE categorias (
	ID int primary key NOT NULL IDENTITY(1, 1),
	Descripcion varchar(60) NOT NULL
)

CREATE TABLE marcas (
	ID int primary key NOT NULL IDENTITY(1, 1),
	Descripcion varchar(60) NOT NULL
)

CREATE TABLE productos (
	ID int primary key NOT NULL IDENTITY(1, 1),
	Descripcion varchar(60) NOT NULL,
	Precio float NOT NULL,
	Cantidad int NOT NULL,
	idCategorias int NOT NULL,
	idMarcas int NOT NULL,
	FOREIGN KEY (idCategorias) REFERENCES categorias(ID),
	FOREIGN KEY (idMarcas) REFERENCES marcas(ID)
)

CREATE TABLE carrito (
	ID int primary key NOT NULL IDENTITY(1, 1),
	FolioVenta bigint NOT NULL,
	TotalCompra float NOT NULL,
	Estatus varchar(10) NOT NULL,
	Fecha date NOT NULL
)

Create Table carritoDetalle (
	ID int primary key NOT NULL IDENTITY(1, 1),
	idCarrito int NOT NULL,
	idProducto int NOT NULL,
	Cantidad int NOT NULL,
	Subtotal float NOT NULL,
	FOREIGN KEY (idCarrito) REFERENCES carrito(ID),
	FOREIGN KEY (idProducto) REFERENCES productos(ID)
)

INSERT INTO categorias VALUES ('Hogar y Muebles');
INSERT INTO categorias VALUES ('Zapatos');
INSERT INTO categorias VALUES ('Juguetes');
INSERT INTO categorias VALUES ('Linea Blanca');
INSERT INTO categorias VALUES ('Electronica');
INSERT INTO categorias VALUES ('Celulares');
INSERT INTO categorias VALUES ('Consolas y videojuegos');
INSERT INTO categorias VALUES ('Relojes, lentes y joyeria');
INSERT INTO categorias VALUES ('Cocina y electrodomesticos');
INSERT INTO categorias VALUES ('Ropa');

INSERT INTO marcas VALUES ('MABE: electrodomesticos');
INSERT INTO marcas VALUES ('Samsung: electrodomesticos');
INSERT INTO marcas VALUES ('Samsung: electronica');
INSERT INTO marcas VALUES ('Motorola: celulares');
INSERT INTO marcas VALUES ('Nintendo: videojuegos');
INSERT INTO marcas VALUES ('Apple: celulares');
INSERT INTO marcas VALUES ('Microsoft: videojuegos');
INSERT INTO marcas VALUES ('Hasbro: Juguetes');
INSERT INTO marcas VALUES ('Lenovo: electronica');
INSERT INTO marcas VALUES ('LG: electrodomesticos');

INSERT INTO productos VALUES ('Estufa', 13999, 100, 4, 1);
INSERT INTO productos VALUES ('iPhone', 19499, 85, 6, 6);
INSERT INTO productos VALUES ('Pantalla LED 58', 10399, 150, 5, 3);
INSERT INTO productos VALUES ('Xbox Series X', 9899, 120, 7, 7);
INSERT INTO productos VALUES ('Nintendo Switch Oled', 8749, 130, 7, 5);
INSERT INTO productos VALUES ('Microondas', 5273, 200, 9, 10);
INSERT INTO productos VALUES ('Celular Motorola', 3999, 250, 6, 4);
INSERT INTO productos VALUES ('Aspiradora', 4189, 150, 4, 2);
INSERT INTO productos VALUES ('Laptop Ideapad', 15349, 100, 5, 9);
INSERT INTO productos VALUES ('Dr Strange Marvel Legends', 499, 80, 3, 8);

SELECT productos.Descripcion, marcas.Descripcion FROM productos, marcas WHERE marcas.ID = productos.idMarcas;
SELECT productos.Descripcion, categorias.Descripcion FROM productos, categorias WHERE categorias.ID = productos.idCategorias;
SELECT * FROM productos ORDER BY Precio ASC;
SELECT * FROM productos WHERE idCategorias = 5;
SELECT * FROM productos WHERE idMarcas = 6;