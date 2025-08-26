# Yu-Gi-Oh! Deck Manager API

Uma API REST para gerenciar decks de cartas de Yu-Gi-Oh!, permitindo criar, consultar e gerenciar cartas e decks.

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (banco em memória)
- Lombok
- Spring Boot DevTools

## Endpoints

### Cartas

- `GET /cards` - Lista todas as cartas
- `GET /cards/{id}` - Consulta detalhes de uma carta
- `POST /cards` - Cria uma nova carta

Exemplo de request para criar uma carta(ex: teste em postman):

GET 
```
http://localhost:8080/cards
```
POST
```
http://localhost:8080/cards
```
body(exemplo):
```
{
  "name": "Dark Magician",
  "type": "Monster",
  "attribute": "Dark",
  "attack": 2500,
  "defense": 2100
}
```
