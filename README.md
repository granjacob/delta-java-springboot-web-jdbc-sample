# Delta Java Spring Boot Web JDBC Sample

Este es un proyecto de ejemplo desarrollado con **Spring Boot** y **Maven**, que expone una API REST básica para gestionar entidades de tipo `Persona` utilizando una base de datos relacional (PostgreSQL, H2, etc.).

## Estructura del Proyecto

## Requisitos

- Java 17+
- Maven 3.8+
- PostgreSQL (u otra base de datos JDBC-compatible)

## Instalación y Ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/delta-java-springboot-web-jdbc-sample.git
   cd delta-java-springboot-web-jdbc-sample
   
2. Configura tu base de datos en src/main/resources/application.properties:

   - spring.datasource.url=jdbc:postgresql://localhost:5432/tu_base
   - spring.datasource.username=usuario
   - spring.datasource.password=contraseña
   - spring.jpa.hibernate.ddl-auto=update

3. Compila y ejecuta el proyecto:

   - mvn clean install
   - mvn spring-boot:run

