link til codereview: https://github.com/kristiania-pgr209-2022/pgr209-2-krolleone/pull/1/files

# Innlevering 2: Programmeringsferdigheter

## Oppgave

Dere skal lage en Jetty-server som kan starte en React applikasjon og som benytter JAX-RS med Jersey for å behandle en GET request og en POST request. Applikasjonen skal være en webshop som kan registrere og liste varer i en nettbutikk.

## Innlevering

Dere skal jobbe i grupper på 4 eller 6. Dere kan benytte gruppene fra innlevering 1, finne gruppe selv eller be om å bli tildelt en gruppe. Hver gruppe skal internt fordele seg i par som skal levere sammen. Alle skal utføre code review for de andre parene. Code review skal utføres på Feedback-branchen.

Innleveringen skal leveres på Canvas med link til GitHub-repository. Begge skal levere i Canvas (med link til samme repository).

Når dere oppretter repository via Github Classroom linken på Canvas, vil det automatisk opprettes en pull request med navn "feedback". Hver par innenfor en gruppe skal utføre en code review på det andre parets kode på denne pull requesten.

## Krav til innlevering

* Programmet
  * [x] En main metode som starter Jetty-serveren med Jersey sin ContentServlet og et Endpoint
  * [x] En React applikasjon under src/main/<something> som bygger til src/main/resources med Vite eller Parcel
  * [x] En JUnit test som sjekker GET
  * [x] En JUnit test som sjekker POST
  * [ ] Valgfritt - vi lærer dette neste tirsdag: Automatisk bygging av React-applikasjonen med frontend-maven-plugin
  * [ ] Valgfritt - forutsetter forrige steg: JUnit test som sjekker at title på index.html er korrekt
* Innlevering
  * [ ] Begge har levert link til Github Repository i Canvas
  * [x] Koden er sjekket inn på et repository på https://github.com/kristiania-pgr209-2021
  * [x] GitHub repository er private. Dere skal gi tilgang til de som gir code review
* Github
  * [x] Dere har merget pull en pull request
  * [x] Dere har mottatt code review fra medstudenter på feedback-pull request
  * [x] `.idea`, `*.iml` og `target` er lagt til i .gitignore og ikke sjekket inn
  * [x] Github Actions rapporterer at 100% av testene kjører grønt
* Kode
  * [x] Koden skal være korrekt strukturert etter Maven sine standarder (koden skal ligge under `src/main/java` og tester under `src/test/java`)
  * [x] Klassene skal ligge i Java packages
  * [x] Klassenavn, pakkenavn, metodenavn og variabelnavn skal følge Java-konvensjoner når det gjelder små og store bokstaver
  * [x] Koden skal være korrekt indentert
  * [ ] Dersom dere har valgt en stor oppgave behøver dere ikke løse hele. 6-7 tester er tilstrekkelig
* README-fil
  * [x] Korrekt GitHub Actions status badge
  * [x] Link til code review dere har gjort for medstudenter med minst én issue fra hver av dere
