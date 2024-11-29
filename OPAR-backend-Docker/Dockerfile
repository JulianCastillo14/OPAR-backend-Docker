# Utilizamos la imagen de maven para crear el artefacto desplegable (jar) del proyecto
FROM maven:3.9.9-eclipse-temurin-17 AS maven

# Copiamos el archivo pom.xml primero
COPY ./pom.xml /usr/local/app/

# Definimos el directorio de la aplicación
WORKDIR /usr/local/app

# Descargamos las dependencias
RUN mvn dependency:go-offline

# Copiamos el código fuente
COPY ./src /usr/local/app/src

# Ejecutamos el comando para generar el jar, para esto nos saltamos los test
RUN mvn clean package -DskipTests

# Partimos ahora de la versión de java
FROM eclipse-temurin:17

# Definimos la variables de entorno para la base de datos
ENV MYSQL_DB_USERNAME=root \
    MYSQL_ROOT_PASSWORD=password \
    MYSQL_DATABASE=opar \
    MYSQL_DB_HOST=localhost \
    MYSQL_DB_PORT=3306

# Copiamos el archivo .jar
COPY --from=maven /usr/local/app/target/demo-0.0.1-SNAPSHOT.jar /usr/share/app.jar

# Lanzamos el ejecutable usando java
CMD ["java", "-jar", "/usr/share/app.jar"]

# Exponemos el puerto
EXPOSE 8081