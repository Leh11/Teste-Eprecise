## Funcionalidade desenvolvidas
### Cidade
- [Ok] - Get com paginação; End-point "http://localhost:8080/api/state/findStateByPage"
- [Ok] - Post; End-point "http://localhost:8080/api/state"
- [Ok] - Put; End-point "http://localhost:8080/api/state/update?id=11"
- [Ok] - Delete; End-point "http://localhost:8080/api/state/deleteState?id=17"
- [Ok] - Get numero de registro; End-point "http://localhost:8080/api/state/amountState
- [ ] - Get cidade pelo nome / incompleta; End-point "http://localhost:8080/api/city/findCityByName?name=Limoeiro"

### Estado
- [Ok] - Get com paginação; End-point "http://localhost:8080/api/city/findCityByPage"
- [Ok] - Get numero de registro; End-point "http://localhost:8080/api/city/amountCity"
- [Ok] - Post; End-point "hhttp://localhost:8080/api/city"
- [Ok] - Put; End-point "http://localhost:8080/api/city/update?id=28"
- [Ok] - Delete; End-point "http://localhost:8080/api/city/deleteCity?id=18"

## Dificuldades
- Customização de PanacheQuery para recuperação de cidades a partir de 3 characters;
- Customização de PanacheQuery para recuperação de cidades pelo nome do estado;

