# Proyecto de Aplicación Web en Java para Administración Hospitalaria
    Este proyecto es un portafolio para el curso Boot Camp Full Stack Java de la Universidad Andrés Bello (UNAB). Consiste en el desarrollo de una aplicación web utilizando el framework Spring y siguiendo el patrón de diseño MVC (Modelo-Vista-Controlador).

El objetivo principal de esta aplicación web es mejorar la eficiencia en la administración de pacientes en el sector hospitalario, con el fin de optimizar el uso de los recursos disponibles y enfocarlos en la atención pública de los pacientes.

## Indice

1. Instrucciones de instalación.
2. Configuración de la Base de Datos.
3. Usos y funcionalidad.
4. Rúbrica Evaluativa.


# 1. Instrucciones de Instalación.

Sigue los siguientes pasos para instalar y configurar el proyecto en tu entorno local:

1. Descarga un IDE para trabajar con proyectos en lenguaje Java. Algunas opciones populares incluyen Eclipse, IntelliJ IDEA y NetBeans. (Durante el desarrollo se utilizó IntelliJ)

2. Clona el repositorio del proyecto desde GitHub ejecutando el siguiente comando: `gh repo clone Gronorf/PortafolioUNAB` o descargarlo directamente desde el link: https://github.com/Gronorf/PortafolioUNAB.git

3. El proyecto utiliza la estructura de Maven, por lo que necesitarás instalar las dependencias definidas en el archivo pom.xml. Ejecuta el comando de "Build" en tu IDE para que las dependencias se descarguen automáticamente.

4. Inicia un servidor local. Recomendamos utilizar Tomcat 10.1.8 para el despliegue local del proyecto. Puedes descargarlo desde el sitio oficial de Apache Tomcat.

5. Despliega el proyecto en el servidor local siguiendo los pasos específicos de tu servidor y entorno de desarrollo. Asegúrate de configurar las opciones necesarias, como el puerto y la ruta de contexto, según tus preferencias.

# 2. Configuración de la Base de Datos

El sistema de administración de base de datos relacionales utilizado en este proyecto es MySQL. A continuación, se detalla la configuración necesaria:

- El script de creación de la base de datos se encuentra en la siguiente ubicación: `Recursos/DB/DBportafolio.sql` Este script contiene las instrucciones para crear la estructura de la base de datos necesaria para el proyecto.

- Para generar registros de prueba, se proporciona un archivo con consultas SQL en la siguiente ruta: `Recursos/DB/RegistroPacientes.sql` Estas consultas crean cinco registros diferentes, cada uno con un tiempo de inscripción distinto, lo que permite realizar pruebas y utilizar sentencias de ordenamiento por tiempo de inscripción.

Asegúrate de tener MySQL instalado en tu entorno de desarrollo antes de ejecutar los scripts mencionados anteriormente. Puedes obtener MySQL desde el sitio web oficial de MySQL.

# 3. Usos y Funcionalidad

La aplicación ofrece las siguientes funcionalidades principales:

- ### Control de ingreso a la plataforma: 
    La aplicación cuenta con un sistema de autenticación que permite a los usuarios iniciar sesión de manera segura. Esto garantiza que solo los usuarios autorizados puedan acceder a las funcionalidades del sistema.

- ### Administración de pacientes (CRUD): 
    La aplicación proporciona las operaciones básicas de [Crear](hospital/src/main/java/unab/portafolio/dao/DAO.java#L17), [Leer](hospital/src/main/java/unab/portafolio/dao/DAO.java#L40), [Actualizar](hospital/src/main/java/unab/portafolio/dao/DAO.java#L113) y [Eliminar](hospital/src/main/java/unab/portafolio/dao/DAO.java#L134) (CRUD) para la gestión de pacientes. Los usuarios pueden agregar nuevos pacientes, ver la información detallada de cada paciente, actualizar su información y eliminar registros de pacientes existentes.

- ### Algoritmo de priorización de pacientes y generación de reporte en PDF: 
    La aplicación implementa un algoritmo de priorización de pacientes, que permite asignar prioridades según criterios específicos. Además, se genera un informe en formato PDF que resume la información relevante de los pacientes prioritarios. Este informe puede descargarse y utilizarse para su posterior revisión o impresión.

La combinación de estas funcionalidades ofrece a los usuarios una herramienta completa para el control de ingreso, administración y priorización de pacientes en un entorno eficiente y seguro.

# 4. Rúbrica Evaluativa.

### Consulta a la base de datos:

1.  [Selecciona las columnas requeridas para presentar la información solicitada.](hospital/src/main/java/unab/portafolio/dao/DAO.java#L46)

2. Utiliza JOIN para relacionar la información de distintas tablas.

3. [Utiliza WHERE para filtrar la información requerida.](hospital/src/main/java/unab/portafolio/dao/DAO.java#L164)

4. [Utiliza cláusulas de ordenamiento para presentar la información.](hospital/src/main/java/unab/portafolio/dao/DAO.java#82)

5. Utiliza cláusulas de agrupación de información para obtener datos agregados.
    
### Algoritmo de cálculo y unidades de prueba:

6. [Utilización general del lenguaje, sintaxis, selección de tipos de datos, sentencias lógicas, expresiones, operaciones, comparaciones.](hospital/src/main/java/unab/portafolio/controller/EliminarPacienteController.java#L34)

7. [Utilización de sentencias repetitivas.](hospital/src/main/java/unab/portafolio/controller/LoginController.java#L38)

8. [Utilización de clases, encapsulamiento y resposabilidad única.](hospital/src/main/java/unab/portafolio/model/usuario/Usuario.java#L10)

9. Se utilizan correctamente interfaces o relaciones de herencia para hacer polimorfismo donde fuese necesario.

    - [Herencia.](hospital/src/main/java/unab/portafolio/model/paciente/PacienteDAO.java#L5)
    - [Polimorfismo.](hospital/src/main/java/unab/portafolio/model/paciente/Paciente.java#L72)

10. Convenciones y estilos de programación.

    - [Variables.](hospital/src/main/java/unab/portafolio/model/paciente/Paciente.java#L17)
    - [Métodos.](hospital/src/main/java/unab/portafolio/dao/DAO.java#L40)
    
11. [Utilización de unidades de prueba.](hospital/src/test/java/unab/portafolio/singleton/HibernateUtilityTest.java#L14)

### Página web html y css:

12. Utilización de tags html, estilos y responsividad.

    - [Tags HTML.](hospital/src/main/webapp/WEB-INF/views/home.jsp#L3)
    - [Estilos.](hospital/src/main/webapp/resources/style.css)
    - [Responsividad.](hospital/src/main/webapp/WEB-INF/views/home.jsp#L27)

13. [Utilización de Botstrap.](hospital/src/main/webapp/WEB-INF/views/login.jsp#L13)

### Spring MVC:

14. [Utilización de Controllers.](hospital/src/main/java/unab/portafolio/controller/LoginController.java#L16)

15. [Utilización de vistas JSP y Taglib.](hospital/src/main/webapp/WEB-INF/views/verpaciente.jsp#67)

16. Creación Servicio Spring.

    - Dependencias:
        - [Spring Core](hospital/pom.xml#L50)
        - [Spring MVC](hospital/pom.xml#L28)
    - Anotaciones de Clase:
        - [@Configuration](hospital/src/main/java/unab/portafolio/config/MvcConfiguration.java#L13)
        - [@EnableWebMvc](hospital/src/main/java/unab/portafolio/config/MvcConfiguration.java#L15)
        - [@Controller](hospital/src/main/java/unab/portafolio/controller/CreateAccountController.java#L10)
        - [@GetMapping](hospital/src/main/java/unab/portafolio/controller/LoginController.java#L22)
        - [@PostMapping](hospital/src/main/java/unab/portafolio/controller/LoginController.java#L28)

17. [Creación DAO acceso a datos.](hospital/src/main/java/unab/portafolio/dao/DAO.java#L10)

18. Creación del proyecto y configuración.

19. Funcionamiento general del aplicativo.

### API Rest.

20. Creación servicio Rest.
