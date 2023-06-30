#### 1. Для работы сервиса необходима база postgres (host: localhost, port: 5432, user: postgres, pass: secret, database name: countryService)

```sql
create
database "countryService" with owner postgres;
```

Сервис имеет 2 вида запросов:
http://localhost:8080/api/country/*Код страны* - ищет страну по её коду

http://localhost:8080/api/countries - предоставляет полный список стран, хранящихся в БД