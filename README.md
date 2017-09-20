#Servicio Rest Para Probar Plataforma IC
Servicio REST Realizado con Spring Boot y MySQL como motor de base de datos.

##Integrantes
- Mario Caceres
- Dragomir Sekul

##Pasos a realizar
Para iniciar el servicio se debe ingresar a la carpeta del proyecto mediante el terminal
y colocar lo siguiente:

`mvn clean install`

Luego de realizar la instruccion anterior, de escribir lo siguiente:

`mvn spring-boot:run`

##Consultas disponibles

###Estudiantes

Entrega la información de todos los estudiantes:
- URL: localhost:1414/students
- Method: GET

Crea un estudiante:
- URL: localhost:1414/students
- Method: POST

Entrega la información de un estudiante particular:
- URL: localhost:1414/students/id
- Method: GET