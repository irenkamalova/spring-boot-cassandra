# spring-boot-cassandra

Example of working with Cassandra usign Spring annotation.
`SpringBootApplication` helping to launch application.
After application start it creates `keyspace` defined in `application.properties` and table `Tweets`.

You can check data in Cassandra using consol and cqls syntax:

```bash
cqlsh:publisher> use tweets;
cqlsh:tweets> describe tables;

tweets

cqlsh:tweets> select * from tweets;

 id                                   | text
--------------------------------------+-----------------------------------------------
 23a5dcc1-7f63-4e4e-905d-bbee8be6b21a |                Apple released new OS in 2020!
 60eb0756-adbc-4ca3-944e-412e297df953 |        Google release new searching features!
 453c3598-6448-4c39-a6ec-6dde09a647de | Google released new design for icons in 2020!

```
