FROM eclipse-temurin:21.0.4_7-jdk

#El expose es informativo, no hace nada
EXPOSE 8989

#define directorio raiz del contenedor
WORKDIR /root
COPY ./pom.xml /root
COPY ./.mvn /root/.mvn
COPY ./mvnw /root
#descarga las dependencias
RUN ./mvnw dependency:go-offline
COPY ./src /root/src
#construir la aplicación
RUN ./mvnw clean install -DskipTests

#Levantar la aplicación cuando el contenedor inicie
ENTRYPOINT [ "java","-jar","/root/target/SesionAnonima-0.0.1-SNAPSHOT.jar" ]
