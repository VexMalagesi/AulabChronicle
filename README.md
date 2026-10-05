# The Aulab Chronicle

Progetto finale del corso Java di Aulab, fatto con Spring Boot, Thymeleaf e MySQL.
Le immagini degli articoli vengono salvate su Supabase e le email di prova arrivano su Mailtrap.

## Come avviarlo

1. Creare su MySQL il database `aulab_chronicle`
2. Lanciare gli script della cartella `sql` in questo ordine: `create.sql`, `insert.sql`, `createImageTable.sql`, `createCareerRequest.sql`, `alterTableArticle.sql`
3. Mettere in `application.properties` i propri dati di MySQL, Supabase e Mailtrap
4. Avviare l'applicazione e aprire http://localhost:8080

Utente admin: admin@aulab.it / 12345678
