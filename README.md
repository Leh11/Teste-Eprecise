## Funcionalidade desenvolvidas
### Cidade
- [x] - Get com paginação; End-point "http://localhost:8080/api/state/findStateByPage"
- [x] - Post; End-point "http://localhost:8080/api/state"
- [x] - Put; End-point "http://localhost:8080/api/state/update?id=11"
- [x] - Delete; End-point "http://localhost:8080/api/state/deleteState?id=17"
- [x] - Get numero de registro; End-point "http://localhost:8080/api/state/amountState
- [ ] - Get cidade pelo nome / incompleta; End-point "http://localhost:8080/api/city/findCityByName?name=Limoeiro"

### Estado
- [x] - Get com paginação; End-point "http://localhost:8080/api/city/findCityByPage"
- [x] - Get numero de registro; End-point "http://localhost:8080/api/city/amountCity"
- [x] - Post; End-point "hhttp://localhost:8080/api/city"
- [x] - Put; End-point "http://localhost:8080/api/city/update?id=28"
- [x] - Delete; End-point "http://localhost:8080/api/city/deleteCity?id=18"

## Dificuldades
- Customização de PanacheQuery para recuperação de cidades a partir de 3 characters;
- Customização de PanacheQuery para recuperação de cidades pelo nome do estado;

