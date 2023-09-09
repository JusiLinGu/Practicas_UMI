var Alert = new CustomAlert(); /* Crea una nueva variable Alert y se le asigna la instancia CustomAlert */
function CustomAlert() { /*Esta función constructora se utiliza para crear objetos CustomAlert. */
    this.render = function() { /* Este método se utiliza para mostrar la alerta*/
        let popUpBox = document.getElementById('popUpBox'); /* Obtiene el elemento con el ID popUpBox */
        popUpBox.style.display = "block"; /* Vuelve visible el elemento con el ID popUpBox como un cuadro emergente, 
        none es para ocultarlo */
        document.getElementById('closeModal').innerHTML = '<a href="index.html"><button type = "button" a href>¡Si quiero</button></a>';
        /*^ Se obtiene un elemento con el ID closeModal y se le establece su contenido HTML, En este caso un botón con un enlace*/
    }
    this.ok = function() { /* Esto define una función llamada ok, La función se ejecutará cuando se llame a ok() */
        document.getElementById('popUpBox').style.display = "none"; /* Para seleccionar un elemento HTML con el atributo id igual a 
        "popUpBox". Al establecer style.display en "none", el cuadro de diálogo emergente se ocultará y ya no será visible en la página. */
        document.getElementById('popUpOverlay').style.display = "none"; /* Oculta el elemento con el id popUpOverlay */ 
    }
}