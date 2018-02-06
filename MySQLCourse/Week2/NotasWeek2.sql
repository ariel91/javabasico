Structured Query Language SQL

Is the language we use to issue commands to the database

Create / Insert Data 
Read / Select some data
Update data
Delete data

Database: Contains one or more tables

Relation (or row) a set of fields which generally represeent an objet like a person or a music track

* Basic SQL Operations 

INSERT INTO users(name, email) VALUES ('Ted','ted@umich.edu')
DELETE FROM Users WHERE email = email = 'ted@umich.edu'

FINAL GOAL
BASIC SQL OPARATIONS EXCERCISE
DATABASE KEYS AND INDEXES

MySQL Functions
dev.mysql.com/doc/refman/5.0/en/string-functions.html
Date and Time Functions in MySQL
dev.mysql.com/doc/refman/5.0/en/date-and-time-functions.html

-----------------------------------------------------------------
Conceptos basicos

bASE DE DATOS:
	Coleccion de datos interrelacionados y estructurados.
	la finalidad es servir como n respositroio.
	La forma de ingresar es a traves de eventos hacia los repositorios.
	
	TUPLA 
	Sirve para agrupar, como si fueran un único valor,
	varios valores que, por su naturaleza, deben ir juntos.
	
DBMS DATABASE MANAGMENT SYSTEM

	conjunto coordinado de programams, procedimientos, lenguajes, etc. 
	Que suministra tanto a los usuarios no informaticos como a los analistas, 
	programadores manteniendo su integridad, confidencialidad y seguridad.
	CONJUNTO DE PROGRAMAS QUE NOS PERMITE IR AL REPOSITORIO.
	Definicion, manipulacion, utilizacion (graficos)
	
LENGUAJE DE DEFINICION DE DATOS (DDL)

	Es donde se especifican los elementos de datos que integran la BD. 
	Su estructura y las relaciones que existen entre ellos, las reglas, controles,
	tipo de datos etc.
	
DISEÑO DE BASE DE DATOS

	Toda base de datos debe tener su algoritmo de trabajo.
	(VER DISEÑOE.1)
	Nivel Coneptual
	Nivel Logico
	Nivel Fisico
	
	Modelo Coneptual
	Se visualizan los tipos de datos que deben incluirse.
	Se usa el modelo ENTIDAD - VINCULO
	
	Estructura logica 
	Despues de visualisar los datos, se debe generar una estructura logica para la 
	manipulacion de la base de datos por medio del DBMS. establecer un Modelo RELACIONAL
	que aplican reglas de integridad en los datos y reglas de normalizaion para mejorar
	toda la estructura logica de la base.
	
	
MODELO ENTIDAD-VINCULO

		Entidad y relaciones (Relation) en base al modelo crear
		un cierto tipo de relaciones,
	
	ENTIDAD
	Es el objeto de donde vamos a sacar la informacion
	puede ser una persona, cosa, lugar, concepto o suceso real o abstracto
	que la empresa tiene interes.
	
	ENTIDADES
	Se representan a traves de rectangulos que dentro de ellos esta 
	el nombre.
	
	ENTIDADES DEBILES
	Son las entidades que no existen sin otra identidad:
	Ejemplo: Cuenta de un cliente no existe, si no existe el cliente.
	Se representa con un cuadro dentro de otro.
	
MODELO RELACIONAL

	El elemento principal en un modelo relacional es la tabla.
	Conjunto de filas serian los registros que representas las tuplas
	y columnas llamadas campos que representan los atributos.
	
	
	RESTRICCIONES DE INTEGRIDAD
	Ningun valor de clave primaria puede ser nulo..
	Se especifica entre dos relaciones y sirve para mantener la 
	consistencia entre tuplas de dos relaciones y establece que 
	una tupla en una relación que haga referencia a otra relación
	deberá referirse a una tupla existente en esa relación.
	
	Si yo relaciono dos tablas y una depende de otra, debo ponerle 
	en la tupla las restricciones de referencia.
	
TRANSFORMACION DEL ESQUEMA CONCEPTUAL E-R AL RELACIONAL

ver imagen

VINCULO

	Se representa a traves de un rombo y se escriben acciones dentro
	de el.
	Puede ser de Uno a Uno, Uno a muchos, muchos a muchos.
	
EJERCICIOS PRACTICOS PARA BD EN MySQL

CREAR UNA BASE DE DATOS
CREATE DATABASE NOMBREBASEDATOS;

HACER APARECER UNA FILA O COLUMNAS ESPECIFICAS
SELECT * FROM nombreTabla;	
SELECT * FROM NombreColumna

INSERTAR REGISTROS EN UNA TABLA
INSERT INTO NombreTabla(columna1,columna2,columna3)values('valor1','valor2','valor3');

ELIMINAR TODOS LOS REGISTROS DE UNA TABLA
TRUNCATE NombreTabla;

ELIMINAR REGISTROS ESPECIFICOS
DELETE FROM NombreTabla where NombreColumna = 'Valor';

EXPLICACION DE ATRIBUTOS DE LA TABLA
DESCRIBE NombreTabla;

MUESTRA DE LAS BASES DE DATOS
USE NombreBaseDatos;
	MUESTRA DEL CURSO
	
	

ALMACENAMIENTO DE LA INFORMACION
	
    CREATE DATABASE se utiliza para crear una nueva base de datos vacía.
    DROP DATABASE se utiliza para eliminar completamente una base de datos existente.
    CREATE TABLE se utiliza para crear una nueva tabla, donde la información se almacena realmente.
    ALTER TABLE se utiliza para modificar una tabla ya existente.
    DROP TABLE se utiliza para eliminar por completo una tabla existente. 

MANIPULANCION DE DATOS

	SELECT se utiliza cuando quieres leer (o seleccionar) tus datos.
    INSERT se utiliza cuando quieres añadir (o insertar) nuevos datos.
    UPDATE se utiliza cuando quieres cambiar (o actualizar) datos existentes.
    DELETE se utiliza cuando quieres eliminar (o borrar) datos existentes.
    REPLACE se utiliza cuando quieres añadir o cambiar (o reemplazar) datos nuevos o ya existentes.
    TRUNCATE se utiliza cuando quieres vaciar (o borrar) todos los datos de la plantilla. 