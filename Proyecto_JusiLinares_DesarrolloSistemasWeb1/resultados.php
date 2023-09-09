<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <title>¡Resultados de datos!</title>
</head>

<body>
    <div class="dive2">
        <center>
        <!-- Titulo -->
        <h1>Resultados</h1>
        <!--Manda a llamar a la imagen congrats ubicada en la carpeta imagenes y se le da el nombre a la clase para darle estilo en el css-->
        <img class="Mario_Congrats" src="Imagenes/congrats.jpg">
        <!--Codigo PHP-->
        <?php
        $nombre = $_POST['Name']; // Creamos la variable nombre y mandamos a llamar el dato ingresado en la caja de texto 
        //donde name = Name, este dato se recibe y se guarda en la variable $nombre
        $edad = $_POST['Edad']; //Hacemos lo mismo para los demas datos
        $ciudad = $_POST['Ciudad'];
        $fec_nac = $_POST['Fec_Nac'];
        $pasatiempo = $_POST['Pasatiempo'];

        echo '<p><b>Nombre: </b>' . $nombre. '</p>'; //Con este echo se llama a la variable $nombre, entre comillas sencillas ''
        //ponemos codigo HTML para darle formato al texto, por medio de los puntos conectamos el texto en html y la variable php
        echo '<p><b>Ciudad: </b>' . $ciudad. '</p>'; //Lo mismo que arriba pero cambiando a la variable $ciudad
        echo '<p><b>Fecha Nacimiento: </b>' . $fec_nac. '</p>';
        echo '<p><b>Pasatiempo: </b>' . $pasatiempo. '</p>';
        ?>
        <h2>¡Bien Hecho!</h2>
        <div id="popUpOverlay"></div>
        <div id="popUpBox"> <!--Representa el contenedor principal de la ventana emergente. 
        Es dentro de este contenedor que se mostrará el contenido de la ventana emergente.-->
            <div id="box"> <!--En este contenedor, se coloca el contenido específico de la ventana emergente, 
            como texto, imágenes o elementos interactivos.-->
                <i class="fas fa-question-circle fa-5x"><h1>¿Volver a ingresar datos?</h1></i> <!-- Con i ponemos el texto en cursiva y
                con H1 como título -->
                <div id="closeModal"></div> <!-- En este div se colocara el botón de app.js -->
            </div>
        </div>
        <button onclick="Alert.render('You look very pretty today.')" class = "btn">¡Volver a Ingresar!</button> <!-- especifica una acción
        que se debe realizar cuando el usuario hace clic en el botón. En este caso, cuando se hace clic en el botón, se ejecutará 
        la función JavaScript Alert.render -->
        <script src="./app.js"></script> <!-- Está cargando nuestro archivo JavaScript llamado "app.js" y 
        ejecutando su contenido en la página web actual. -->
        </center>
    </div>
</body>
</html>