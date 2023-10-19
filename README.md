# Introducción 

Proyecto de Api Rest con microservicios desplegados en un Servidor Eureka, Spring Cloud Gateway y RestTemplate.

# Iniciar el proyecto

Para iniciar el proyecto debe realizarse en el siguiente orden:

1. Iniciar eureka service
2. Iniciar artist service
3. Iniciar album service
4. Iniciar gateway service

# Endpoints artista

Para obtener la lista de artistas:
```
http://localhost:8090/artists
```
Para obtener un artista por el id:
```
http://localhost:8090/artists/{id}

Ej: http://localhost:8090/artists/3
```
Para eliminar un artista por el id:
```
http://localhost:8090/artists/{id}

Ej: http://localhost:8090/artists/3
```
# Endpoints album:

Para obtener la lista de albumes:
```
http://localhost:8090/albums
```
Para obtener un album por el id:
```
http://localhost:8090/albums/{id}

Ej: http://localhost:8090/albums/3
```
Para eliminar un album por el id:
```
http://localhost:8090/albums/{id}

Ej: http://localhost:8090/albums/3
```
