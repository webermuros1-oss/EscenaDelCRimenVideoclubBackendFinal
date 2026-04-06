# EscenaDelCrimen Videoclub

**Autor:** Heber Paris Caamaño
**Repositorio:** https://github.com/webermuros1-oss/EscenaDelCRimenVideoclubBackendFinal.git

API REST desarrollada con Spring Boot para la gestión de un videoclub. Permite realizar operaciones CRUD sobre un catálogo de películas almacenado en una base de datos MySQL.

---

## Tecnologías utilizadas

- Java 25
- Spring Boot 4.0.5
- Spring Data JPA
- Spring Web MVC
- MySQL
- Maven

---

## Estructura del proyecto

```
src/
└── main/
    └── java/
        └── Inditex/EscenaDelCrimenVideoclub/App/
            ├── controller/
            │   └── MovieController.java
            ├── model/
            │   └── Movie.java
            ├── repository/
            │   └── MovieRepository.java
            ├── service/
            │   └── MovieService.java
            └── EscenaDelCrimenVideoclubApplication.java
```

---

## Configuración de la base de datos

Crea una base de datos MySQL llamada `escenaDelCrimen` y configura las credenciales en `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/escenaDelCrimen
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update

```

---

## Endpoints de la API

Base URL: `http://localhost:8080`

| Método | Endpoint                        | Descripción                        |
|--------|---------------------------------|------------------------------------|
| GET    | `/movies`                       | Obtener todas las películas        |
| GET    | `/movies/{id}`                  | Obtener una película por ID        |
| GET    | `/movies/ASC`                   | Obtener películas ordenadas por título (A-Z) |
| GET    | `/movies/category/{category}`   | Obtener películas por categoría    |
| POST   | `/movies`                       | Crear una nueva película           |
| PUT    | `/movies/{id}`                  | Actualizar una película por ID     |
| DELETE | `/movies/{id}`                  | Eliminar una película por ID       |

### Ejemplo de body para POST y PUT

```json
{
  "title": "El Padrino",
  "year": 1972,
  "director": "Francis Ford Coppola",
  "main_cast": "Marlon Brando",
  "filmaffinity_score": 9.0,
  "description": "Una familia mafiosa lucha por mantener su poder.",
  "img": "url_imagen",
  "url": "url_pelicula",
  "trailer": "url_trailer",
  "ranking": 1.0,
  "category": "Drama"
}
```

---

## Ejecución del proyecto

1. Clona el repositorio
2. Crea la base de datos `escenaDelCrimen` en MySQL
3. Configura las credenciales en `application.properties`
4. Ejecuta el proyecto con Maven:

```bash
mvn spring-boot:run
```

---

## CORS

La API permite peticiones desde `http://localhost:5173` (frontend Vite/React).

---

## Licencia

MIT License

Copyright (c) 2026 Heber Paris Caamaño

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.