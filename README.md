```markdown
# example-api-external

## Descripción

Proyecto del tutorial del blog amoelcodigo para conectar un backend a una API externa: 

https://amoelcodigo.com/posts/java-springboot-connect-external-api/#-paso-4-conectarse-a-la-api-externa

## Tecnologías utilizadas

- **Java**
- **Spring Boot**
- **Spring WebFlux** (para programación reactiva)
- **Maven**

## Requisitos previos

- **Java 17** o superior
- **Maven 3.8** o superior

## Configuración

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/VManuelPM/example-api-external.git
   cd example-api-external
   ```

2. Configurar la clave de la API del servicio de clima en el archivo `src/main/resources/application.properties`:

   ```ini
   weather.api.key=TU_CLAVE_API
   ```

3. Construir el proyecto con Maven:

   ```bash
   mvn clean install
   ```

## Ejecución

Para ejecutar la aplicación localmente, utiliza el siguiente comando:

```bash
mvn spring-boot:run
```

La API estará disponible en `http://localhost:8080/api/weather`.

## Uso de la API

### Endpoint: Obtener clima por ciudad

**GET** `/api/weather`

#### Parámetros de consulta:

- `city` (String): Nombre de la ciudad.

#### Ejemplo de solicitud:

```bash
curl "http://localhost:8080/api/weather?city=London"
```

#### Respuesta:

```json
{
  "city": "London",
  "temperature": 15.5,
  "description": "Clear sky"
}
```

## Recursos adicionales

- [Documentación oficial de Spring Boot](https://spring.io/projects/spring-boot)
- [Guía para construir servicios RESTful](https://spring.io/guides/gs/rest-service/)
- [Guía para servicios reactivos](https://spring.io/guides/gs/reactive-rest-service/)

## Licencia

Este proyecto está bajo la licencia **MIT**. amoelcodigo.com
```