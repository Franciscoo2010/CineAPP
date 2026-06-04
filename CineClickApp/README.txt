CineClickApp - Plataforma de Streaming
=======================================

CONFIGURACION PREVIA:
1. Ejecutar primero B2_PBF1_ronald_pico_2023564.sql (DDL + datos)
2. Descargar mysql-connector-j-8.0.33.jar y colocarlo en la carpeta lib/
3. En Conexion.java ajustar USER y PASSWORD segun su entorno MySQL

ESTRUCTURA DEL PROYECTO:
- model/conexion/Conexion.java       -> Conexion a MySQL
- model/                             -> POJOs (Estudio, Pelicula, Actor, Usuario, ListaFavoritos)
- model/dao/                         -> Interfaces y Implementaciones DAO
- controller/                        -> Controladores MVC
- view/                              -> Vistas de consola + MenuPrincipal
- system/Main.java                   -> Punto de entrada

NOTA: La clase PeliculaDAOImpl usa el procedimiento almacenado sp_ListarPeliculas()
definido en el script SQL. Las demas tablas usan consultas SQL directas.
