**Creating a maven based spring boot project in IntelliJ** - https://youtu.be/3_AnXmsh90g?list=PLsyeobzWxl7oA8QOlMtQsRT_I7Rx2hoX4
1. Select generator - Spring Initializr
2. Select type - Maven
3. Server URL - start.spring.io
4. Select dependencies - H2, JPA, Rest repositories and Lombok. Select `web` if UI is to be hosted.

**Youtube videos -**
1. Youtube Playlist link (Telusko) - https://www.youtube.com/playlist?list=PLsyeobzWxl7oA8QOlMtQsRT_I7Rx2hoX4
2. Another end-to-end implementation - https://youtu.be/XR7Js_q93Ks
3. Codebase ref - https://github.com/Java-Techie-jt/spring-boot-h2/tree/master
4. H2 database - https://www.baeldung.com/spring-boot-h2-database

**Code explained -**
1. Employee - Employee table in H2 database.
2. EmployeeRepository - Dao repository which interacts with the database.
3. EmployeeController - has all the paths and performs operations on the DAO repository
4. application.properties - has configuration for H2
5. data.sql - Initial set of queries to be executed when server is started.
6. SpringBootWithH2Application - Start point of the application
7. pom.xml - List of all maven dependencies

**Annotations -**
1. @RestController - The Controller class has to be annotated with this.
2. @GetMapping, @PostMapping, @PutMapping and @DeleteMapping for performing get, insert/update, insert/update and deleting operations on the H2 DB.
3. @Entity - The entities are the persistence objects stores as a record in the database.

**H2 database -**
1. Its a SQL in-memory database.
2. Console link - http://localhost:8080/h2-console
3. username - sa
4. password - password

**Postman command -**
1. GET - localhost:8080/getEmployees
2. GET - localhost:8080/getEmployee/IT
3. POST - localhost:8080/saveEmployee // body = {  "name": "Chaman",     "dept": "Sports",     "salary": "500" }
4. PUT - localhost:8080/updateEmployee // body = {     "id": 3,  "name": "Chaman",     "dept": "Sports",     "salary": "500" }
5. DELETE - localhost:8080/removeEmployee/2
