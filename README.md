# twasstartissues

`twasstartissues` is a Java Enterprise Edition 6 web application for simulating diagnostic situations during startup.

Running this application in production should be done with care because it may be used to execute various powerful functions.

## Development

1. Java >= 8 is required on your `PATH`; for example, [IBM Semeru Runtimes](https://developer.ibm.com/languages/java/semeru-runtimes/downloads/)
1. Build:
    * macOS and Linux:
      ```
      ./mvnw clean install
      ```
    * Windows:
      ```
      mvnw clean install
      ```
1. Install `target/twasstartissues.war`
