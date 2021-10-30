# Project87

Ticket booking

## HSQL DB

1. Download HSQLDB bundle <http://hsqldb.org/> (<https://sourceforge.net/projects/hsqldb/files/hsqldb/hsqldb_2_6/hsqldb-2.6.0.zip/download>)
2. Run the command below to create the db.
   java -cp lib/hsqldb.jar org.hsqldb.server.Server --database.0 file:data/mydb --dbname.0 mydb
3. To connect to the DB via UI
   java -cp lib/hsqldb.jar org.hsqldb.util.DatabaseManagerSwing
   jdbc:hsqldb:hsql://localhost:9001/mydb
   user: SA
   pwd:

### Dev

To Run UI in DEV mode

```bash
cd project81/ui
yarn install
yarn build
yarn start
```

To Run backend in DEV mode

```bash
cd project81
./gradlew bootRun
```

Open [http://localhost:4200](http://localhost:4200) to view it in the browser.

```
user: admin
pwd: admin@123
```

### Prod
To run as a single jar, both UI and backend are bundled to single uber jar.

```bash
./gradlew cleanBuild
cd project81/build/libs
java -jar project81-1.0.0.jar
```

Open [http://localhost:8080](http://localhost:8080) to view it in the browser.

```
user: admin
pwd: admin@123
```

## Advanced Topics

@Input - Parent to child communication.

@Output - Child to parent communication. EventEmitter.

Pipes - Custom Pipe

HTTP error handling

Route parameters - ActivatedRoute.

Nested routes - children, router-outlet.

Named router outlet.

