FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw && sed -i 's/\r$//' mvnw

RUN ./mvnw clean package -DskipTests

CMD ["java","-jar","target/review-0.0.1-SNAPSHOT.jar"]