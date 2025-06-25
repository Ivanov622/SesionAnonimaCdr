FROM eclipse-temurin:21.0.4_7-jdk

#El expose es informativo, no hace nada
EXPOSE 8089
HEALTHCHECK --interval=60s --retries=5 --start-period=5s --timeout=10s CMD wget --no-verbose --tries=1 --spider localhost:8089/actuator/health || exit 1

#define directorio raiz del contenedor
WORKDIR /app
COPY ./pom.xml /app
COPY ./.mvn /app/.mvn
COPY ./mvnw /app
#descarga las dependencias
RUN ./mvnw dependency:go-offline
COPY ./src /app/src
#construir la aplicación
RUN ./mvnw clean install -DskipTests

#Levantar la aplicación cuando el contenedor inicie
ENTRYPOINT [ "java","-jar","/app/target/SesionAnonima-0.0.1-SNAPSHOT.jar" ]
